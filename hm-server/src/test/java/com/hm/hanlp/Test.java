package com.hm.hanlp;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLSentence;
import com.hankcs.hanlp.corpus.dependency.CoNll.CoNLLWord;
import com.hankcs.hanlp.dictionary.BaseSearcher;
import com.hankcs.hanlp.dictionary.CoreSynonymDictionary;
import com.hankcs.hanlp.dictionary.CustomDictionary;
import com.hankcs.hanlp.dictionary.py.Pinyin;
import com.hankcs.hanlp.seg.CRF.CRFSegment;
import com.hankcs.hanlp.seg.Dijkstra.DijkstraSegment;
import com.hankcs.hanlp.seg.NShort.NShortSegment;
import com.hankcs.hanlp.seg.Segment;
import com.hankcs.hanlp.seg.common.Term;
import com.hankcs.hanlp.suggest.Suggester;
import com.hankcs.hanlp.tokenizer.IndexTokenizer;
import com.hankcs.hanlp.tokenizer.NLPTokenizer;
import com.hankcs.hanlp.tokenizer.SpeedTokenizer;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * http://www.hankcs.com/nlp/hanlp.html
 * <p>
 * http://hanlp.dksou.com/HanLP.html
 */
public class Test {


    @org.junit.Test
    public void demo01() {
        char[] chars = "你好，世界！".toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }
    }

    /**
     * 标准分词
     * HanLP中有一系列“开箱即用”的静态分词器，以Tokenizer结尾，在接下来的例子中会继续介绍。
     * HanLP.segment其实是对StandardTokenizer.segment的包装。
     * 分词结果包含词性，每个词性的意思请查阅《HanLP词性标注集》。
     */
    @org.junit.Test
    public void demo02() {
        List<Term> segment = HanLP.segment("你好，欢迎使用HanLP汉语处理包！");
        for (Term term : segment) {
            System.out.println(term.word);
        }
    }

    /**
     * NLP分词
     * NLP分词NLPTokenizer会执行全部命名实体识别和词性标注
     */
    @org.junit.Test
    public void nlpDemo() {
        List<Term> termList = NLPTokenizer.segment("中国科学院计算技术研究所的宗成庆教授正在教授自然语言处理课程");
        System.out.println(termList);
    }

    /**
     * 索引分词
     * 索引分词IndexTokenizer是面向搜索引擎的分词器，能够对长词全切分，另外通过term.offset可以获取单词在文本中的偏移量。
     */
    @org.junit.Test
    public void indexTermDemo() {
        //会加载自定义词典
        List<Term> termList = IndexTokenizer.segment("主副食品 北京小米科技有限公司");
        for (Term term : termList) {
            System.out.println(term + " [" + term.offset + ":" + (term.offset + term.word.length()) + "]");
        }
    }

    /**
     * N-最短路径分词
     * N最短路分词器NShortSegment比最短路分词器慢，但是效果稍微好一些，对命名实体识别能力更强。
     * 一般场景下最短路分词的精度已经足够，而且速度比N最短路分词器快几倍，请酌情选择
     */
    @org.junit.Test
    public void mostShort() {
        Segment nShortSegment = new NShortSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
        Segment shortestSegment = new DijkstraSegment().enableCustomDictionary(false).enablePlaceRecognize(true).enableOrganizationRecognize(true);
        String[] arrays = new String[]{
                "今天，刘志军案的关键人物,山西女商人丁书苗在市二中院出庭受审。",
                "刘喜杰石国祥会见吴亚琴先进事迹报告团成员",
                "胡文俭和刘晶结婚了"
        };
        //N-最短路径
        Arrays.stream(arrays).forEach(array -> System.out.println(nShortSegment.seg(array)));
        //最短路分词
        Arrays.stream(arrays).forEach(array -> System.out.println(shortestSegment.seg(array)));
    }

    /**
     * CRF分词(在最新训练的未压缩100MB模型下，能够取得较好的效果，可以投入生产环境)
     * CRF对新词有很好的识别能力，但是无法利用自定义词典
     * 好像可以用自定义词典
     */
    @org.junit.Test
    public void DemoCRFSegment() {
//        HanLP.Config.ShowTermNature = false;    // 关闭词性显示
        Segment segment = new CRFSegment();
        String[] sentenceArray = new String[]
                {
                        "HanLP是由一系列模型与算法组成的Java工具包，目标是普及自然语言处理在生产环境中的应用。",
                        "鐵桿部隊憤怒情緒集結 馬英九腹背受敵",           // 繁体无压力
                        "馬英九回應連勝文“丐幫說”：稱黨內同志談話應謹慎",
                        "高锰酸钾，强氧化剂，紫红色晶体，可溶于水，遇乙醇即被还原。常用作消毒剂、水净化剂、氧化剂、漂白剂、毒气吸收剂、二氧化碳精制剂等。", // 专业名词有一定辨识能力
                        "《夜晚的骰子》通过描述浅草的舞女在暗夜中扔骰子的情景,寄托了作者对庶民生活区的情感",    // 非新闻语料
                        "这个像是真的[委屈]前面那个打扮太江户了，一点不上品...@hankcs",                       // 微博
                        "鼎泰丰的小笼一点味道也没有...每样都淡淡的...淡淡的，哪有食堂2A的好次",
                        "克里斯蒂娜·克罗尔说：不，我不是虎妈。我全家都热爱音乐，我也鼓励他们这么做。",
                        "今日APPS：Sago Mini Toolbox培养孩子动手能力",
                        "财政部副部长王保安调任国家统计局党组书记",
                        "2.34米男子娶1.53米女粉丝 称夫妻生活没问题",
                        "你看过穆赫兰道吗",
                        "乐视超级手机能否承载贾布斯的生态梦",
                        "北京小米科技责任有限公司董事长胡文俭先生以及胡文件先生"
                };
        for (String sentence : sentenceArray) {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList.toString());
        }
    }

    /**
     * 极速词典分词
     * 极速分词是词典最长分词，速度极其快，精度一般
     */
    @org.junit.Test
    public void DemoHighSpeedSegment() {
        String text = "江西鄱阳湖干枯，中国最大淡水湖变成大草原我们在前一章中学到，流可以用类似于数据库的操作帮助你处理集合。你可以把Java8的流\n" +
                "北京小米科技责任有限公司董事长胡文俭先生以及胡文件先生";
        System.out.println(SpeedTokenizer.segment(text));
        long start = System.currentTimeMillis();
        int pressure = 1000000;
        for (int i = 0; i < pressure; ++i) {
            SpeedTokenizer.segment(text);
        }
        double costTime = (System.currentTimeMillis() - start) / (double) 1000;
        System.out.printf("分词速度：%.2f字每秒", text.length() * pressure / costTime);
    }


    /**
     * 用户自定义词典
     * CustomDictionary是一份全局的用户自定义词典，可以随时增删，影响全部分词器。
     * 另外可以在任何分词器中关闭它。通过代码动态增删不会保存到词典文件。
     * 追加词典
     * CustomDictionary主词典文本路径是data/dictionary/custom/CustomDictionary.txt，用户可以在此增加自己的词语（不推荐）；也可以单独新建一个文本文件，通过配置文件CustomDictionaryPath=data/dictionary/custom/CustomDictionary.txt; 我的词典.txt;来追加词典（推荐）。*
     * 始终建议将相同词性的词语放到同一个词典文件里，便于维护和分享。
     * 词典格式
     * <p>
     * 每一行代表一个单词，格式遵从[单词] [词性A] [A的频次] [词性B] [B的频次] ... 如果不填词性则表示采用词典的默认词性。
     * <p>
     * 词典的默认词性默认是名词n，可以通过配置文件修改：全国地名大全.txt ns;如果词典路径后面空格紧接着词性，则该词典默认是该词性。
     * <p>
     * 关于用户词典的更多信息请参考词典说明一章。
     */
    @org.junit.Test
    public void DemoCustomDictionary() {
        // 动态增加
        CustomDictionary.add("攻城狮");
        // 强行插入
        CustomDictionary.insert("白富美", "nz 1024");
        // 删除词语（注释掉试试）
//        CustomDictionary.remove("攻城狮");
        System.out.println(CustomDictionary.add("单身狗", "nz 1024 n 1"));
        System.out.println(CustomDictionary.get("单身狗"));

        String text = "攻城狮逆袭单身狗，迎娶白富美，走上人生巅峰 小米科技有限公司胡文俭董事长";  // 怎么可能噗哈哈！

        // DoubleArrayTrie分词
        final char[] charArray = text.toCharArray();
        CustomDictionary.parseText(charArray, (begin, end, value) -> System.out.printf("[%d:%d]=%s %s\n", begin, end, new String(charArray, begin, end - begin), value));
        // 首字哈希之后二分的trie树分词
        BaseSearcher searcher = CustomDictionary.getSearcher(text);
        Map.Entry entry;
        while ((entry = searcher.next()) != null) {
            System.out.println(entry);
        }
        // 标准分词
        System.out.println(HanLP.segment(text));

        // Note:动态增删不会影响词典文件
        // 目前CustomDictionary使用DAT储存词典文件中的词语，用BinTrie储存动态加入的词语，前者性能高，后者性能低
        // 之所以保留动态增删功能，一方面是历史遗留特性，另一方面是调试用；未来可能会去掉动态增删特性。
    }

    /**
     * ==》这个分词没有将胡文件作为姓名分出来
     * 目前分词器基本上都默认开启了中国人名识别，比如HanLP.segment()接口中使用的分词器等等，用户不必手动开启；上面的代码只是为了强调。
     * 有一定的误命中率，比如误命中关键年，则可以通过在data/dictionary/person/nr.txt加入一条关键年 A 1来排除关键年作为人名的可能性，也可以将关键年作为新词登记到自定义词典中。
     * 如果你通过上述办法解决了问题，欢迎向我提交pull request，词典也是宝贵的财富。
     */
    @org.junit.Test
    public void chineseName() {
        String[] testCase = new String[]{
                "签约仪式前，秦光荣、李纪恒、仇和等一同会见了参加签约的企业家。",
                "王国强、高峰、汪洋、张朝阳光着头、韩寒、小四",
                "张浩和胡健康复员回家了",
                "王总和小丽结婚了",
                "编剧邵钧林和稽道青说",
                "这里有关天培的有关事迹",
                "龚学平等领导,邓颖超生前",
                "胡文件 胡文俭 胡文舰 科技"
        };
        Segment segment = HanLP.newSegment().enableNameRecognize(true);
        for (String sentence : testCase) {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }
    }

    @org.junit.Test
    public void yinYiName() {
        String[] testCase = new String[]{
                "一桶冰水当头倒下，微软的比尔盖茨、Facebook的扎克伯格跟桑德博格、亚马逊的贝索斯、苹果的库克全都不惜湿身入镜，这些硅谷的科技人，飞蛾扑火似地牺牲演出，其实全为了慈善。",
                "世界上最长的姓名是简森·乔伊·亚历山大·比基·卡利斯勒·达夫·埃利奥特·福克斯·伊维鲁莫·马尔尼·梅尔斯·帕特森·汤普森·华莱士·普雷斯顿。",
        };
        Segment segment = HanLP.newSegment().enableTranslatedNameRecognize(true);
        for (String sentence : testCase) {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }
    }

    /**
     * 目前标准分词器默认关闭了日本人名识别，用户需要手动开启；这是因为日本人名的出现频率较低，但是又消耗性能。
     */
    @org.junit.Test
    public void japanName() {
        String[] testCase = new String[]{
                "北川景子参演了林诣彬导演的《速度与激情3》",
                "林志玲亮相网友:确定不是波多野结衣？",
        };
        Segment segment = HanLP.newSegment().enableJapaneseNameRecognize(true);
        for (String sentence : testCase) {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }
    }

    /**
     * 目前标准分词器都默认关闭了地名识别，用户需要手动开启；这是因为消耗性能，其实多数地名都收录在核心词典和用户自定义词典中。
     * 在生产环境中，能靠词典解决的问题就靠词典解决，这是最高效稳定的方法
     */
    @org.junit.Test
    public void placeName() {
        String[] testCase = new String[]{
                "武胜县新学乡政府大楼门前锣鼓喧天",
                "蓝翔给宁夏固原市彭阳县红河镇黑牛沟村捐赠了挖掘机",
        };
        Segment segment = HanLP.newSegment().enablePlaceRecognize(true);
        for (String sentence : testCase) {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }
    }

    /**
     * 目前分词器默认关闭了机构名识别，用户需要手动开启；这是因为消耗性能，其实常用机构名都收录在核心词典和用户自定义词典中。
     * HanLP的目的不是演示动态识别，在生产环境中，能靠词典解决的问题就靠词典解决，这是最高效稳定的方法。
     */
    @org.junit.Test
    public void nisName() {
        String[] testCase = new String[]{
                "我在上海林原科技有限公司兼职工作，",
                "我经常在台川喜宴餐厅吃饭，",
                "偶尔去地中海影城看电影。",
                "我在小米科技有限公司上班"
        };
        Segment segment = HanLP.newSegment().enableOrganizationRecognize(true);
        for (String sentence : testCase) {
            List<Term> termList = segment.seg(sentence);
            System.out.println(termList);
        }
    }

    /**
     * 关键字提取
     * 内部采用TextRankKeyword实现，用户可以直接调用TextRankKeyword.getKeywordList(document, size)
     */
    @org.junit.Test
    public void keyWord() {
        String content = "程序员(英文Programmer)是从事程序开发、维护的专业人员。" +
                "一般将程序员分为程序设计人员和程序编码人员，但两者的界限并不非常清楚，特别是在中国。" +
                "软件从业人员分为初级程序员、高级程序员、系统分析员和项目经理四大类。";
        List<String> keywordList = HanLP.extractKeyword(content, 5);
        System.out.println(keywordList);
    }

    /**
     * 自动摘要
     * 内部采用TextRankSentence实现，用户可以直接调用TextRankSentence.getTopSentenceList(document, size)
     */
    @org.junit.Test
    public void ziDongZHAIYao() {
        String document = "前一个例子清楚地展示了函数式编程相对于指令式编程的一个主要优势：你只需指出希望的\n" +
                "结果——“做什么”，而不用操心执行的步骤——“如何做”。在上一个例子里，传递给 collect\n" +
                "方法的参数是 Collector 接口的一个实现，也就是给 Stream 中元素做汇总的方法。上一章里的\n" +
                "toList 只是说“按顺序给每个元素生成一个列表”；在本例中， groupingBy 说的是“生成一个\n" +
                "Map ，它的键是（货币）桶，值则是桶中那些元素的列表”。\n" +
                "要是做多级分组，指令式和函数式之间的区别就会更加明显：由于需要好多层嵌套循环和条\n" +
                "件，指令式代码很快就变得更难阅读、更难维护、更难修改。相比之下，函数式版本只要再加上\n" +
                "一个收集器就可以轻松地增强功能了，你会在6.3节中看到它";
        List<String> sentenceList = HanLP.extractSummary(document, 3);
        System.out.println(sentenceList);
    }

    /**
     * 短语提取
     * 内部采用MutualInformationEntropyPhraseExtractor实现
     * 用户可以直接调用MutualInformationEntropyPhraseExtractor..extractPhrase(text, size)
     */
    @org.junit.Test
    public void phrase() {
        String text = "算法工程师\n" +
                "算法（Algorithm）是一系列解决问题的清晰指令，也就是说，能够对一定规范的输入，在有限时间内获得所要求的输出。" +
                "如果一个算法有缺陷，或不适合于某个问题，执行这个算法将不会解决这个问题。不同的算法可能用不同的时间、" +
                "空间或效率来完成同样的任务。一个算法的优劣可以用空间复杂度与时间复杂度来衡量。算法工程师就是利用算法处理事物的人。\n" +
                "\n" +
                "1职位简介\n" +
                "算法工程师是一个非常高端的职位；\n" +
                "专业要求：计算机、电子、通信、数学等相关专业；\n" +
                "学历要求：本科及其以上的学历，大多数是硕士学历及其以上；\n" +
                "语言要求：英语要求是熟练，基本上能阅读国外专业书刊；\n" +
                "必须掌握计算机相关知识，熟练使用仿真工具MATLAB等，必须会一门编程语言。\n" +
                "\n" +
                "2研究方向\n" +
                "视频算法工程师、图像处理算法工程师、音频算法工程师 通信基带算法工程师\n" +
                "\n" +
                "3目前国内外状况\n" +
                "目前国内从事算法研究的工程师不少，但是高级算法工程师却很少，是一个非常紧缺的专业工程师。" +
                "算法工程师根据研究领域来分主要有音频/视频算法处理、图像技术方面的二维信息算法处理和通信物理层、" +
                "雷达信号处理、生物医学信号处理等领域的一维信息算法处理。\n" +
                "在计算机音视频和图形图像技术等二维信息算法处理方面目前比较先进的视频处理算法：机器视觉成为此类算法研究的核心；" +
                "另外还有2D转3D算法(2D-to-3D conversion)，去隔行算法(de-interlacing)，运动估计运动补偿算法" +
                "(Motion estimation/Motion Compensation)，去噪算法(Noise Reduction)，缩放算法(scaling)，" +
                "锐化处理算法(Sharpness)，超分辨率算法(Super Resolution),手势识别(gesture recognition),人脸识别(face recognition)。\n" +
                "在通信物理层等一维信息领域目前常用的算法：无线领域的RRM、RTT，传送领域的调制解调、信道均衡、信号检测、网络优化、信号分解等。\n" +
                "另外数据挖掘、互联网搜索算法也成为当今的热门方向。\n" +
                "算法工程师逐渐往人工智能方向发展。";
        List<String> phraseList = HanLP.extractPhrase(text, 5);
        System.out.println(phraseList);
    }

    /**
     * HanLP不仅支持基础的汉字转拼音，还支持声母、韵母、音调、音标和输入法首字母首声母功能。
     * HanLP能够识别多音字，也能给繁体中文注拼音。
     * 最重要的是，HanLP采用的模式匹配升级到AhoCorasickDoubleArrayTrie，性能大幅提升，能够提供毫秒级的响应速度！
     */
    @org.junit.Test
    public void pinyinDemo() {
        String text = "重载不是重任";
        List<Pinyin> pinyinList = HanLP.convertToPinyinList(text);
        System.out.print("原文,");
        for (char c : text.toCharArray()) {
            System.out.printf("%c,", c);
        }
        System.out.println();
        System.out.print("拼音（数字音调）,");
        for (Pinyin pinyin : pinyinList) {
            System.out.printf("%s,", pinyin);
        }
        System.out.println();
        System.out.print("拼音（符号音调）,");
        for (Pinyin pinyin : pinyinList) {
            System.out.printf("%s,", pinyin.getPinyinWithToneMark());
        }
        System.out.println();
        System.out.print("拼音（无音调）,");
        for (Pinyin pinyin : pinyinList) {
            System.out.printf("%s,", pinyin.getPinyinWithoutTone());
        }
        System.out.println();
        System.out.print("声调,");
        for (Pinyin pinyin : pinyinList) {
            System.out.printf("%s,", pinyin.getTone());
        }
        System.out.println();
        System.out.print("声母,");
        for (Pinyin pinyin : pinyinList) {
            System.out.printf("%s,", pinyin.getShengmu());
        }
        System.out.println();
        System.out.print("韵母,");
        for (Pinyin pinyin : pinyinList) {
            System.out.printf("%s,", pinyin.getYunmu());
        }
        System.out.println();
        System.out.print("输入法头,");
        for (Pinyin pinyin : pinyinList) {
            System.out.printf("%s,", pinyin.getHead());
        }
        System.out.println();
    }

    /**
     * 简繁转换
     * HanLP能够识别简繁分歧词，比如打印机=印表機。许多简繁转换工具不能区分“以后”“皇后”中的两个“后”字，HanLP可以。
     */
    @org.junit.Test
    public void DemoTraditionalChinese2SimplifiedChinese() {
        System.out.println(HanLP.convertToTraditionalChinese("用笔记本电脑写程序 孙燕姿"));
        System.out.println(HanLP.convertToSimplifiedChinese("「以後等妳當上皇后，就能買士多啤梨慶祝了」"));

    }

    /**
     * 文本推荐(句子级别，从一系列句子中挑出与输入句子最相似的那一个)
     * 在搜索引擎的输入框中，用户输入一个词，搜索引擎会联想出最合适的搜索词，HanLP实现了类似的功能。
     * 可以动态调节每种识别器的权重
     */
    @org.junit.Test
    public void DemoSuggester() {
        Suggester suggester = new Suggester();
        String[] titleArray =
                (
                        "威廉王子发表演说 呼吁保护野生动物\n" +
                                "《时代》年度人物最终入围名单出炉 普京马云入选\n" +
                                "“黑格比”横扫菲：菲吸取“海燕”经验及早疏散\n" +
                                "日本保密法将正式生效 日媒指其损害国民知情权\n" +
                                "英报告说空气污染带来“公共健康危机”\n" +
                                "北京小米科技责任有限公司\n" +
                                "北京米科技责任有限公司"
                ).split("\\n");
        for (String title : titleArray) {
            suggester.addSentence(title);
        }
        System.out.println(suggester.suggest("演讲", 1));       // 语义
        System.out.println(suggester.suggest("危机公共", 1));   // 字符
        System.out.println(suggester.suggest("mayun", 1));      // 拼音
        System.out.println(suggester.suggest("北京", 1));      // 拼音
    }

    /**
     * 语义距离
     * 说明
     * 设想的应用场景是搜索引擎对词义的理解，词与词并不只存在“同义词”与“非同义词”的关系，就算是同义词，它们之间的意义也是有微妙的差别的。
     * 算法
     * 为每个词分配一个语义ID，词与词的距离通过语义ID的差得到。语义ID通过《同义词词林扩展版》计算而来。
     */
    @org.junit.Test
    public void DemoWordDistance() {
        String[] wordArray = new String[]
                {
                        "香蕉",
                        "苹果",
                        "白菜",
                        "水果",
                        "蔬菜",
                        "自行车",
                        "公交车",
                        "飞机",
                        "买",
                        "卖",
                        "购入",
                        "新年",
                        "春节",
                        "节日",
                        "丢失",
                        "补办",
                        "办理",
                        "送给",
                        "寻找",
                        "孩子",
                        "教室",
                        "教师",
                        "会计",
                };
        for (String a : wordArray) {
            for (String b : wordArray) {
                System.out.println(a + "\t" + b + "\t之间的距离是\t" + CoreSynonymDictionary.distance(a, b));
            }
        }
    }


    /**
     * 依存句法分析（神经网络句法模型需要-Xms1g -Xmx1g -Xmn512m）
     * 内部采用NeuralNetworkDependencyParser实现，用户可以直接调用NeuralNetworkDependencyParser.compute(sentence)
     * 也可以调用基于MaxEnt的依存句法分析器MaxEntDependencyParser.compute(sentence)
     */
    @org.junit.Test
    public void DemoDependencyParser() {
        CoNLLSentence sentence = HanLP.parseDependency("徐先生还具体帮助他确定了把画雄鹰、松鼠和麻雀作为主攻目标。");
        System.out.println(sentence);
        // 可以方便地遍历它
        for (CoNLLWord word : sentence) {
            System.out.printf("%s --(%s)--> %s\n", word.LEMMA, word.DEPREL, word.HEAD.LEMMA);
        }
        // 也可以直接拿到数组，任意顺序或逆序遍历
        CoNLLWord[] wordArray = sentence.getWordArray();
        for (int i = wordArray.length - 1; i >= 0; i--) {
            CoNLLWord word = wordArray[i];
            System.out.printf("%s --(%s)--> %s\n", word.LEMMA, word.DEPREL, word.HEAD.LEMMA);
        }
        // 还可以直接遍历子树，从某棵子树的某个节点一路遍历到虚根
        CoNLLWord head = wordArray[12];
        while ((head = head.HEAD) != null) {
            if (head == CoNLLWord.ROOT) System.out.println(head.LEMMA);
            else System.out.printf("%s --(%s)--> ", head.LEMMA, head.DEPREL);
        }
    }

    /**
     * Query改写
     * https://github.com/hankcs/hanlp-lucene-plugin
     */
    @org.junit.Test
    public void queryChange() throws IOException {
//        String text = "中华人民共和国很辽阔";
//        for (int i = 0; i < text.length(); ++i)
//        {
//            System.out.print(text.charAt(i) + "" + i + " ");
//        }
//        System.out.println();
//        Analyzer analyzer = new HanLPAnalyzer();
//        TokenStream tokenStream = analyzer.tokenStream("field", text);
//            tokenStream.reset();
//        while (tokenStream.incrementToken())
//        {
//            CharTermAttribute attribute = tokenStream.getAttribute(CharTermAttribute.class);
//            // 偏移量
//            OffsetAttribute offsetAtt = tokenStream.getAttribute(OffsetAttribute.class);
//            // 距离
//            PositionIncrementAttribute positionAttr = tokenStream.getAttribute(PositionIncrementAttribute.class);
//            // 词性
//            TypeAttribute typeAttr = tokenStream.getAttribute(TypeAttribute.class);
//            System.out.printf("[%d:%d %d] %s/%s\n", offsetAtt.startOffset(), offsetAtt.endOffset(), positionAttr.getPositionIncrement(), attribute, typeAttr.type());
//        }
    }

}
