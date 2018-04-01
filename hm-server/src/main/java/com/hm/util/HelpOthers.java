package com.hm.util;

public class HelpOthers {



    public static void main(String[] args) {
        String[] results = txt.split("\n");

        String result = "";
        for (int i = 0;i<results.length;i++) {
            String everyLine = results[i];
            String timu = "";
            String xuanxiang = "";
            String daan = "";

            //取题目的（位置）
            if(everyLine.length()>1 && Character.isDigit(everyLine.charAt(0))){
                timu = everyLine;

            }
            if(everyLine.startsWith("A") || everyLine.startsWith("B")|| everyLine.startsWith("C")|| everyLine.startsWith("D")){
                xuanxiang = everyLine;
                if(everyLine.contains("正确答案：")){
                    daan = everyLine.split("正确答案：")[1];
                    timu.replace("\\(","("+daan);
                }


                result +=timu+"\n";
                result += xuanxiang;

            }
            System.out.println(result);
        }



    }
     static String txt = "1、  搞好设备管理工作，必须坚持专管与(   )相结合。 \n" +
            "\n" +
            "A.专用    B.主管   C.专保养 D.群管       正确答案：B\n" +
            "\n" +
            "2、(   )种焊剂是目前国内生产中应用最多的一种焊剂。\n" +
            "\n" +
            "A.粘接焊剂  B.烧结焊剂 C.熔炼焊剂                 正确答案：C\n" +
            "\n" +
            "3、(   )变形对结构影响较小同时也易于矫正  \n" +
            "\n" +
            "A.弯曲  B.整体C.局部 D.波浪                 正确答案：C\n" +
            "\n" +
            "4、(   )不是产生未焊透的原因。\n" +
            "\n" +
            "A.焊接坡口钝边太大，装配间隙太小 B.焊条熔化太快   \n" +
            "\n" +
            "C.焊条角度不合适，电弧偏吹      D.焊接时采用短弧焊    正确答案：D\n" +
            "\n" +
            "5、(   )清洗剂是机修作业中广泛采用的清洗剂。  \n" +
            "\n" +
            "A.油剂   B.水剂   C.化学    D.雾状               正确答案：B\n" +
            "\n" +
            "6、(   )缺陷对焊接接头危害性最严重。 \n" +
            "\n" +
            "A.气孔   B.夹渣    C.夹钨   D.氢致裂纹            正确答案：D\n" +
            "\n" +
            "7、(   )是影响焊缝宽度的主要因素。   \n" +
            "\n" +
            "A.焊接电流    B.电弧电压    C.焊接速度    D.焊丝直径      正确答案：B\n" +
            "\n" +
            "8、(   )是指已使用的设备，两次相邻大修之间设备的工作时间；对新投产的设备，指从投产时起到第一次大修设备的工作时间。\n" +
            "\n" +
            "A.设备工作期     B.设备寿命 C.设备停歇期  D.检修周期       正确答案：D\n" +
            "\n" +
            "9、(   )适用于两平行轴之间的传动。   \n" +
            "\n" +
            "A.圆锥齿轮    B.蜗杆、蜗轮  C.圆柱齿轮                  正确答案：C\n" +
            "\n" +
            "10、(   )适用于一般介质的各种机械设备中。 \n" +
            "\n" +
            "A.矩形橡胶垫圈 B.油封皮垫圈  C.油封纸垫片  D.其他材质垫片   正确答案：A\n" +
            "\n" +
            "11、0.02mm游标卡尺的游标上，第50格刻线与尺身上(   )mm刻线对齐。  \n" +
            "\n" +
            "A.49   B.39   C.19                               正确答案：A\n" +
            "\n" +
            "12、10KV带电体正常工作时的安全距离为(   )。  \n" +
            "\n" +
            "A.0.5米    B.0.7米    C.0.9米  D.1.2米             正确答案：B\n" +
            "\n" +
            "13、16Mn钢焊接时焊条应选用（  ）。\n" +
            "\n" +
            "A.E4315  B.E5015  C.E5515-G    D. E6015-D1      正确答案：B\n" +
            "\n" +
            "14、16Mn钢在（ ）焊接时应进行适当预热\n" +
            "\n" +
            "A.小厚度结构   B.常温条件下  C.低温条件下  D.小细性结构    正确答案：C\n" +
            "\n" +
            "15、16Mn钢属于(    )。\n" +
            "\n" +
            "A.Q295    B.Q345   C.Q390   D.Q420      正确答案：B\n" +
            "\n" +
            "16、CO2焊的焊丝伸出长度通常取决于(  )。\n" +
            "\n" +
            "A.焊丝直径    B.焊接电流    C.电弧电压    D.焊接速度     正确答案：A\n" +
            "\n" +
            "17、CO2焊用的CO2气瓶采用电热预热器时电压应低于(  ) 。\n" +
            "\n" +
            "A.60V    B.36V    C.12V    D.6V                   正确答案：B\n" +
            "\n" +
            "18、CO2气瓶的外表涂成(  )。\n" +
            "\n" +
            "A.白色      B.银灰色      C.天蓝色      D.铝白色      正确答案：D\n" +
            "\n" +
            "19、E4303、E5003属于 （  ）种药皮类型的焊条。\n" +
            "\n" +
            "A.钛钙型  B.钛铁矿型    C.铁氢钠型    D.低氢钾型    正确答案：A\n" +
            "\n" +
            "20、E4315、E5015属于 （  ）种药皮类型的焊条。\n" +
            "\n" +
            "A.钛钙型  B.钛铁矿型    C.铁氢钠型    D.低氢钾型    正确答案：C\n" +
            "\n" +
            "21、E4316、E5016焊条焊接时焊接电流为（ ）。正确答案：C\n" +
            "\n" +
            "A.交流或直流正接、反接  B.直流正接  C.交流或直流反接     D.交流或直流正接          \n" +
            "\n" +
            "22、E4316、E5016属于（  ）种药皮类型的焊条。\n" +
            "\n" +
            "A.钛钙型  B.钛铁矿型    C.铁氢钠型    D.低氢钾型    正确答案：D\n" +
            "\n" +
            "23、E5015焊条要求采用(  )。\n" +
            "\n" +
            "A.交流电源  B.直流正接  C.直流反接   D.脉冲电源  正确答案：C\n" +
            "\n" +
            "24、E5015焊条属(   )  \n" +
            "\n" +
            "A.特种焊条   B.酸性焊条     C.碱性焊条            正确答案：C\n" +
            "\n" +
            "25、U型坡口的坡口面角度通常比V型坡口(  )。   \n" +
            "\n" +
            "A.小 B.大 C.相等   D.无法相比        正确答案：A\n" +
            "\n" +
            "26、V带传动机构中，带在带轮上的包角不能小于（  ）否则容易打滑。\n" +
            "\n" +
            "A.60°    B.80°   C.120°  D.100°  正确答案：C\n" +
            "\n" +
            "27、V带传动机构中，是依靠带与带轮之间的（  ）来传递运动和动力的。\n" +
            "\n" +
            "28、A.摩擦力  B.张紧力 C.拉力   D.圆周力   正确答案：A\n" +
            "\n" +
            "28、V带传动机构装配时，要求两轮的中间平面重合，因而要求其倾斜角不超过（  ）度。 A.10 B.5 C.0.1    D.1   正确答案：D\n" +
            "\n" +
            "29、V型密封圈的工作压力不大于( )Kg/cm2。\n" +
            "\n" +
            "A.140    B.320    C.500    D.750    正确答案：B\n" +
            "\n" +
            "29、Z525立钻的最大钻孔直径为(   )毫米。\n" +
            "\n" +
            "30、A.25  B.35 C.50         正确答案：A\n" +
            "\n" +
            "31、安装机床时,垫铁的数量和分布不符合要求,将会引起机床的(   )。\n" +
            "\n" +
            "A.功率降低    B.噪音增加    C.变形            正确答案：C\n" +
            "\n" +
            "32、按照技术要求对机器进行超出额定负荷范围的运转试验称为（ ）。   \n" +
            "\n" +
            "A. 寿命试验   B. 超负荷试验 C. 破坏性试验          正确答案：B\n" +
            "\n" +
            "33、扳手通常由碳素结构钢或（ ）制成\n" +
            "\n" +
            "A.合金结构钢  B.工具钢 C.灰铸铁 D.球墨铸铁    正确答案：A\n" +
            "\n" +
            "34、保证设备正确使用的主要措施是：①制定设备使用程序；②制定设备操作维护规程；③建立设备使用责任制；④（ ），开展维护竞赛评比活动。正确答案：D\n" +
            "\n" +
            "A.合理使用设备 B.做好员工培训    C.经常检查设备    D.建立设备维护制度\n" +
            "\n" +
            "35、备件储备可以分为最低储备、（ ）、极限储备\n" +
            "\n" +
            "A.定额储备    B.最高储备    C.保险储备    D.正常储备    正确答案：A\n" +
            "\n" +
            "36、背弯容易发现焊缝( )缺陷。   A.表面    B.根部  C.内部   正确答案：B\n" +
            "\n" +
            "37、不等厚度材料点焊时，一般规定工件厚度比不应超过(  ) 。\n" +
            "\n" +
            "A.1:2    B.1:3    C.1:4    D.1:5    正确答案：B\n" +
            "\n" +
            "38、不锈钢焊条型号中数字后的字母“L”表示 ()。\n" +
            "\n" +
            "A.碳含量较低  B.碳含量较高  C.硅含量较高  D.硫、磷含量较低     正确答案：A\n" +
            "\n" +
            "39、材料的(   )越好，它的可锻性也就越好。 \n" +
            "\n" +
            "A.强度    B.塑性   C.硬度            正确答案：B\n" +
            "\n" +
            "40、采用三块平板互研互刮的方法而刮削成精密平板，这种平板称（ ）平板。 \n" +
            "\n" +
            "A.标准    B.基准   C.原始            正确答案：C\n" +
            "\n" +
            "41、采用相对直径有较长长度的孔进行定位,称为长圆柱孔定位,可以消除工件的(  )自由度。A.两个平动 B.两个平动两个转动   C.三个平动一个转动 D.两个平动一个转动\n" +
            "\n" +
            "正确答案：B\n" +
            "\n" +
            "42、采用指示器（百分表等）检测时，其测量力应适度，测量杆一般有（  ）mm左右的压缩量为宜。A.0.1    B.0.3    C.0.5    D.0.8    正确答案：C\n" +
            "\n" +
            "43、操作人员对所用设备要做到“四懂”、“三会”，其中“三会”是会操作、会维护保养、（） A.会排除故障   B.会装配 C.会采购 D.会维修            正确答案：A\n" +
            "\n" +
            "44、操作人员对所用设备要做到“四懂”、“三会”，其中“四懂”是懂结构、懂原理、懂性能、（ ）  A.懂用途   B.懂维修 C.懂管理 D.懂装配              正确答案：A\n" +
            "\n" +
            "45、测定产品及其部件的性能参数而进行各种试验称为（ ）。\n" +
            "\n" +
            "A. 性能试验   B. 型式试验   C. 超速试验                   正确答案：A\n" +
            "\n" +
            "46、测量长度为45±0.035时,可选用(  )即可保证测量准确。\n" +
            "\n" +
            "A.0.05毫米游标卡尺 B.0.02毫米游标卡尺    C.0.1毫米游标卡尺     正确答案：B\n" +
            "\n" +
            "47、测量齿轮副侧隙的方法有（）两种。正确答案：C\n" +
            "\n" +
            "A.涂色法和压熔丝法 B.涂色法和用指示表检验法    C.压熔丝法和用指示表检验法                              \n" +
            "\n" +
            "48、测量直径φ50±0.02mm的工件，可选用精度为(  )mm的游标卡尺。 \n" +
            "\n" +
            "A.0.02   B.0.05   C.0.1             正确答案：A\n" +
            "\n" +
            "49、长件因不均匀加热和冷却于焊后两端挠起的变形称为 （  ） 。\n" +
            "\n" +
            "A.弯曲变形    B.角变形 C.扭曲变形   D.收缩变形    正确答案：A\n" +
            "\n" +
            "50、常用的螺钉旋具有100mm、150mm、200mm、300mm和（  ）mm等几种。\n" +
            "\n" +
            "A.250    B.350    C.400    D.500    正确答案：C\n" +
            "\n" +
            "51、常用的牌号为H08Mn2SiA焊丝中的“08”表示(  ) 。正确答案：A\n" +
            "\n" +
            "A.含碳量为0.08% B.含碳量为0.8% C.含碳量为8% D.含锰量为0.08% \n" +
            "\n" +
            "52、常用的牌号为H08Mn2SiA焊丝中的“Mn2”表示 (   )  。正确答案：C\n" +
            "\n" +
            "A.含锰量为0.02%   B.含锰量为0.2%    C.含锰量为2% D.含锰量为20%  \n" +
            "\n" +
            "53、尺寸公差是指上极限尺寸和下极限尺寸（ ）。  \n" +
            "\n" +
            "A.之和    B.之差   C.之积    D.之商           正确答案：A\n" +
            "\n" +
            "54、齿轮变速机构属于( )。  A.无级变速B.有级变速   C.恒定速比正确答案：B\n" +
            "\n" +
            "55、齿轮传动比等于两齿轮齿数的( )。 \n" +
            "\n" +
            "A.正比    B.反比   C.乘积              正确答案：B\n" +
            "\n" +
            "56、齿轮的润滑主要靠（ ），所以要求润滑油有较高的黏度、较好的油性和极压性能。   A.刚性油膜   B.弹性油膜 C.边界油膜    D.塑形油膜    正确答案：C\n" +
            "\n" +
            "57、齿轮润滑若采用润滑脂，常用在（  ）的齿轮传动。 \n" +
            "\n" +
            "A.低速重负荷  B.低速轻负荷  C.高速重负荷  D.高速轻负荷  正确答案：A\n" +
            "\n" +
            "58、除以下什么情况下应及时更换润滑油。（   ）  \n" +
            "\n" +
            "A.润滑油中异物含量超过2%    B.润滑油中金属磨料超过0.5%\n" +
            "\n" +
            "C.润滑油中含水量超过2% D.润滑油油温超过规定值的20%         正确答案：D\n" +
            "\n" +
            "59、传统的零件清洗剂是汽油、煤油、（  ）等。   \n" +
            "\n" +
            "A.柴油    B.水 C.酒清   D.肥皂水           正确答案：A\n" +
            "\n" +
            "60、磁粉探伤方法不能检测 ( )的缺陷。\n" +
            "\n" +
            "A.材料表面    B.材料近表面  C.奥氏体不锈钢    D.碳钢   正确答案：C\n" +
            "\n" +
            "61、锉刀的主要工作面是指锉齿的(   )。\n" +
            "\n" +
            "A.上下两面    B.两个侧面         C.全部表面            正确答案：A\n" +
            "\n" +
            "62、锉刀断面形状的选择取决于工件的（ ）。 \n" +
            "\n" +
            "A.锉削表面形状 B.锉削表面大小 C.工件材料软硬   D.锉削表面精度    正确答案：A\n" +
            "\n" +
            "63、锉配键长，在键长方向，键与轴槽有（ ）mm左右的间隙。\n" +
            "\n" +
            "A.0.1    B.0.2    C.0.3    D.0.4    正确答案：A\n" +
            "\n" +
            "64、带传动、套筒滚子链传动、齿形链传动都存在带或链张不紧的问题，适当的张紧力是保证（）的主要因素。\n" +
            "\n" +
            "A.传动比  B.传动效率    C.传动力　    D.传动力矩      正确答案：B\n" +
            "\n" +
            "65、带传动机构装配后，要求两带轮的中间平面(   )。\n" +
            "\n" +
            "A.重合    B.平行   C.相交            正确答案：A\n" +
            "\n" +
            "66、弹簧在不受外力作用时的高度（或长度）称为（ ）（或长度）。\n" +
            "\n" +
            "A.工作高度    B.自由高度    C.有效高度            正确答案：B\n" +
            "\n" +
            "67、当刮削进行到精刮阶段时，研点要求清晰醒目，可将显示剂涂在（  ），对刮削较有利。  \n" +
            "\n" +
            "A.工件表面上  B.基准平面上  C.工件表面和基准平面上          正确答案：B\n" +
            "\n" +
            "68、当螺杆的螺距为3mm,螺杆的线数为3,螺杆旋转一周时,螺母相应移动(  )mm。      A.3  B.6 C.9          正确答案：C\n" +
            "\n" +
            "69、当钻头后角增大时，横刃斜角（ ）。 \n" +
            "\n" +
            "A.增大    B.不变   C.减小             正确答案：C\n" +
            "\n" +
            "70、当钻削加工脆性材料时,选用(  )的前角。\n" +
            "\n" +
            "A.负值   B.较小  C.较大             正确答案：B\n" +
            "\n" +
            "71、刀具材料的硬度越高，耐磨性( )。 \n" +
            "\n" +
            "A.越差   B.越好       C.不变            正确答案：B\n" +
            "\n" +
            "72、等离子弧切割要求电源具有( )外特性。\n" +
            "\n" +
            "A.水平   B.陡降   C.上升   D.多种     正确答案：B\n" +
            "\n" +
            "73、低合金钢焊条型号E5515—G中“G”表示 ( )。\n" +
            "\n" +
            "A.熔敷金属抗拉强度最小值    B.熔敷金属化学成分分类\n" +
            "\n" +
            "C.焊接位置     D.药皮类型及电流种类              正确答案：B\n" +
            "\n" +
            "74、低合金高强度结构钢焊前预热范围为焊缝两侧各不小于焊件厚度3倍,且不小于( )mm。\n" +
            "\n" +
            "A.50 B.100    C.200    D.300    正确答案：B\n" +
            "\n" +
            "75、低碳钢不能用来制造工作温度大于（  ）℃的容器等设备。\n" +
            "\n" +
            "    A.300 B.400    C.500    D.600    正确答案：B\n" +
            "\n" +
            "76、低碳钢的过热组织为粗大的（  ）。 \n" +
            "\n" +
            "A.铁素体  B.珠光体 C.奥氏体 D.魏氏组织    正确答案：D\n" +
            "\n" +
            "77、电动机绝缘等级Y级的温度是（ ）℃。\n" +
            "\n" +
            "A.105    B.120    C.90         正确答案：C\n" +
            "\n" +
            "77、电焊钳的导电部分应采用( )材料制成。\n" +
            "\n" +
            "A.紫铜   B.青铜   C.不锈钢    D.碳钢正确答案：A\n" +
            "\n" +
            "79、电弧焊是利用( )作为热源的熔焊方法。\n" +
            "\n" +
            "A.电弧   B.气体燃烧火焰    C.化学反应热  D.电能   正确答案：A\n" +
            "\n" +
            "80、垫板接头的主要缺点是容易形成( )。\n" +
            "\n" +
            "A.未焊透  B.夹渣   C.内气孔 D.咬边   正确答案：B\n" +
            "\n" +
            "81、定位时,用来确定工件在夹具中位置的点、线、面叫做(   )。\n" +
            "\n" +
            "A.设计基准    B.测量基准    C.定位基准    D.工艺基准    正确答案：C\n" +
            "\n" +
            "82、动压润滑轴承工作时，为了平衡轴的载荷，使轴能浮在油中，必须（ ）。\n" +
            "\n" +
            "A.有足够的供油压力 B.有一定的压力差  C. 使轴有一定的旋转速度     正确答案：C\n" +
            "\n" +
            "83、动压润滑轴承是指运转时（ ）的滑动轴承。   \n" +
            "\n" +
            "A.混合摩擦    B.纯液体摩擦  C. 平摩擦         正确答案：B\n" +
            "\n" +
            "84、对分度或读数机构中的齿轮副，其主要的要求是（ ）。   \n" +
            "\n" +
            "A.传递运动的准确性 B.传动平稳性  C.齿面承载的均匀性         正确答案：A\n" +
            "\n" +
            "85、对工件平面进行精研加工时，应放在（ ）平板上进行研磨。\n" +
            "\n" +
            "A.无槽    B.有槽   C.光滑            正确答案：C\n" +
            "\n" +
            "86、对刮削面进行粗刮时应采用（ ）法。\n" +
            "\n" +
            "A.点刮    B.短刮   C.长刮            正确答案：C\n" +
            "\n" +
            "87、对机械设备进行周期性的彻底检查和恢复性的修理工作，称为（ ）。 \n" +
            "\n" +
            "A.小修    B.中修   C.二级保养    D.大修   正确答案：D\n" +
            "\n" +
            "88、对精度要求不高及圆周速度不大的大型齿轮,如损坏一个或连续几个轮齿,可用(  )。 A.更换齿轮   B.镶齿修复法    C.两块炭精或铜曲线模堆焊形           正确答案：B\n" +
            "\n" +
            "89、对零件的配合、耐磨性和密封性等有显著影响的是：(   )。\n" +
            "\n" +
            "A.尺寸精度    B.表面粗糙度  C.形位公差    D.互换性正确答案：B\n" +
            "\n" +
            "90、对扭曲变形的条料，可用（ ）进行矫正。 \n" +
            "\n" +
            "A.弯曲法  B.扭转法 C.延展法          正确答案：B\n" +
            "\n" +
            "91、对于（ ）的焊接，采用分段退焊的目的是减少变形\n" +
            "\n" +
            "A.点焊缝  B.对称焊缝    C.长焊缝 D.短焊缝    正确答案：C\n" +
            "\n" +
            "92、对于长焊件因不均匀加热和冷却，造成焊后两端翘起的变形称为 (    )。 \n" +
            "\n" +
            "A.弯曲变形    B.角变形 C.扭曲变形    D.收缩变形    正确答案：A\n" +
            "\n" +
            "93、对于较长导轨的直线度,测量时可用( )较合适。\n" +
            "\n" +
            "A.实物基准法  B.间接测量法  C.光线基准法           正确答案：C\n" +
            "\n" +
            "94、对于轴类零件的圆柱面（ ）检测简便、容易实现，故应优先选用。\n" +
            "\n" +
            "A.圆度   B.跳动   C.圆柱度      D.同轴度正确答案：B\n" +
            "\n" +
            "95、对在重型机械上传递动力的低速重载齿轮副，其主要的要求是（ ）。\n" +
            "\n" +
            "A.传递运动的准确性 B.传动平稳性  C.齿面承载的均匀性         正确答案：C\n" +
            "\n" +
            "96、防止层状撕裂的措施之一是严格控制钢材的(    )。 \n" +
            "\n" +
            "A.含碳量  B.含锰量 C.含磷量  D.含硫量    正确答案：D\n" +
            "\n" +
            "97、防止液压系统过载起安全作用的是(   )。 \n" +
            "\n" +
            "A.减压阀  B.顺序阀 C.安全阀          正确答案：C\n" +
            "\n" +
            "98、分组选配法要将一批零件逐一测量后，按（ ）的大小分成若干组。\n" +
            "\n" +
            "A.基本尺寸    B.极限尺寸    C.实际尺寸            正确答案：C\n" +
            "\n" +
            "99、风机不受力轴瓦与瓦盖的接触面积应大于（ ） \n" +
            "\n" +
            "A.60%    B.50%    C.45%             正确答案：A\n" +
            "\n" +
            "100、风机联轴器找正径向、端面不大于（）㎜。  \n" +
            "\n" +
            "A.0.02   B.0.1    C.0.05            正确答案：C\n" +
            "\n" +
            "101、负荷试车时应逐步加载至满负荷（有条件时应按25％、50％、75％、100％分四个阶段加载），每个阶段运转的时间不少于（   ）小时。   \n" +
            "\n" +
            "A.1  B.2 C.3 D.4 正确答案：B\n" +
            "\n" +
            "102、钢板在弯形时，其内层材料受到（  ）。\n" +
            "\n" +
            "A.压缩    B.拉伸   C.延展            正确答案：A\n" +
            "\n" +
            "103、钢材抵抗冲击力而不破断的能力叫( )。 \n" +
            "\n" +
            "A.冲击值  B.冲击功 C.冲击韧性            正确答案：C\n" +
            "\n" +
            "104、高效率设备的主要特点是：（  ）、高速化、自动化、电子化。\n" +
            "\n" +
            "A.小型化  B.大型化 C.综合化 D.全能化正确答案：B\n" +
            "\n" +
            "105、搞好设备管理工作，必须坚持技术管理与（  ）相结合。\n" +
            "\n" +
            "A.生产管理    B.设备管理    C.经济管理    D.思想政治工作    正确答案：C\n" +
            "\n" +
            "106、搞好设备润滑，坚持“五定”和“三级过滤”，其中“五定”为（   ）、定点、定质、定量、定时；“三级过滤”为从领油大桶到岗位储油桶、岗位储油桶到油壶、油壶到加油点。   \n" +
            "\n" +
            "A.定岗    B.定人   C.定设备 D.定员         正确答案：B\n" +
            "\n" +
            "107、工件的表面粗糙度值要求最低时，一般采用（ ）加工。 \n" +
            "\n" +
            "A.精车    B.磨削   C.研磨   D.刮削   正确答案：C\n" +
            "\n" +
            "108、工件的一面两孔定位，削边锥销限制了（ ）个自由度。\n" +
            "\n" +
            "A.1 B.2 C.3 D.4     正确答案：A\n" +
            "\n" +
            "109、工件在Ｖ形块上定位时，Ｖ形块可限制了（  ）个自由度。   \n" +
            "\n" +
            "A.3  B.4 C.5 D.6         正确答案：B\n" +
            "\n" +
            "110、工件在夹具中定位时，按照定位原则最多限制( )自由度。\n" +
            "\n" +
            "A.5 B.6 C.7          正确答案：B\n" +
            "\n" +
            "111、公制标准三角形螺纹牙型角是(     )。  \n" +
            "\n" +
            "A.60°    B.55°   C.40°             正确答案：A\n" +
            "\n" +
            "112、攻不通孔螺纹时，底孔深度要（）所需的螺孔深度。\n" +
            "\n" +
            "A.等于    B.大于   C.小于             正确答案：C\n" +
            "\n" +
            "113、攻螺纹前的底孔直径必须（ ）螺纹标准中规定的螺纹小径。\n" +
            "\n" +
            "A.小于   B.大于   C.等于            正确答案：B\n" +
            "\n" +
            "114、攻丝前的底孔直径(  )螺纹的小径。\n" +
            "\n" +
            "A.略小于 B.略大于  C.等于            正确答案：B\n" +
            "\n" +
            "115、固定式联轴器安装时,对两轴的同轴度要求(  )。   \n" +
            "\n" +
            "A.一般    B.较低   C.较高           正确答案：C\n" +
            "\n" +
            "116、故障的类型很多，由于操作人员操作不当所引发的故障可归纳为（ ）。\n" +
            "\n" +
            "A.技术性故障   B.规律性故障 C.偶发性故障           正确答案：C\n" +
            "\n" +
            "117、刮刀切削部分应具有足够的（ ）才能进行刮削加工。\n" +
            "\n" +
            "A.强度和钢度      B.刚度和刃口锋利\n" +
            "\n" +
            "C.硬度和刃口锋利      D.强度和刃口锋利    正确答案：C\n" +
            "\n" +
            "118、刮削常用的显示剂红丹粉广泛的应用于（  ）的工件上。\n" +
            "\n" +
            "A.精密工件    B.铝合金 C.铜合金 D.铸铁和钢       正确答案：D\n" +
            "\n" +
            "119、刮削加工会形成均匀微浅的凹坑，所以它属于(   )。\n" +
            "\n" +
            "A.粗加工 B.精加工 C.半精加工            正确答案：B\n" +
            "\n" +
            "120、刮削加工平板精度的检查常用研点的数目来表示，用边长为（  ）的正方形方框罩在被检查面上。  \n" +
            "\n" +
            "A.24mm   B.25mm   C.50mm   D.20mm  正确答案：B\n" +
            "\n" +
            "121、刮削内孔时，接触点的合理分布应为（）。\n" +
            "\n" +
            "A.均匀分布    B.中间少两端多    C.中间多两端少             正确答案：B\n" +
            "\n" +
            "122、观检验不能发现的焊缝缺陷是（ ）。\n" +
            "\n" +
            "A.咬肉    B.焊瘤   C.弧坑裂纹    D.内部夹渣    正确答案：D\n" +
            "\n" +
            "123、管道装置分为可拆卸联接和（ ）联接两种。  \n" +
            "\n" +
            "A.不可拆卸    B.可调节 C.可焊接 D.可定位正确答案：A\n" +
            "\n" +
            "124、管牙螺纹的公称直径(  )螺纹的大径。\n" +
            "\n" +
            "A.小于   B.等于   C.大于            正确答案：A\n" +
            "\n" +
            "125、管子煨弯时，其弯曲半径一般不小于管子外径的（ ）倍。\n" +
            "\n" +
            "A.4 B.5 C.6 D.7 正确答案：C\n" +
            "\n" +
            "126、滚动轴承的精度等级“Ｐ５”，是旧精度等级的（）级。\n" +
            "\n" +
            "A.E  B.D C.c D.B 正确答案：B\n" +
            "\n" +
            "127、滚动轴承的外圈与轴承座孔的配合应为(  )制。\n" +
            "\n" +
            "A.基孔制  B.基轴制  C.           正确答案：B\n" +
            "\n" +
            "128、滚动轴承基本代号的排列顺序为（ ）。\n" +
            "\n" +
            "A.尺寸系列代号、类型代号、内径代号  \n" +
            "\n" +
            "B.内径代号、尺寸系列代号、类型代号\n" +
            "\n" +
            "    C.类型代号、尺寸系列代号、内径代号             正确答案：C\n" +
            "\n" +
            "129、滚动轴承内径与轴的配合应为（ ）。\n" +
            "\n" +
            "A.基孔制  B.基轴制 C.非基制          正确答案：A\n" +
            "\n" +
            "130、滚动轴承外径与外壳孔的配合应为（ ）。\n" +
            "\n" +
            "A.基孔制 B.基轴制 C.非基制          正确答案：B\n" +
            "\n" +
            "131、滚动轴承与轴的配合采用(　 　)。\n" +
            "\n" +
            "A.基孔制 B.基轴制 C.混合基制    D.基孔制或基轴制     正确答案：A\n" +
            "\n" +
            "132、滚动轴承装配后，轴承运转应灵活，无噪声，工作时温度不超过（ ）。\n" +
            "\n" +
            "A.25℃   B.50℃   C.100℃           正确答案：B\n" +
            "\n" +
            "133、国家标准的1级平板，在25mm×25mm内研点应为( )点。\n" +
            "\n" +
            "A.15-20  B.20-25  C.25-30           正确答案：B\n" +
            "\n" +
            "134、国家标准规定，工作企业噪声不应超过 (  ) 。\n" +
            "\n" +
            "A.50dB    B.85dB   C.100dB  D.120dB  正确答案：B\n" +
            "\n" +
            "135、过切削刃选定点而和该点假定主运动方向垂直的面称为（  ）。\n" +
            "\n" +
            "A.前面    B.切削平面    C.基面   D.正交平面    正确答案：C\n" +
            "\n" +
            "136、过盈联接装配，是依靠配合面的（ ）产生的摩擦力来传递转距。   \n" +
            "\n" +
            "A.推力    B.载荷力 C.压力   D.静力      正确答案：C\n" +
            "\n" +
            "137、焊缝焊件厚度一般不超过( ) 。   \n" +
            "\n" +
            "A.2mm    B.4mm    C.6mm    D.8mm    正确答案：A\n" +
            "\n" +
            "138、焊缝和热影响区性能最差的是（  ）。   \n" +
            "\n" +
            "A.气焊    B.焊条电弧焊  C.埋弧自动焊  D.手工钨极氩弧焊    正确答案：A\n" +
            "\n" +
            "139、焊缝和热影响区性能最好的是 （  ）。\n" +
            "\n" +
            "A.气焊    B.焊条电弧焊  C.埋弧自动焊  D.手工钨极氩弧焊    正确答案：D\n" +
            "\n" +
            "140、焊割场地周围 （ ）范围内，各类可燃易炸物品应清理干净。\n" +
            "\n" +
            "A.3m     B.5m C.10m    D.15m    正确答案：C\n" +
            "\n" +
            "141、焊工应有足够的作业面积，一般不小于 ( ) 。\n" +
            "\n" +
            "A.2m2    B.4m2    C.6m2    D.8m2    正确答案：B\n" +
            "\n" +
            "142、焊接00Cr19Ni10的焊条应选用 （  ）。\n" +
            "\n" +
            "A.A002   B.A102   C.A132   D.A407   正确答案：A\n" +
            "\n" +
            "143、焊接场地应保持必要的通道，且车辆通道宽度不小于 (   )。\n" +
            "\n" +
            "A.1m     B.2m C.3m D.5m 正确答案：C\n" +
            "\n" +
            "143、焊接场地应保持必要的通道，且人行通道宽度不小于(  )。\n" +
            "\n" +
            "A.1m     B.1.5m   C.3m D.5m 正确答案：B\n" +
            "\n" +
            "144、焊接件变形是随着结构刚性的增加而（  ）。\n" +
            "\n" +
            "A.不变    B.减少   C.增大   D.相等    正确答案：B\n" +
            "\n" +
            "146、焊接接头根部预留间隙的作用是(  )。\n" +
            "\n" +
            "A.防止烧穿    B.保证焊透    C.减少应力    D.提高效率    正确答案：B\n" +
            "\n" +
            "147、焊接裂纹在重要的焊接接头中是(  )存在的一种缺陷。  \n" +
            "\n" +
            "A.允许    B.不允许 C.数量不多时允许   D.数量多时也允许   正确答案：B\n" +
            "\n" +
            "148、焊接时(  )气体不会产生气孔。    \n" +
            "\n" +
            "A.CO      B.CO2    C.H2 D.N2 正确答案：C\n" +
            "\n" +
            "149、焊接时，弧焊变压器过热是由于( )。\n" +
            "\n" +
            "A.焊机过载    B.电缆线过长  C.焊接电缆断线    D.电缆接触不良    正确答案：A\n" +
            "\n" +
            "150、焊接时，若电缆线与焊件接触不良则造成( )。\n" +
            "\n" +
            "A.焊机过热    B.焊接电流忽大忽小 C.电焊钳过热  D.熄弧   正确答案：B\n" +
            "\n" +
            "151、焊接时开坡口的目的主要是为了( )。\n" +
            "\n" +
            "A.增加熔宽    B.保证焊透    C.增大熔合比  D.减小热影响区    正确答案：B\n" +
            "\n" +
            "152、焊接时拉长焊接电弧，则电弧电压就会( )。\n" +
            "\n" +
            "A.增大   B.减小   C.不变   D.不稳   正确答案：A\n" +
            "\n" +
            "153、焊接用的CO2气体一般纯度要求不低于 ( )。\n" +
            "\n" +
            "A.98.50% B.99.50% C.99.95% D.99.99% 正确答案：B\n" +
            "\n" +
            " \n" +
            "\n" +
            "154、焊条牌号R317是 （ ） \n" +
            "\n" +
            "A.碳钢焊条    B.结构钢焊条  C.奥氏体不锈钢焊条 D.珠光体耐热钢焊条正确答案：D\n" +
            "\n" +
            "155、弧光中的红外线可造成对人眼睛的伤害，引起 (  )\n" +
            "\n" +
            "A.畏光   B.眼睛流泪    C.白内障 D.电光性眼炎  正确答案：C\n" +
            "\n" +
            "156、滑动轴承产生振动的原因主要是（  ）。　\n" +
            "\n" +
            "A.间隙过小    B.间隙过大　  C.油品牌号不对    D.油膜振荡    正确答案：D\n" +
            "\n" +
            "157、滑动轴承根据润滑类型分类可分为（ ）。\n" +
            "\n" +
            "A.4种    B.5种    C.6种    D.7种    正确答案：B\n" +
            "\n" +
            "158、滑动轴承内孔在刮研时，其研点除点数和表面粗糙度要达到精度要求外，一般还要求研点的显示（  ）硬一些。\n" +
            "\n" +
            "A.前端    B.中间   C.后端   D.两端   正确答案：D\n" +
            "\n" +
            "159、滑移齿轮与花键轴的联结，为了得到较高的定心精度，一般采用（ ）。  \n" +
            "\n" +
            "A.小径定心    B.大径定心    C.键侧定心            正确答案：B\n" +
            "\n" +
            "160、划线时,选用未经过切削加工的毛坯面做基准,其使用次数只能为(  )。  \n" +
            "\n" +
            "A.一次    B.二次   C.三次   D.多次   正确答案：A\n" +
            "\n" +
            "161、划线时，应使划线基准与（ ）一致。\n" +
            "\n" +
            "A.设计基准    B.安装基准    C.测量基准    D.装配基准    正确答案：A\n" +
            "\n" +
            "162、划线时，用来确定工件各部位尺寸、几何形状及相对位置的线，称为( )线。        A.原始   B.零位    C.基准            正确答案：C\n" +
            "\n" +
            "163、划线时V型块儿是用来安装（ ）工件的。\n" +
            "\n" +
            "A.圆柱形  B.圆锥形  C.大型   D.大型   正确答案：A\n" +
            "\n" +
            "164、机床空运转试验,在主轴轴承达到稳定温度时,滚动轴承的温度不得超过(    )。     A.50℃   B.60℃     C.70℃   D.80℃   正确答案：C\n" +
            "\n" +
            "165、机床上进给螺杆,它的牙形角一般为(   )。\n" +
            "\n" +
            "A.30°   B.40°   C.60°           正确答案：A\n" +
            "\n" +
            "166、机器试运行前首先须进行的是（）。\n" +
            "\n" +
            "A.空运转试验  B.负荷试验    C.超负荷试验  D.疲劳试验    正确答案：A\n" +
            "\n" +
            "167、机器装配后，加上额定负荷所进行的试验称为（ ）。\n" +
            "\n" +
            "A.性能试验    B.寿命试验    C.负荷试验            正确答案：C\n" +
            "\n" +
            "168、机械产生温升过高现象，反映了轴承等（ ）部位的工作状况失常。\n" +
            "\n" +
            "A.摩擦   B.接触   C.联接            正确答案：A\n" +
            "\n" +
            "169、机械传动旋转件的（  ）可以产生不正常的振动。\n" +
            "\n" +
            "A.锈蚀   B.摩擦或碰撞  C.旋转速度            正确答案：B\n" +
            "\n" +
            "170、机械方法防松装置中，有(  )防松装置。\n" +
            "\n" +
            "A.止动垫圈    B.弹簧垫圈    C.锁紧螺母            正确答案：A\n" +
            "\n" +
            "171、机械摩擦磨损主要是零件表面存在的（  ）在零件表面发生的磨损。\n" +
            "\n" +
            "A.宏观不平度  B.微观不平度  C.宏观平行度  D.微观平行度  正确答案：B\n" +
            "\n" +
            "172、机械设备的大修、中修、小修和二级保养，属于（  ）修理工作。\n" +
            "\n" +
            "A.定期性计划  B.不定期性计划    C.维护保养            正确答案：A\n" +
            "\n" +
            "173、机械在承受压力大、运动速度慢、精度要求低的场合，应选用(   )的润滑油。   A.粘度大    B.粘度小   C.蒸发点高            正确答案：A\n" +
            "\n" +
            "174、基准就是零件上用来确定其他点、线、面位置的(  )。\n" +
            "\n" +
            "A.尺寸    B.中心   C.依据            正确答案：C\n" +
            "\n" +
            "175、基准孔用（ ）表示。   \n" +
            "\n" +
            "A.“ h”      B.“H”  C.“Φ”  D.“R”  正确答案：B\n" +
            "\n" +
            "176、计划检修的原则是：（ ）\n" +
            "\n" +
            "A.定期检修    B.按计划进行  C.预防为主    D.保持设备处于良好状态正确答案：C\n" +
            "\n" +
            "177、夹渣在一般焊接接头中是( )存在的一种缺陷。\n" +
            "\n" +
            "A.数量多时允许 B.不允许 C.数量少时允许    D.无论多少都允许  正确答案：C\n" +
            "\n" +
            "178、间隙配合中最大间隙是指孔的上极限尺寸与轴的上极限尺寸（ ）   \n" +
            "\n" +
            "A.之和    B.之差   C.之积    D.之商   正确答案：B\n" +
            "\n" +
            "179、减速机齿轮点蚀与剥落原因有（ ）。\n" +
            "\n" +
            "A.材质、硬度和缺陷 B.齿轮精度较差    C.润滑油不符合要求或油位过高    D.以上都有    正确答案：D\n" +
            "\n" +
            "180、减速机平常的重点监控内容是（ ）。   \n" +
            "\n" +
            "A.减速器振动大，有杂音  B.油温高、漏油   \n" +
            "\n" +
            "C.齿轮损坏，串轴，轴承碎裂  D.以上都有    正确答案：D\n" +
            "\n" +
            "181、减速器常见的漏油部位有（  ）。  \n" +
            "\n" +
            "A.沿减速器合箱面处漏油  B.沿减速器上面的视孔盖处漏油   \n" +
            "\n" +
            "C.沿减速器底部的放油孔处漏油     D.以上都有    正确答案：D\n" +
            "\n" +
            "182、减速器平常的维护保养主要是（ ）。   \n" +
            "\n" +
            "A.安装时的调整和试车    B.定期检查、高温点检和油质化验 \n" +
            "\n" +
            "C.定期补油和换油   D.以上都有     正确答案：D\n" +
            "\n" +
            "183、减小滚动轴承配合间隙,可以使主轴,在轴承内的( )减小,有利于提高主轴的旋转精度。  \n" +
            "\n" +
            "A.热胀量      B.倾斜量  C.跳动量               正确答案：C\n" +
            "\n" +
            "184、检查不锈钢焊缝表面裂纹的常用方法是( )。  \n" +
            "\n" +
            "A.X射线探伤   B.着色   C.磁粉   D.超声   正确答案：B\n" +
            "\n" +
            "185、检查气孔夹渣缺陷最灵敏的无损探伤方法是( )探伤。   \n" +
            "\n" +
            "A.射线    B.超声波 C.渗透   D.磁粉   正确答案：A\n" +
            "\n" +
            "186、键产生变形或剪断，说明键受不了所传递的转矩，在条件允许的情况下，可适当增加键和键槽宽度或增加键的长度来解决。也可再增加一个键，使两键相隔（  ）度，以增加键的强度。  \n" +
            "\n" +
            "A.45 B.90 C.180    D.270    正确答案：C\n" +
            "\n" +
            "187、将部件、组件、零件连接组合成为整台机器的操作过程，称为(   )。   \n" +
            "\n" +
            "A.组件装配    B.部件装配    C.总装配          正确答案：C\n" +
            "\n" +
            "188、角皮带的公称长度是指三角皮带的(  )周长。 \n" +
            "\n" +
            "A.内径    B.外径   C.内径+K D.内径-K 正确答案：C\n" +
            "\n" +
            "189、矫正和弯曲的操作,只适用于材料(   )的零件。    \n" +
            "\n" +
            "A.硬度稍高    B.强度较高    C.塑性较好            正确答案：C\n" +
            "\n" +
            "190、矫正弯形时，材料产生冷作硬化，可采用（ ）方法，使其恢复原来的力学性能。    A.回火   B.淬火    C.调质            正确答案：A\n" +
            "\n" +
            "191、铰孔结束后，铰刀应（ ）退出。  \n" +
            "\n" +
            "A.正转    B.反转   C.正反转均可  D.停机后退出  正确答案：A\n" +
            "\n" +
            "192、接触形密封有填料密封、皮碗密封 、胀圈密封和（  ）。\n" +
            "\n" +
            "A.间隙密封    B.离心密封    C.机械密封    D.气动密封    正确答案：C\n" +
            "\n" +
            "193、金属材料的磁性与( )有关。  \n" +
            "\n" +
            "A.成分和温度  B.电阻率与成分   \n" +
            "\n" +
            "C.导热率和成分 D.导热率和温度    正确答案：A\n" +
            "\n" +
            "194、金属切削设备的定期检查，要对刀架、丝杠、螺母、斜铁、压板、弹簧等进行清洗，并调整到适宜的（  ）。   \n" +
            "\n" +
            "A.装配位置    B.运动间隙    C.工作压力    D.刚性变形    正确答案：B\n" +
            "\n" +
            "195、经淬硬的钢制零件进行研磨时，常用（ ）材料作为研具。\n" +
            "\n" +
            "A.淬硬钢  B.低碳钢 C.灰铸铁 D.铝       正确答案：C\n" +
            "\n" +
            "196、精、大、稀设备的四定工作是：定（   ）、定检修人员、定操作规程、定备品配件。\n" +
            "\n" +
            "A.维护人员    B.使用人员    C.设备负荷    D.设备软件    正确答案：B\n" +
            "\n" +
            "197、精锉时必须采取(  )锉，使痕变直，纹理一致。   \n" +
            "\n" +
            "A.正向    B.逆向   C.旋转            正确答案：A\n" +
            "\n" +
            "198、静压轴承根据受载荷性能性质不同,可分为径向静压轴承和推力静压轴承两类,这两类轴承一般需( )采用。\n" +
            "\n" +
            "A.同时    B.分别   C.单独            正确答案：A\n" +
            "\n" +
            "199、锯条反装后，其楔角（ ）。   \n" +
            "\n" +
            "A.不变    B.增大   C.减小            正确答案：A\n" +
            "\n" +
            "200、锯条有了锯路，可使工件上的锯缝宽度（ ）锯条背的宽度。  \n" +
            "\n" +
            "A.小于    B.等于    C.大于            正确答案：C";

