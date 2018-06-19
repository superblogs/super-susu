package com.hm.core.es.highclent;

import org.elasticsearch.index.query.*;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;

public class CreateQueryDSL {


    @Test
    public void demo(){
        SearchSourceBuilder searchSourceBuilder = getSearchSourceBuilderCommon("未至");

        System.out.println(searchSourceBuilder);
    }
    @Test
    public void demo1() {
//        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")).build());
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.from(1);
        searchSourceBuilder.size(100);
        searchSourceBuilder.fetchSource("Name", "");

        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();


        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("Name", "小米科技");


        TermsQueryBuilder termQueryBuilder1 = QueryBuilders.termsQuery("Name", "小米");
        TermsQueryBuilder termQueryBuilder2 = QueryBuilders.termsQuery("Name", "科技");


        boolBuilder.should(termQueryBuilder);
        boolBuilder.should(termQueryBuilder1);
        boolBuilder.should(termQueryBuilder2);

        boolBuilder.minimumShouldMatch(3);

        searchSourceBuilder.query(boolBuilder);

        System.out.println(searchSourceBuilder);
    }

    /**
     * 查询小米科技 返回结果良好
     */
    @Test
    public void demo2() {
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.profile(true);
        searchSourceBuilder.from(0);
        searchSourceBuilder.size(100);
        searchSourceBuilder.fetchSource("Name","");

        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();

        QueryStringQueryBuilder queryStringQueryBuilder = QueryBuilders.queryStringQuery("小米科技");
        queryStringQueryBuilder.field("Name");
        queryStringQueryBuilder.analyzer("ngram_analyzer");
        queryStringQueryBuilder.defaultOperator(Operator.AND);
        boolBuilder.must(queryStringQueryBuilder);


        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("Name", "小米科技");
        boolBuilder.should(termQueryBuilder);

//        TermQueryBuilder termQueryBuilder2 = QueryBuilders.termQuery("Province","安徽省");
//        boolBuilder.must(termQueryBuilder2);
//
//        TermQueryBuilder termQueryBuilder1 = QueryBuilders.termQuery("Name","小米科技有限责任公司");
//        boolBuilder.should(termQueryBuilder1);


        searchSourceBuilder.query(boolBuilder);




        System.out.println(searchSourceBuilder);


    }

    /**
     * 查询测试查询 百度
     */
    @Test
    public  void demo3(){
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.profile(true);
        searchSourceBuilder.from(0);
        searchSourceBuilder.size(100);
        searchSourceBuilder.fetchSource("Name","");

        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();

        QueryStringQueryBuilder queryStringQueryBuilder = QueryBuilders.queryStringQuery("百度");
        queryStringQueryBuilder.field("Name");
        queryStringQueryBuilder.analyzer("ngram_analyzer");
        queryStringQueryBuilder.defaultOperator(Operator.AND);
        boolBuilder.must(queryStringQueryBuilder);


        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("Name","百度");
        boolBuilder.should(termQueryBuilder);
        TermQueryBuilder termQueryBuilderWangba = QueryBuilders.termQuery("Name","网吧");

        boolBuilder.mustNot(termQueryBuilderWangba);


        searchSourceBuilder.query(boolBuilder);




        System.out.println(searchSourceBuilder);
    }/**
     * 查询测试查询 未至
     */
    @Test
    public  void demo4(){
        String q = "未至";
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.profile(true);
        searchSourceBuilder.from(0);
        searchSourceBuilder.size(100);
        searchSourceBuilder.fetchSource("Name","");

        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();

        QueryStringQueryBuilder queryStringQueryBuilder = QueryBuilders.queryStringQuery(q);
        queryStringQueryBuilder.field("Name");
        queryStringQueryBuilder.analyzer("ngram_analyzer");
        queryStringQueryBuilder.defaultOperator(Operator.AND);
        boolBuilder.must(queryStringQueryBuilder);


        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("Name",q);
        boolBuilder.should(termQueryBuilder);



        searchSourceBuilder.query(boolBuilder);



        System.out.println(searchSourceBuilder);
    }

    /**
     * 这个可以用来作为公共查询方法
     */
    private SearchSourceBuilder getSearchSourceBuilderCommon(String q){
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.profile(true);
        searchSourceBuilder.from(0);
        searchSourceBuilder.size(100);
        searchSourceBuilder.fetchSource("Name","");

        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();

        QueryStringQueryBuilder queryStringQueryBuilder = QueryBuilders.queryStringQuery(q);
        queryStringQueryBuilder.field("Name");
        queryStringQueryBuilder.analyzer("ngram_analyzer");
        queryStringQueryBuilder.defaultOperator(Operator.AND);
        boolBuilder.must(queryStringQueryBuilder);


        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("Name",q);
        boolBuilder.should(termQueryBuilder);


        searchSourceBuilder.query(boolBuilder);
        return searchSourceBuilder;
    }
}