    public static String txt1="D:\\work\\enviroment\\jdk\\bin\\java \"-javaagent:D:\\work\\IDE\\IntelliJ IDEA 2017.2.4\\lib\\idea_rt.jar=51821:D:\\work\\IDE\\IntelliJ IDEA 2017.2.4\\bin\" -Dfile.encoding=UTF-8 -classpath D:\\work\\enviroment\\jdk\\jre\\lib\\charsets.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\deploy.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\access-bridge-64.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\cldrdata.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\dnsns.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\jaccess.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\jfxrt.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\localedata.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\nashorn.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\sunec.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\sunjce_provider.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\sunmscapi.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\sunpkcs11.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\ext\\zipfs.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\javaws.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\jce.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\jfr.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\jfxswt.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\jsse.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\management-agent.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\plugin.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\resources.jar;D:\\work\\enviroment\\jdk\\jre\\lib\\rt.jar;D:\\work\\project\\personal\\super-susu\\hm-server\\target\\classes;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-test\\1.5.7.RELEASE\\spring-boot-starter-test-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-test\\1.5.7.RELEASE\\spring-boot-test-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot\\1.5.7.RELEASE\\spring-boot-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-test-autoconfigure\\1.5.7.RELEASE\\spring-boot-test-autoconfigure-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-autoconfigure\\1.5.7.RELEASE\\spring-boot-autoconfigure-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\jayway\\jsonpath\\json-path\\2.2.0\\json-path-2.2.0.jar;C:\\Users\\huwenjian\\.m2\\repository\\net\\minidev\\json-smart\\2.2.1\\json-smart-2.2.1.jar;C:\\Users\\huwenjian\\.m2\\repository\\net\\minidev\\accessors-smart\\1.1\\accessors-smart-1.1.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\ow2\\asm\\asm\\5.0.3\\asm-5.0.3.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\slf4j\\slf4j-api\\1.7.25\\slf4j-api-1.7.25.jar;C:\\Users\\huwenjian\\.m2\\repository\\junit\\junit\\4.12\\junit-4.12.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\assertj\\assertj-core\\2.6.0\\assertj-core-2.6.0.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\mockito\\mockito-core\\1.10.19\\mockito-core-1.10.19.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\objenesis\\objenesis\\2.5.1\\objenesis-2.5.1.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\hamcrest\\hamcrest-core\\1.3\\hamcrest-core-1.3.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\hamcrest\\hamcrest-library\\1.3\\hamcrest-library-1.3.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\skyscreamer\\jsonassert\\1.4.0\\jsonassert-1.4.0.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\vaadin\\external\\google\\android-json\\0.0.20131108.vaadin1\\android-json-0.0.20131108.vaadin1.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-core\\4.3.11.RELEASE\\spring-core-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-test\\4.3.11.RELEASE\\spring-test-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\cloud\\spring-cloud-starter-oauth2\\1.2.1.RELEASE\\spring-cloud-starter-oauth2-1.2.1.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\cloud\\spring-cloud-starter-security\\1.2.1.RELEASE\\spring-cloud-starter-security-1.2.1.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\cloud\\spring-cloud-starter\\1.2.4.RELEASE\\spring-cloud-starter-1.2.4.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\cloud\\spring-cloud-context\\1.2.4.RELEASE\\spring-cloud-context-1.2.4.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\security\\spring-security-crypto\\4.2.3.RELEASE\\spring-security-crypto-4.2.3.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\cloud\\spring-cloud-commons\\1.2.4.RELEASE\\spring-cloud-commons-1.2.4.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\security\\spring-security-rsa\\1.0.3.RELEASE\\spring-security-rsa-1.0.3.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-actuator\\1.5.7.RELEASE\\spring-boot-starter-actuator-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-actuator\\1.5.7.RELEASE\\spring-boot-actuator-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-databind\\2.8.10\\jackson-databind-2.8.10.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-annotations\\2.8.0\\jackson-annotations-2.8.0.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\fasterxml\\jackson\\core\\jackson-core\\2.8.10\\jackson-core-2.8.10.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\cloud\\spring-cloud-security\\1.2.1.RELEASE\\spring-cloud-security-1.2.1.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-security\\1.5.7.RELEASE\\spring-boot-starter-security-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-web\\1.5.7.RELEASE\\spring-boot-starter-web-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-tomcat\\1.5.7.RELEASE\\spring-boot-starter-tomcat-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\tomcat\\embed\\tomcat-embed-core\\8.5.20\\tomcat-embed-core-8.5.20.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\tomcat\\embed\\tomcat-embed-el\\8.5.20\\tomcat-embed-el-8.5.20.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\tomcat\\embed\\tomcat-embed-websocket\\8.5.20\\tomcat-embed-websocket-8.5.20.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\hibernate\\hibernate-validator\\5.3.5.Final\\hibernate-validator-5.3.5.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\javax\\validation\\validation-api\\1.1.0.Final\\validation-api-1.1.0.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\fasterxml\\classmate\\1.3.4\\classmate-1.3.4.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\security\\oauth\\spring-security-oauth2\\2.0.14.RELEASE\\spring-security-oauth2-2.0.14.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-beans\\4.3.11.RELEASE\\spring-beans-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-context\\4.3.11.RELEASE\\spring-context-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-expression\\4.3.11.RELEASE\\spring-expression-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-webmvc\\4.3.11.RELEASE\\spring-webmvc-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-web\\4.3.11.RELEASE\\spring-web-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\security\\spring-security-core\\4.2.3.RELEASE\\spring-security-core-4.2.3.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\aopalliance\\aopalliance\\1.0\\aopalliance-1.0.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\security\\spring-security-config\\4.2.3.RELEASE\\spring-security-config-4.2.3.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\security\\spring-security-web\\4.2.3.RELEASE\\spring-security-web-4.2.3.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\codehaus\\jackson\\jackson-mapper-asl\\1.9.13\\jackson-mapper-asl-1.9.13.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\codehaus\\jackson\\jackson-core-asl\\1.9.13\\jackson-core-asl-1.9.13.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\security\\spring-security-jwt\\1.0.8.RELEASE\\spring-security-jwt-1.0.8.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\bouncycastle\\bcpkix-jdk15on\\1.56\\bcpkix-jdk15on-1.56.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\bouncycastle\\bcprov-jdk15on\\1.56\\bcprov-jdk15on-1.56.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-data-jpa\\1.5.7.RELEASE\\spring-boot-starter-data-jpa-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter\\1.5.7.RELEASE\\spring-boot-starter-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-logging\\1.5.7.RELEASE\\spring-boot-starter-logging-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\ch\\qos\\logback\\logback-classic\\1.1.11\\logback-classic-1.1.11.jar;C:\\Users\\huwenjian\\.m2\\repository\\ch\\qos\\logback\\logback-core\\1.1.11\\logback-core-1.1.11.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\slf4j\\jul-to-slf4j\\1.7.25\\jul-to-slf4j-1.7.25.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\slf4j\\log4j-over-slf4j\\1.7.25\\log4j-over-slf4j-1.7.25.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-aop\\1.5.7.RELEASE\\spring-boot-starter-aop-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-aop\\4.3.11.RELEASE\\spring-aop-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\aspectj\\aspectjweaver\\1.8.10\\aspectjweaver-1.8.10.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\boot\\spring-boot-starter-jdbc\\1.5.7.RELEASE\\spring-boot-starter-jdbc-1.5.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\tomcat\\tomcat-jdbc\\8.5.20\\tomcat-jdbc-8.5.20.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\tomcat\\tomcat-juli\\8.5.20\\tomcat-juli-8.5.20.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-jdbc\\4.3.11.RELEASE\\spring-jdbc-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\hibernate\\hibernate-core\\5.0.12.Final\\hibernate-core-5.0.12.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\jboss\\logging\\jboss-logging\\3.3.1.Final\\jboss-logging-3.3.1.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\hibernate\\javax\\persistence\\hibernate-jpa-2.1-api\\1.0.0.Final\\hibernate-jpa-2.1-api-1.0.0.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\javassist\\javassist\\3.21.0-GA\\javassist-3.21.0-GA.jar;C:\\Users\\huwenjian\\.m2\\repository\\antlr\\antlr\\2.7.7\\antlr-2.7.7.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\jboss\\jandex\\2.0.0.Final\\jandex-2.0.0.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\dom4j\\dom4j\\1.6.1\\dom4j-1.6.1.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\hibernate\\common\\hibernate-commons-annotations\\5.0.1.Final\\hibernate-commons-annotations-5.0.1.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\hibernate\\hibernate-entitymanager\\5.0.12.Final\\hibernate-entitymanager-5.0.12.Final.jar;C:\\Users\\huwenjian\\.m2\\repository\\javax\\transaction\\javax.transaction-api\\1.2\\javax.transaction-api-1.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\data\\spring-data-jpa\\1.11.7.RELEASE\\spring-data-jpa-1.11.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\data\\spring-data-commons\\1.13.7.RELEASE\\spring-data-commons-1.13.7.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-orm\\4.3.11.RELEASE\\spring-orm-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-tx\\4.3.11.RELEASE\\spring-tx-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\slf4j\\jcl-over-slf4j\\1.7.25\\jcl-over-slf4j-1.7.25.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\springframework\\spring-aspects\\4.3.11.RELEASE\\spring-aspects-4.3.11.RELEASE.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\h2database\\h2\\1.4.196\\h2-1.4.196.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\liquibase\\liquibase-core\\3.5.3\\liquibase-core-3.5.3.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\yaml\\snakeyaml\\1.17\\snakeyaml-1.17.jar;C:\\Users\\huwenjian\\.m2\\repository\\mysql\\mysql-connector-java\\5.1.44\\mysql-connector-java-5.1.44.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\google\\guava\\guava\\19.0\\guava-19.0.jar;C:\\Users\\huwenjian\\.m2\\repository\\commons-io\\commons-io\\2.5\\commons-io-2.5.jar;C:\\Users\\huwenjian\\.m2\\repository\\commons-lang\\commons-lang\\2.6\\commons-lang-2.6.jar;C:\\Users\\huwenjian\\.m2\\repository\\commons-collections\\commons-collections\\3.2.2\\commons-collections-3.2.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\commons-beanutils\\commons-beanutils\\1.9.3\\commons-beanutils-1.9.3.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\hankcs\\hanlp\\portable-1.5.2\\hanlp-portable-1.5.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\httpcomponents\\httpclient\\4.5.2\\httpclient-4.5.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\httpcomponents\\httpcore\\4.4.6\\httpcore-4.4.6.jar;C:\\Users\\huwenjian\\.m2\\repository\\commons-codec\\commons-codec\\1.10\\commons-codec-1.10.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\jsoup\\jsoup\\1.8.3\\jsoup-1.8.3.jar;C:\\Users\\huwenjian\\.m2\\repository\\com\\alibaba\\fastjson\\1.2.38\\fastjson-1.2.38.jar;C:\\Users\\huwenjian\\.m2\\repository\\me\\yingrui\\mahjong\\lib-segment\\1.2\\lib-segment-1.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\nd4j\\nd4j-jblas\\0.0.3.5.5.2\\nd4j-jblas-0.0.3.5.5.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\jblas\\jblas\\1.2.3\\jblas-1.2.3.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\nd4j\\nd4j-api\\0.0.3.5.5.2\\nd4j-api-0.0.3.5.5.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\commons\\commons-math3\\3.2\\commons-math3-3.2.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\apache\\commons\\commons-lang3\\3.5\\commons-lang3-3.5.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\scala-lang\\scala-library\\2.11.8\\scala-library-2.11.8.jar;C:\\Users\\huwenjian\\.m2\\repository\\org\\scala-lang\\modules\\scala-parser-combinators_2.11\\1.0.5\\scala-parser-combinators_2.11-1.0.5.jar com.hm.util.HelpOthers\n" +
            "1、  搞好设备管理工作，必须坚持专管与(   )相结合。 \n" +
            "\n" +
            "A.专用    B.主管   C.专保养 D.群管       正确答案：B\n" +
            "\n" +
            "2、(   )种焊剂是目前国内生产中应用最多的一种焊剂。\n" +
            "\n" +
            "A.粘接焊剂  B.烧结焊剂 C.熔炼焊剂                 正确答案：C\n" +
            "\n" +
            "3、(   )变形对结构影响较小同时也易于矫正  \n" +
            "\n" +
            "A.弯曲  B.整体C.局部 D.波浪                 正确答案：C\n" +
            "\n" +
            "4、(   )不是产生未焊透的原因。\n" +
            "\n" +
            "A.焊接坡口钝边太大，装配间隙太小 B.焊条熔化太快   \n" +
            "\n" +
            "C.焊条角度不合适，电弧偏吹      D.焊接时采用短弧焊    正确答案：D\n" +
            "\n" +
            "5、(   )清洗剂是机修作业中广泛采用的清洗剂。  \n" +
            "\n" +
            "A.油剂   B.水剂   C.化学    D.雾状               正确答案：B\n" +
            "\n" +
            "6、(   )缺陷对焊接接头危害性最严重。 \n" +
            "\n" +
            "A.气孔   B.夹渣    C.夹钨   D.氢致裂纹            正确答案：D\n" +
            "\n" +
            "7、(   )是影响焊缝宽度的主要因素。   \n" +
            "\n" +
            "A.焊接电流    B.电弧电压    C.焊接速度    D.焊丝直径      正确答案：B\n" +
            "\n" +
            "8、(   )是指已使用的设备，两次相邻大修之间设备的工作时间；对新投产的设备，指从投产时起到第一次大修设备的工作时间。\n" +
            "\n" +
            "A.设备工作期     B.设备寿命 C.设备停歇期  D.检修周期       正确答案：D\n" +
            "\n" +
            "9、(   )适用于两平行轴之间的传动。   \n" +
            "\n" +
            "A.圆锥齿轮    B.蜗杆、蜗轮  C.圆柱齿轮                  正确答案：C\n" +
            "\n" +
            "10、(   )适用于一般介质的各种机械设备中。 \n" +
            "\n" +
            "A.矩形橡胶垫圈 B.油封皮垫圈  C.油封纸垫片  D.其他材质垫片   正确答案：A\n" +
            "\n" +
            "11、0.02mm游标卡尺的游标上，第50格刻线与尺身上(   )mm刻线对齐。  \n" +
            "\n" +
            "A.49   B.39   C.19                               正确答案：A\n" +
            "\n" +
            "12、10KV带电体正常工作时的安全距离为(   )。  \n" +
            "\n" +
            "A.0.5米    B.0.7米    C.0.9米  D.1.2米             正确答案：B\n" +
            "\n" +
            "13、16Mn钢焊接时焊条应选用（  ）。\n" +
            "\n" +
            "A.E4315  B.E5015  C.E5515-G    D. E6015-D1      正确答案：B\n" +
            "\n" +
            "14、16Mn钢在（ ）焊接时应进行适当预热\n" +
            "\n" +
            "A.小厚度结构   B.常温条件下  C.低温条件下  D.小细性结构    正确答案：C\n" +
            "\n" +
            "15、16Mn钢属于(    )。\n" +
            "\n" +
            "A.Q295    B.Q345   C.Q390   D.Q420      正确答案：B\n" +
            "\n" +
            "16、CO2焊的焊丝伸出长度通常取决于(  )。\n" +
            "\n" +
            "A.焊丝直径    B.焊接电流    C.电弧电压    D.焊接速度     正确答案：A\n" +
            "\n" +
            "17、CO2焊用的CO2气瓶采用电热预热器时电压应低于(  ) 。\n" +
            "\n" +
            "A.60V    B.36V    C.12V    D.6V                   正确答案：B\n" +
            "\n" +
            "18、CO2气瓶的外表涂成(  )。\n" +
            "\n" +
            "A.白色      B.银灰色      C.天蓝色      D.铝白色      正确答案：D\n" +
            "\n" +
            "19、E4303、E5003属于 （  ）种药皮类型的焊条。\n" +
            "\n" +
            "A.钛钙型  B.钛铁矿型    C.铁氢钠型    D.低氢钾型    正确答案：A\n" +
            "\n" +
            "20、E4315、E5015属于 （  ）种药皮类型的焊条。\n" +
            "\n" +
            "A.钛钙型  B.钛铁矿型    C.铁氢钠型    D.低氢钾型    正确答案：C\n" +
            "\n" +
            "21、E4316、E5016焊条焊接时焊接电流为（ ）。正确答案：C\n" +
            "\n" +
            "A.交流或直流正接、反接  B.直流正接  C.交流或直流反接     D.交流或直流正接          \n" +
            "\n" +
            "22、E4316、E5016属于（  ）种药皮类型的焊条。\n" +
            "\n" +
            "A.钛钙型  B.钛铁矿型    C.铁氢钠型    D.低氢钾型    正确答案：D\n" +
            "\n" +
            "23、E5015焊条要求采用(  )。\n" +
            "\n" +
            "A.交流电源  B.直流正接  C.直流反接   D.脉冲电源  正确答案：C\n" +
            "\n" +
            "24、E5015焊条属(   )  \n" +
            "\n" +
            "A.特种焊条   B.酸性焊条     C.碱性焊条            正确答案：C\n" +
            "\n" +
            "25、U型坡口的坡口面角度通常比V型坡口(  )。   \n" +
            "\n" +
            "A.小 B.大 C.相等   D.无法相比        正确答案：A\n" +
            "\n" +
            "26、V带传动机构中，带在带轮上的包角不能小于（  ）否则容易打滑。\n" +
            "\n" +
            "A.60°    B.80°   C.120°  D.100°  正确答案：C\n" +
            "\n" +
            "27、V带传动机构中，是依靠带与带轮之间的（  ）来传递运动和动力的。\n" +
            "\n" +
            "28、A.摩擦力  B.张紧力 C.拉力   D.圆周力   正确答案：A\n" +
            "\n" +
            "28、V带传动机构装配时，要求两轮的中间平面重合，因而要求其倾斜角不超过（  ）度。 A.10 B.5 C.0.1    D.1   正确答案：D\n" +
            "\n" +
            "29、V型密封圈的工作压力不大于( )Kg/cm2。\n" +
            "\n" +
            "A.140    B.320    C.500    D.750    正确答案：B\n" +
            "\n" +
            "29、Z525立钻的最大钻孔直径为(   )毫米。\n" +
            "\n" +
            "30、A.25  B.35 C.50         正确答案：A\n" +
            "\n" +
            "31、安装机床时,垫铁的数量和分布不符合要求,将会引起机床的(   )。\n" +
            "\n" +
            "A.功率降低    B.噪音增加    C.变形            正确答案：C\n" +
            "\n" +
            "32、按照技术要求对机器进行超出额定负荷范围的运转试验称为（ ）。   \n" +
            "\n" +
            "A. 寿命试验   B. 超负荷试验 C. 破坏性试验          正确答案：B\n" +
            "\n" +
            "33、扳手通常由碳素结构钢或（ ）制成\n" +
            "\n" +
            "A.合金结构钢  B.工具钢 C.灰铸铁 D.球墨铸铁    正确答案：A\n" +
            "\n" +
            "34、保证设备正确使用的主要措施是：①制定设备使用程序；②制定设备操作维护规程；③建立设备使用责任制；④（ ），开展维护竞赛评比活动。正确答案：D\n" +
            "\n" +
            "A.合理使用设备 B.做好员工培训    C.经常检查设备    D.建立设备维护制度\n" +
            "\n" +
            "35、备件储备可以分为最低储备、（ ）、极限储备\n" +
            "\n" +
            "A.定额储备    B.最高储备    C.保险储备    D.正常储备    正确答案：A\n" +
            "\n" +
            "36、背弯容易发现焊缝( )缺陷。   A.表面    B.根部  C.内部   正确答案：B\n" +
            "\n" +
            "37、不等厚度材料点焊时，一般规定工件厚度比不应超过(  ) 。\n" +
            "\n" +
            "A.1:2    B.1:3    C.1:4    D.1:5    正确答案：B\n" +
            "\n" +
            "38、不锈钢焊条型号中数字后的字母“L”表示 ()。\n" +
            "\n" +
            "A.碳含量较低  B.碳含量较高  C.硅含量较高  D.硫、磷含量较低     正确答案：A\n" +
            "\n" +
            "39、材料的(   )越好，它的可锻性也就越好。 \n" +
            "\n" +
            "A.强度    B.塑性   C.硬度            正确答案：B\n" +
            "\n" +
            "40、采用三块平板互研互刮的方法而刮削成精密平板，这种平板称（ ）平板。 \n" +
            "\n" +
            "A.标准    B.基准   C.原始            正确答案：C\n" +
            "\n" +
            "41、采用相对直径有较长长度的孔进行定位,称为长圆柱孔定位,可以消除工件的(  )自由度。A.两个平动 B.两个平动两个转动   C.三个平动一个转动 D.两个平动一个转动\n" +
            "\n" +
            "正确答案：B\n" +
            "\n" +
            "42、采用指示器（百分表等）检测时，其测量力应适度，测量杆一般有（  ）mm左右的压缩量为宜。A.0.1    B.0.3    C.0.5    D.0.8    正确答案：C\n" +
            "\n" +
            "43、操作人员对所用设备要做到“四懂”、“三会”，其中“三会”是会操作、会维护保养、（） A.会排除故障   B.会装配 C.会采购 D.会维修            正确答案：A\n" +
            "\n" +
            "44、操作人员对所用设备要做到“四懂”、“三会”，其中“四懂”是懂结构、懂原理、懂性能、（ ）  A.懂用途   B.懂维修 C.懂管理 D.懂装配              正确答案：A\n" +
            "\n" +
            "45、测定产品及其部件的性能参数而进行各种试验称为（ ）。\n" +
            "\n" +
            "A. 性能试验   B. 型式试验   C. 超速试验                   正确答案：A\n" +
            "\n" +
            "46、测量长度为45±0.035时,可选用(  )即可保证测量准确。\n" +
            "\n" +
            "A.0.05毫米游标卡尺 B.0.02毫米游标卡尺    C.0.1毫米游标卡尺     正确答案：B\n" +
            "\n" +
            "47、测量齿轮副侧隙的方法有（）两种。正确答案：C\n" +
            "\n" +
            "A.涂色法和压熔丝法 B.涂色法和用指示表检验法    C.压熔丝法和用指示表检验法                              \n" +
            "\n" +
            "48、测量直径φ50±0.02mm的工件，可选用精度为(  )mm的游标卡尺。 \n" +
            "\n" +
            "A.0.02   B.0.05   C.0.1             正确答案：A\n" +
            "\n" +
            "49、长件因不均匀加热和冷却于焊后两端挠起的变形称为 （  ） 。\n" +
            "\n" +
            "A.弯曲变形    B.角变形 C.扭曲变形   D.收缩变形    正确答案：A\n" +
            "\n" +
            "50、常用的螺钉旋具有100mm、150mm、200mm、300mm和（  ）mm等几种。\n" +
            "\n" +
            "A.250    B.350    C.400    D.500    正确答案：C\n" +
            "\n" +
            "51、常用的牌号为H08Mn2SiA焊丝中的“08”表示(  ) 。正确答案：A\n" +
            "\n" +
            "A.含碳量为0.08% B.含碳量为0.8% C.含碳量为8% D.含锰量为0.08% \n" +
            "\n" +
            "52、常用的牌号为H08Mn2SiA焊丝中的“Mn2”表示 (   )  。正确答案：C\n" +
            "\n" +
            "A.含锰量为0.02%   B.含锰量为0.2%    C.含锰量为2% D.含锰量为20%  \n" +
            "\n" +
            "53、尺寸公差是指上极限尺寸和下极限尺寸（ ）。  \n" +
            "\n" +
            "A.之和    B.之差   C.之积    D.之商           正确答案：A\n" +
            "\n" +
            "54、齿轮变速机构属于( )。  A.无级变速B.有级变速   C.恒定速比正确答案：B\n" +
            "\n" +
            "55、齿轮传动比等于两齿轮齿数的( )。 \n" +
            "\n" +
            "A.正比    B.反比   C.乘积              正确答案：B\n" +
            "\n" +
            "56、齿轮的润滑主要靠（ ），所以要求润滑油有较高的黏度、较好的油性和极压性能。   A.刚性油膜   B.弹性油膜 C.边界油膜    D.塑形油膜    正确答案：C\n" +
            "\n" +
            "57、齿轮润滑若采用润滑脂，常用在（  ）的齿轮传动。 \n" +
            "\n" +
            "A.低速重负荷  B.低速轻负荷  C.高速重负荷  D.高速轻负荷  正确答案：A\n" +
            "\n" +
            "58、除以下什么情况下应及时更换润滑油。（   ）  \n" +
            "\n" +
            "A.润滑油中异物含量超过2%    B.润滑油中金属磨料超过0.5%\n" +
            "\n" +
            "C.润滑油中含水量超过2% D.润滑油油温超过规定值的20%         正确答案：D\n" +
            "\n" +
            "59、传统的零件清洗剂是汽油、煤油、（  ）等。   \n" +
            "\n" +
            "A.柴油    B.水 C.酒清   D.肥皂水           正确答案：A\n" +
            "\n" +
            "60、磁粉探伤方法不能检测 ( )的缺陷。\n" +
            "\n" +
            "A.材料表面    B.材料近表面  C.奥氏体不锈钢    D.碳钢   正确答案：C\n" +
            "\n" +
            "61、锉刀的主要工作面是指锉齿的(   )。\n" +
            "\n" +
            "A.上下两面    B.两个侧面         C.全部表面            正确答案：A\n" +
            "\n" +
            "62、锉刀断面形状的选择取决于工件的（ ）。 \n" +
            "\n" +
            "A.锉削表面形状 B.锉削表面大小 C.工件材料软硬   D.锉削表面精度    正确答案：A\n" +
            "\n" +
            "63、锉配键长，在键长方向，键与轴槽有（ ）mm左右的间隙。\n" +
            "\n" +
            "A.0.1    B.0.2    C.0.3    D.0.4    正确答案：A\n" +
            "\n" +
            "64、带传动、套筒滚子链传动、齿形链传动都存在带或链张不紧的问题，适当的张紧力是保证（）的主要因素。\n" +
            "\n" +
            "A.传动比  B.传动效率    C.传动力　    D.传动力矩      正确答案：B\n" +
            "\n" +
            "65、带传动机构装配后，要求两带轮的中间平面(   )。\n" +
            "\n" +
            "A.重合    B.平行   C.相交            正确答案：A\n" +
            "\n" +
            "66、弹簧在不受外力作用时的高度（或长度）称为（ ）（或长度）。\n" +
            "\n" +
            "A.工作高度    B.自由高度    C.有效高度            正确答案：B\n" +
            "\n" +
            "67、当刮削进行到精刮阶段时，研点要求清晰醒目，可将显示剂涂在（  ），对刮削较有利。  \n" +
            "\n" +
            "A.工件表面上  B.基准平面上  C.工件表面和基准平面上          正确答案：B\n" +
            "\n" +
            "68、当螺杆的螺距为3mm,螺杆的线数为3,螺杆旋转一周时,螺母相应移动(  )mm。      A.3  B.6 C.9          正确答案：C\n" +
            "\n" +
            "69、当钻头后角增大时，横刃斜角（ ）。 \n" +
            "\n" +
            "A.增大    B.不变   C.减小             正确答案：C\n" +
            "\n" +
            "70、当钻削加工脆性材料时,选用(  )的前角。\n" +
            "\n" +
            "A.负值   B.较小  C.较大             正确答案：B\n" +
            "\n" +
            "71、刀具材料的硬度越高，耐磨性( )。 \n" +
            "\n" +
            "A.越差   B.越好       C.不变            正确答案：B\n" +
            "\n" +
            "72、等离子弧切割要求电源具有( )外特性。\n" +
            "\n" +
            "A.水平   B.陡降   C.上升   D.多种     正确答案：B\n" +
            "\n" +
            "73、低合金钢焊条型号E5515—G中“G”表示 ( )。\n" +
            "\n" +
            "A.熔敷金属抗拉强度最小值    B.熔敷金属化学成分分类\n" +
            "\n" +
            "C.焊接位置     D.药皮类型及电流种类              正确答案：B\n" +
            "\n" +
            "74、低合金高强度结构钢焊前预热范围为焊缝两侧各不小于焊件厚度3倍,且不小于( )mm。\n" +
            "\n" +
            "A.50 B.100    C.200    D.300    正确答案：B\n" +
            "\n" +
            "75、低碳钢不能用来制造工作温度大于（  ）℃的容器等设备。\n" +
            "\n" +
            "    A.300 B.400    C.500    D.600    正确答案：B\n" +
            "\n" +
            "76、低碳钢的过热组织为粗大的（  ）。 \n" +
            "\n" +
            "A.铁素体  B.珠光体 C.奥氏体 D.魏氏组织    正确答案：D\n" +
            "\n" +
            "77、电动机绝缘等级Y级的温度是（ ）℃。\n" +
            "\n" +
            "A.105    B.120    C.90         正确答案：C\n" +
            "\n" +
            "77、电焊钳的导电部分应采用( )材料制成。\n" +
            "\n" +
            "A.紫铜   B.青铜   C.不锈钢    D.碳钢正确答案：A\n" +
            "\n" +
            "79、电弧焊是利用( )作为热源的熔焊方法。\n" +
            "\n" +
            "A.电弧   B.气体燃烧火焰    C.化学反应热  D.电能   正确答案：A\n" +
            "\n" +
            "80、垫板接头的主要缺点是容易形成( )。\n" +
            "\n" +
            "A.未焊透  B.夹渣   C.内气孔 D.咬边   正确答案：B\n" +
            "\n" +
            "81、定位时,用来确定工件在夹具中位置的点、线、面叫做(   )。\n" +
            "\n" +
            "A.设计基准    B.测量基准    C.定位基准    D.工艺基准    正确答案：C\n" +
            "\n" +
            "82、动压润滑轴承工作时，为了平衡轴的载荷，使轴能浮在油中，必须（ ）。\n" +
            "\n" +
            "A.有足够的供油压力 B.有一定的压力差  C. 使轴有一定的旋转速度     正确答案：C\n" +
            "\n" +
            "83、动压润滑轴承是指运转时（ ）的滑动轴承。   \n" +
            "\n" +
            "A.混合摩擦    B.纯液体摩擦  C. 平摩擦         正确答案：B\n" +
            "\n" +
            "84、对分度或读数机构中的齿轮副，其主要的要求是（ ）。   \n" +
            "\n" +
            "A.传递运动的准确性 B.传动平稳性  C.齿面承载的均匀性         正确答案：A\n" +
            "\n" +
            "85、对工件平面进行精研加工时，应放在（ ）平板上进行研磨。\n" +
            "\n" +
            "A.无槽    B.有槽   C.光滑            正确答案：C\n" +
            "\n" +
            "86、对刮削面进行粗刮时应采用（ ）法。\n" +
            "\n" +
            "A.点刮    B.短刮   C.长刮            正确答案：C\n" +
            "\n" +
            "87、对机械设备进行周期性的彻底检查和恢复性的修理工作，称为（ ）。 \n" +
            "\n" +
            "A.小修    B.中修   C.二级保养    D.大修   正确答案：D\n" +
            "\n" +
            "88、对精度要求不高及圆周速度不大的大型齿轮,如损坏一个或连续几个轮齿,可用(  )。 A.更换齿轮   B.镶齿修复法    C.两块炭精或铜曲线模堆焊形           正确答案：B\n" +
            "\n" +
            "89、对零件的配合、耐磨性和密封性等有显著影响的是：(   )。\n" +
            "\n" +
            "A.尺寸精度    B.表面粗糙度  C.形位公差    D.互换性正确答案：B\n" +
            "\n" +
            "90、对扭曲变形的条料，可用（ ）进行矫正。 \n" +
            "\n" +
            "A.弯曲法  B.扭转法 C.延展法          正确答案：B\n" +
            "\n" +
            "91、对于（ ）的焊接，采用分段退焊的目的是减少变形\n" +
            "\n" +
            "A.点焊缝  B.对称焊缝    C.长焊缝 D.短焊缝    正确答案：C\n" +
            "\n" +
            "92、对于长焊件因不均匀加热和冷却，造成焊后两端翘起的变形称为 (    )。 \n" +
            "\n" +
            "A.弯曲变形    B.角变形 C.扭曲变形    D.收缩变形    正确答案：A\n" +
            "\n" +
            "93、对于较长导轨的直线度,测量时可用( )较合适。\n" +
            "\n" +
            "A.实物基准法  B.间接测量法  C.光线基准法           正确答案：C\n" +
            "\n" +
            "94、对于轴类零件的圆柱面（ ）检测简便、容易实现，故应优先选用。\n" +
            "\n" +
            "A.圆度   B.跳动   C.圆柱度      D.同轴度正确答案：B\n" +
            "\n" +
            "95、对在重型机械上传递动力的低速重载齿轮副，其主要的要求是（ ）。\n" +
            "\n" +
            "A.传递运动的准确性 B.传动平稳性  C.齿面承载的均匀性         正确答案：C\n" +
            "\n" +
            "96、防止层状撕裂的措施之一是严格控制钢材的(    )。 \n" +
            "\n" +
            "A.含碳量  B.含锰量 C.含磷量  D.含硫量    正确答案：D\n" +
            "\n" +
            "97、防止液压系统过载起安全作用的是(   )。 \n" +
            "\n" +
            "A.减压阀  B.顺序阀 C.安全阀          正确答案：C\n" +
            "\n" +
            "98、分组选配法要将一批零件逐一测量后，按（ ）的大小分成若干组。\n" +
            "\n" +
            "A.基本尺寸    B.极限尺寸    C.实际尺寸            正确答案：C\n" +
            "\n" +
            "99、风机不受力轴瓦与瓦盖的接触面积应大于（ ） \n" +
            "\n" +
            "A.60%    B.50%    C.45%             正确答案：A\n" +
            "\n" +
            "100、风机联轴器找正径向、端面不大于（）㎜。  \n" +
            "\n" +
            "A.0.02   B.0.1    C.0.05            正确答案：C\n" +
            "\n" +
            "101、负荷试车时应逐步加载至满负荷（有条件时应按25％、50％、75％、100％分四个阶段加载），每个阶段运转的时间不少于（   ）小时。   \n" +
            "\n" +
            "A.1  B.2 C.3 D.4 正确答案：B\n" +
            "\n" +
            "102、钢板在弯形时，其内层材料受到（  ）。\n" +
            "\n" +
            "A.压缩    B.拉伸   C.延展            正确答案：A\n" +
            "\n" +
            "103、钢材抵抗冲击力而不破断的能力叫( )。 \n" +
            "\n" +
            "A.冲击值  B.冲击功 C.冲击韧性            正确答案：C\n" +
            "\n" +
            "104、高效率设备的主要特点是：（  ）、高速化、自动化、电子化。\n" +
            "\n" +
            "A.小型化  B.大型化 C.综合化 D.全能化正确答案：B\n" +
            "\n" +
            "105、搞好设备管理工作，必须坚持技术管理与（  ）相结合。\n" +
            "\n" +
            "A.生产管理    B.设备管理    C.经济管理    D.思想政治工作    正确答案：C\n" +
            "\n" +
            "106、搞好设备润滑，坚持“五定”和“三级过滤”，其中“五定”为（   ）、定点、定质、定量、定时；“三级过滤”为从领油大桶到岗位储油桶、岗位储油桶到油壶、油壶到加油点。   \n" +
            "\n" +
            "A.定岗    B.定人   C.定设备 D.定员         正确答案：B\n" +
            "\n" +
            "107、工件的表面粗糙度值要求最低时，一般采用（ ）加工。 \n" +
            "\n" +
            "A.精车    B.磨削   C.研磨   D.刮削   正确答案：C\n" +
            "\n" +
            "108、工件的一面两孔定位，削边锥销限制了（ ）个自由度。\n" +
            "\n" +
            "A.1 B.2 C.3 D.4     正确答案：A\n" +
            "\n" +
            "109、工件在Ｖ形块上定位时，Ｖ形块可限制了（  ）个自由度。   \n" +
            "\n" +
            "A.3  B.4 C.5 D.6         正确答案：B\n" +
            "\n" +
            "110、工件在夹具中定位时，按照定位原则最多限制( )自由度。\n" +
            "\n" +
            "A.5 B.6 C.7          正确答案：B\n" +
            "\n" +
            "111、公制标准三角形螺纹牙型角是(     )。  \n" +
            "\n" +
            "A.60°    B.55°   C.40°             正确答案：A\n" +
            "\n" +
            "112、攻不通孔螺纹时，底孔深度要（）所需的螺孔深度。\n" +
            "\n" +
            "A.等于    B.大于   C.小于             正确答案：C\n" +
            "\n" +
            "113、攻螺纹前的底孔直径必须（ ）螺纹标准中规定的螺纹小径。\n" +
            "\n" +
            "A.小于   B.大于   C.等于            正确答案：B\n" +
            "\n" +
            "114、攻丝前的底孔直径(  )螺纹的小径。\n" +
            "\n" +
            "A.略小于 B.略大于  C.等于            正确答案：B\n" +
            "\n" +
            "115、固定式联轴器安装时,对两轴的同轴度要求(  )。   \n" +
            "\n" +
            "A.一般    B.较低   C.较高           正确答案：C\n" +
            "\n" +
            "116、故障的类型很多，由于操作人员操作不当所引发的故障可归纳为（ ）。\n" +
            "\n" +
            "A.技术性故障   B.规律性故障 C.偶发性故障           正确答案：C\n" +
            "\n" +
            "117、刮刀切削部分应具有足够的（ ）才能进行刮削加工。\n" +
            "\n" +
            "A.强度和钢度      B.刚度和刃口锋利\n" +
            "\n" +
            "C.硬度和刃口锋利      D.强度和刃口锋利    正确答案：C\n" +
            "\n" +
            "118、刮削常用的显示剂红丹粉广泛的应用于（  ）的工件上。\n" +
            "\n" +
            "A.精密工件    B.铝合金 C.铜合金 D.铸铁和钢       正确答案：D\n" +
            "\n" +
            "119、刮削加工会形成均匀微浅的凹坑，所以它属于(   )。\n" +
            "\n" +
            "A.粗加工 B.精加工 C.半精加工            正确答案：B\n" +
            "\n" +
            "120、刮削加工平板精度的检查常用研点的数目来表示，用边长为（  ）的正方形方框罩在被检查面上。  \n" +
            "\n" +
            "A.24mm   B.25mm   C.50mm   D.20mm  正确答案：B\n" +
            "\n" +
            "121、刮削内孔时，接触点的合理分布应为（）。\n" +
            "\n" +
            "A.均匀分布    B.中间少两端多    C.中间多两端少             正确答案：B\n" +
            "\n" +
            "122、观检验不能发现的焊缝缺陷是（ ）。\n" +
            "\n" +
            "A.咬肉    B.焊瘤   C.弧坑裂纹    D.内部夹渣    正确答案：D\n" +
            "\n" +
            "123、管道装置分为可拆卸联接和（ ）联接两种。  \n" +
            "\n" +
            "A.不可拆卸    B.可调节 C.可焊接 D.可定位正确答案：A\n" +
            "\n" +
            "124、管牙螺纹的公称直径(  )螺纹的大径。\n" +
            "\n" +
            "A.小于   B.等于   C.大于            正确答案：A\n" +
            "\n" +
            "125、管子煨弯时，其弯曲半径一般不小于管子外径的（ ）倍。\n" +
            "\n" +
            "A.4 B.5 C.6 D.7 正确答案：C\n" +
            "\n" +
            "126、滚动轴承的精度等级“Ｐ５”，是旧精度等级的（）级。\n" +
            "\n" +
            "A.E  B.D C.c D.B 正确答案：B\n" +
            "\n" +
            "127、滚动轴承的外圈与轴承座孔的配合应为(  )制。\n" +
            "\n" +
            "A.基孔制  B.基轴制  C.           正确答案：B\n" +
            "\n" +
            "128、滚动轴承基本代号的排列顺序为（ ）。\n" +
            "\n" +
            "A.尺寸系列代号、类型代号、内径代号  \n" +
            "\n" +
            "B.内径代号、尺寸系列代号、类型代号\n" +
            "\n" +
            "    C.类型代号、尺寸系列代号、内径代号             正确答案：C\n" +
            "\n" +
            "129、滚动轴承内径与轴的配合应为（ ）。\n" +
            "\n" +
            "A.基孔制  B.基轴制 C.非基制          正确答案：A\n" +
            "\n" +
            "130、滚动轴承外径与外壳孔的配合应为（ ）。\n" +
            "\n" +
            "A.基孔制 B.基轴制 C.非基制          正确答案：B\n" +
            "\n" +
            "131、滚动轴承与轴的配合采用(　 　)。\n" +
            "\n" +
            "A.基孔制 B.基轴制 C.混合基制    D.基孔制或基轴制     正确答案：A\n" +
            "\n" +
            "132、滚动轴承装配后，轴承运转应灵活，无噪声，工作时温度不超过（ ）。\n" +
            "\n" +
            "A.25℃   B.50℃   C.100℃           正确答案：B\n" +
            "\n" +
            "133、国家标准的1级平板，在25mm×25mm内研点应为( )点。\n" +
            "\n" +
            "A.15-20  B.20-25  C.25-30           正确答案：B\n" +
            "\n" +
            "134、国家标准规定，工作企业噪声不应超过 (  ) 。\n" +
            "\n" +
            "A.50dB    B.85dB   C.100dB  D.120dB  正确答案：B\n" +
            "\n" +
            "135、过切削刃选定点而和该点假定主运动方向垂直的面称为（  ）。\n" +
            "\n" +
            "A.前面    B.切削平面    C.基面   D.正交平面    正确答案：C\n" +
            "\n" +
            "136、过盈联接装配，是依靠配合面的（ ）产生的摩擦力来传递转距。   \n" +
            "\n" +
            "A.推力    B.载荷力 C.压力   D.静力      正确答案：C\n" +
            "\n" +
            "137、焊缝焊件厚度一般不超过( ) 。   \n" +
            "\n" +
            "A.2mm    B.4mm    C.6mm    D.8mm    正确答案：A\n" +
            "\n" +
            "138、焊缝和热影响区性能最差的是（  ）。   \n" +
            "\n" +
            "A.气焊    B.焊条电弧焊  C.埋弧自动焊  D.手工钨极氩弧焊    正确答案：A\n" +
            "\n" +
            "139、焊缝和热影响区性能最好的是 （  ）。\n" +
            "\n" +
            "A.气焊    B.焊条电弧焊  C.埋弧自动焊  D.手工钨极氩弧焊    正确答案：D\n" +
            "\n" +
            "140、焊割场地周围 （ ）范围内，各类可燃易炸物品应清理干净。\n" +
            "\n" +
            "A.3m     B.5m C.10m    D.15m    正确答案：C\n" +
            "\n" +
            "141、焊工应有足够的作业面积，一般不小于 ( ) 。\n" +
            "\n" +
            "A.2m2    B.4m2    C.6m2    D.8m2    正确答案：B\n" +
            "\n" +
            "142、焊接00Cr19Ni10的焊条应选用 （  ）。\n" +
            "\n" +
            "A.A002   B.A102   C.A132   D.A407   正确答案：A\n" +
            "\n" +
            "143、焊接场地应保持必要的通道，且车辆通道宽度不小于 (   )。\n" +
            "\n" +
            "A.1m     B.2m C.3m D.5m 正确答案：C\n" +
            "\n" +
            "143、焊接场地应保持必要的通道，且人行通道宽度不小于(  )。\n" +
            "\n" +
            "A.1m     B.1.5m   C.3m D.5m 正确答案：B\n" +
            "\n" +
            "144、焊接件变形是随着结构刚性的增加而（  ）。\n" +
            "\n" +
            "A.不变    B.减少   C.增大   D.相等    正确答案：B\n" +
            "\n" +
            "146、焊接接头根部预留间隙的作用是(  )。\n" +
            "\n" +
            "A.防止烧穿    B.保证焊透    C.减少应力    D.提高效率    正确答案：B\n" +
            "\n" +
            "147、焊接裂纹在重要的焊接接头中是(  )存在的一种缺陷。  \n" +
            "\n" +
            "A.允许    B.不允许 C.数量不多时允许   D.数量多时也允许   正确答案：B\n" +
            "\n" +
            "148、焊接时(  )气体不会产生气孔。    \n" +
            "\n" +
            "A.CO      B.CO2    C.H2 D.N2 正确答案：C\n" +
            "\n" +
            "149、焊接时，弧焊变压器过热是由于( )。\n" +
            "\n" +
            "A.焊机过载    B.电缆线过长  C.焊接电缆断线    D.电缆接触不良    正确答案：A\n" +
            "\n" +
            "150、焊接时，若电缆线与焊件接触不良则造成( )。\n" +
            "\n" +
            "A.焊机过热    B.焊接电流忽大忽小 C.电焊钳过热  D.熄弧   正确答案：B\n" +
            "\n" +
            "151、焊接时开坡口的目的主要是为了( )。\n" +
            "\n" +
            "A.增加熔宽    B.保证焊透    C.增大熔合比  D.减小热影响区    正确答案：B\n" +
            "\n" +
            "152、焊接时拉长焊接电弧，则电弧电压就会( )。\n" +
            "\n" +
            "A.增大   B.减小   C.不变   D.不稳   正确答案：A\n" +
            "\n" +
            "153、焊接用的CO2气体一般纯度要求不低于 ( )。\n" +
            "\n" +
            "A.98.50% B.99.50% C.99.95% D.99.99% 正确答案：B\n" +
            "\n" +
            " \n" +
            "\n" +
            "154、焊条牌号R317是 （ ） \n" +
            "\n" +
            "A.碳钢焊条    B.结构钢焊条  C.奥氏体不锈钢焊条 D.珠光体耐热钢焊条正确答案：D\n" +
            "\n" +
            "155、弧光中的红外线可造成对人眼睛的伤害，引起 (  )\n" +
            "\n" +
            "A.畏光   B.眼睛流泪    C.白内障 D.电光性眼炎  正确答案：C\n" +
            "\n" +
            "156、滑动轴承产生振动的原因主要是（  ）。　\n" +
            "\n" +
            "A.间隙过小    B.间隙过大　  C.油品牌号不对    D.油膜振荡    正确答案：D\n" +
            "\n" +
            "157、滑动轴承根据润滑类型分类可分为（ ）。\n" +
            "\n" +
            "A.4种    B.5种    C.6种    D.7种    正确答案：B\n" +
            "\n" +
            "158、滑动轴承内孔在刮研时，其研点除点数和表面粗糙度要达到精度要求外，一般还要求研点的显示（  ）硬一些。\n" +
            "\n" +
            "A.前端    B.中间   C.后端   D.两端   正确答案：D\n" +
            "\n" +
            "159、滑移齿轮与花键轴的联结，为了得到较高的定心精度，一般采用（ ）。  \n" +
            "\n" +
            "A.小径定心    B.大径定心    C.键侧定心            正确答案：B\n" +
            "\n" +
            "160、划线时,选用未经过切削加工的毛坯面做基准,其使用次数只能为(  )。  \n" +
            "\n" +
            "A.一次    B.二次   C.三次   D.多次   正确答案：A\n" +
            "\n" +
            "161、划线时，应使划线基准与（ ）一致。\n" +
            "\n" +
            "A.设计基准    B.安装基准    C.测量基准    D.装配基准    正确答案：A\n" +
            "\n" +
            "162、划线时，用来确定工件各部位尺寸、几何形状及相对位置的线，称为( )线。        A.原始   B.零位    C.基准            正确答案：C\n" +
            "\n" +
            "163、划线时V型块儿是用来安装（ ）工件的。\n" +
            "\n" +
            "A.圆柱形  B.圆锥形  C.大型   D.大型   正确答案：A\n" +
            "\n" +
            "164、机床空运转试验,在主轴轴承达到稳定温度时,滚动轴承的温度不得超过(    )。     A.50℃   B.60℃     C.70℃   D.80℃   正确答案：C\n" +
            "\n" +
            "165、机床上进给螺杆,它的牙形角一般为(   )。\n" +
            "\n" +
            "A.30°   B.40°   C.60°           正确答案：A\n" +
            "\n" +
            "166、机器试运行前首先须进行的是（）。\n" +
            "\n" +
            "A.空运转试验  B.负荷试验    C.超负荷试验  D.疲劳试验    正确答案：A\n" +
            "\n" +
            "167、机器装配后，加上额定负荷所进行的试验称为（ ）。\n" +
            "\n" +
            "A.性能试验    B.寿命试验    C.负荷试验            正确答案：C\n" +
            "\n" +
            "168、机械产生温升过高现象，反映了轴承等（ ）部位的工作状况失常。\n" +
            "\n" +
            "A.摩擦   B.接触   C.联接            正确答案：A\n" +
            "\n" +
            "169、机械传动旋转件的（  ）可以产生不正常的振动。\n" +
            "\n" +
            "A.锈蚀   B.摩擦或碰撞  C.旋转速度            正确答案：B\n" +
            "\n" +
            "170、机械方法防松装置中，有(  )防松装置。\n" +
            "\n" +
            "A.止动垫圈    B.弹簧垫圈    C.锁紧螺母            正确答案：A\n" +
            "\n" +
            "171、机械摩擦磨损主要是零件表面存在的（  ）在零件表面发生的磨损。\n" +
            "\n" +
            "A.宏观不平度  B.微观不平度  C.宏观平行度  D.微观平行度  正确答案：B\n" +
            "\n" +
            "172、机械设备的大修、中修、小修和二级保养，属于（  ）修理工作。\n" +
            "\n" +
            "A.定期性计划  B.不定期性计划    C.维护保养            正确答案：A\n" +
            "\n" +
            "173、机械在承受压力大、运动速度慢、精度要求低的场合，应选用(   )的润滑油。   A.粘度大    B.粘度小   C.蒸发点高            正确答案：A\n" +
            "\n" +
            "174、基准就是零件上用来确定其他点、线、面位置的(  )。\n" +
            "\n" +
            "A.尺寸    B.中心   C.依据            正确答案：C\n" +
            "\n" +
            "175、基准孔用（ ）表示。   \n" +
            "\n" +
            "A.“ h”      B.“H”  C.“Φ”  D.“R”  正确答案：B\n" +
            "\n" +
            "176、计划检修的原则是：（ ）\n" +
            "\n" +
            "A.定期检修    B.按计划进行  C.预防为主    D.保持设备处于良好状态正确答案：C\n" +
            "\n" +
            "177、夹渣在一般焊接接头中是( )存在的一种缺陷。\n" +
            "\n" +
            "A.数量多时允许 B.不允许 C.数量少时允许    D.无论多少都允许  正确答案：C\n" +
            "\n" +
            "178、间隙配合中最大间隙是指孔的上极限尺寸与轴的上极限尺寸（ ）   \n" +
            "\n" +
            "A.之和    B.之差   C.之积    D.之商   正确答案：B\n" +
            "\n" +
            "179、减速机齿轮点蚀与剥落原因有（ ）。\n" +
            "\n" +
            "A.材质、硬度和缺陷 B.齿轮精度较差    C.润滑油不符合要求或油位过高    D.以上都有    正确答案：D\n" +
            "\n" +
            "180、减速机平常的重点监控内容是（ ）。   \n" +
            "\n" +
            "A.减速器振动大，有杂音  B.油温高、漏油   \n" +
            "\n" +
            "C.齿轮损坏，串轴，轴承碎裂  D.以上都有    正确答案：D\n" +
            "\n" +
            "181、减速器常见的漏油部位有（  ）。  \n" +
            "\n" +
            "A.沿减速器合箱面处漏油  B.沿减速器上面的视孔盖处漏油   \n" +
            "\n" +
            "C.沿减速器底部的放油孔处漏油     D.以上都有    正确答案：D\n" +
            "\n" +
            "182、减速器平常的维护保养主要是（ ）。   \n" +
            "\n" +
            "A.安装时的调整和试车    B.定期检查、高温点检和油质化验 \n" +
            "\n" +
            "C.定期补油和换油   D.以上都有     正确答案：D\n" +
            "\n" +
            "183、减小滚动轴承配合间隙,可以使主轴,在轴承内的( )减小,有利于提高主轴的旋转精度。  \n" +
            "\n" +
            "A.热胀量      B.倾斜量  C.跳动量               正确答案：C\n" +
            "\n" +
            "184、检查不锈钢焊缝表面裂纹的常用方法是( )。  \n" +
            "\n" +
            "A.X射线探伤   B.着色   C.磁粉   D.超声   正确答案：B\n" +
            "\n" +
            "185、检查气孔夹渣缺陷最灵敏的无损探伤方法是( )探伤。   \n" +
            "\n" +
            "A.射线    B.超声波 C.渗透   D.磁粉   正确答案：A\n" +
            "\n" +
            "186、键产生变形或剪断，说明键受不了所传递的转矩，在条件允许的情况下，可适当增加键和键槽宽度或增加键的长度来解决。也可再增加一个键，使两键相隔（  ）度，以增加键的强度。  \n" +
            "\n" +
            "A.45 B.90 C.180    D.270    正确答案：C\n" +
            "\n" +
            "187、将部件、组件、零件连接组合成为整台机器的操作过程，称为(   )。   \n" +
            "\n" +
            "A.组件装配    B.部件装配    C.总装配          正确答案：C\n" +
            "\n" +
            "188、角皮带的公称长度是指三角皮带的(  )周长。 \n" +
            "\n" +
            "A.内径    B.外径   C.内径+K D.内径-K 正确答案：C\n" +
            "\n" +
            "189、矫正和弯曲的操作,只适用于材料(   )的零件。    \n" +
            "\n" +
            "A.硬度稍高    B.强度较高    C.塑性较好            正确答案：C\n" +
            "\n" +
            "190、矫正弯形时，材料产生冷作硬化，可采用（ ）方法，使其恢复原来的力学性能。    A.回火   B.淬火    C.调质            正确答案：A\n" +
            "\n" +
            "191、铰孔结束后，铰刀应（ ）退出。  \n" +
            "\n" +
            "A.正转    B.反转   C.正反转均可  D.停机后退出  正确答案：A\n" +
            "\n" +
            "192、接触形密封有填料密封、皮碗密封 、胀圈密封和（  ）。\n" +
            "\n" +
            "A.间隙密封    B.离心密封    C.机械密封    D.气动密封    正确答案：C\n" +
            "\n" +
            "193、金属材料的磁性与( )有关。  \n" +
            "\n" +
            "A.成分和温度  B.电阻率与成分   \n" +
            "\n" +
            "C.导热率和成分 D.导热率和温度    正确答案：A\n" +
            "\n" +
            "194、金属切削设备的定期检查，要对刀架、丝杠、螺母、斜铁、压板、弹簧等进行清洗，并调整到适宜的（  ）。   \n" +
            "\n" +
            "A.装配位置    B.运动间隙    C.工作压力    D.刚性变形    正确答案：B\n" +
            "\n" +
            "195、经淬硬的钢制零件进行研磨时，常用（ ）材料作为研具。\n" +
            "\n" +
            "A.淬硬钢  B.低碳钢 C.灰铸铁 D.铝       正确答案：C\n" +
            "\n" +
            "196、精、大、稀设备的四定工作是：定（   ）、定检修人员、定操作规程、定备品配件。\n" +
            "\n" +
            "A.维护人员    B.使用人员    C.设备负荷    D.设备软件    正确答案：B\n" +
            "\n" +
            "197、精锉时必须采取(  )锉，使痕变直，纹理一致。   \n" +
            "\n" +
            "A.正向    B.逆向   C.旋转            正确答案：A\n" +
            "\n" +
            "198、静压轴承根据受载荷性能性质不同,可分为径向静压轴承和推力静压轴承两类,这两类轴承一般需( )采用。\n" +
            "\n" +
            "A.同时    B.分别   C.单独            正确答案：A\n" +
            "\n" +
            "199、锯条反装后，其楔角（ ）。   \n" +
            "\n" +
            "A.不变    B.增大   C.减小            正确答案：A\n" +
            "\n" +
            "200、锯条有了锯路，可使工件上的锯缝宽度（ ）锯条背的宽度。  \n" +
            "\n" +
            "A.小于    B.等于    C.大于            正确答案：C\n" +
            "\n" +
            "Process finished with exit code 0\n";
}
