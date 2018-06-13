package com.hm.core.es.highclent;

import com.alibaba.fastjson.JSON;
import com.hm.core.es.highclient.ESConfig;
import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.*;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class HighLevelClientDemo {


    @Test
    public void demo1() throws IOException {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")).build());
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchSourceBuilder.aggregation(AggregationBuilders.terms("小米科技").field("Name").size(100));
        SearchRequest searchRequest = new SearchRequest();
//        searchRequest.indices("social-*");
        searchRequest.source(searchSourceBuilder);
        //@Todo 查询SearchRequestBuilder && SearchSourceBuilder 的关系
        //SearchRequestBuilder

        SearchResponse searchResponse = client.search(searchRequest);

        System.out.println(searchResponse.getHits());
    }

    @Test
    public void demo2() throws IOException {
        RestHighLevelClient client = new ESConfig().getRHLClient();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        searchSourceBuilder.query(QueryBuilders.termQuery("Name", "北京京东"));
        searchSourceBuilder.from(1);
        searchSourceBuilder.size(100);
        searchSourceBuilder.fetchSource("Name", "");

        SearchRequest searchRequest = new SearchRequest().source(searchSourceBuilder);
        SearchResponse searchResponse = client.search(searchRequest);


        SearchHit[] searchHits = searchResponse.getHits().getHits();

        Arrays.stream(searchHits).forEach(i -> System.out.println(i.getSource().get("Name")));

        System.out.println(searchResponse);
    }

    @Test
    public void demo3() throws Exception {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")).build());
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        searchSourceBuilder.query(QueryBuilders.termQuery("OperName", "范文化"));
        searchSourceBuilder.from(1);
        searchSourceBuilder.size(100);

        SearchRequestBuilder searchRequestBuilder;

        System.out.println(searchSourceBuilder);
//        searchSourceBuilder.fetchSource("Name", "");

        SearchRequest searchRequest = new SearchRequest().source(searchSourceBuilder);
        SearchResponse searchResponse = client.search(searchRequest);


        SearchHit[] searchHits = searchResponse.getHits().getHits();

        Arrays.stream(searchHits).forEach(i -> System.out.println(i.getSource().get("Name")));

        System.out.println(searchResponse);
    }

    @Test
    public void demo4() {
        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.from(0);
        sourceBuilder.size(10);
        sourceBuilder.fetchSource(new String[]{"title"}, new String[]{});
        MatchQueryBuilder matchQueryBuilder = QueryBuilders.matchQuery("title", "费德勒");
        TermQueryBuilder termQueryBuilder = QueryBuilders.termQuery("tag", "体育");
        RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery("publishTime");
        rangeQueryBuilder.gte("2018-01-26T08:00:00Z");
        rangeQueryBuilder.lte("2018-01-26T20:00:00Z");
        BoolQueryBuilder boolBuilder = QueryBuilders.boolQuery();
        boolBuilder.must(matchQueryBuilder);
        boolBuilder.must(termQueryBuilder);
        boolBuilder.must(rangeQueryBuilder);
        System.out.println(boolBuilder);

        sourceBuilder.query(boolBuilder);
        System.out.println(sourceBuilder);
//        SearchRequest searchRequest = new SearchRequest(index);
//        searchRequest.types(type);
//        searchRequest.source(sourceBuilder);
    }

    /**
     * if u know the query_sql
     * use the query_sql
     * because this way is the faster
     */
    @Test
    public void testTheTime() {
        System.out.println("{\n" +
                "  \"from\" : 0,\n" +
                "  \"size\" : 10,\n" +
                "  \"query\" : {\n" +
                "    \"bool\" : {\n" +
                "      \"must\" : [\n" +
                "        {\n" +
                "          \"match\" : {\n" +
                "            \"title\" : {\n" +
                "              \"query\" : \"费德勒\",\n" +
                "              \"operator\" : \"OR\",\n" +
                "              \"prefix_length\" : 0,\n" +
                "              \"max_expansions\" : 50,\n" +
                "              \"fuzzy_transpositions\" : true,\n" +
                "              \"lenient\" : false,\n" +
                "              \"zero_terms_query\" : \"NONE\",\n" +
                "              \"boost\" : 1.0\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"term\" : {\n" +
                "            \"tag\" : {\n" +
                "              \"value\" : \"体育\",\n" +
                "              \"boost\" : 1.0\n" +
                "            }\n" +
                "          }\n" +
                "        },\n" +
                "        {\n" +
                "          \"range\" : {\n" +
                "            \"publishTime\" : {\n" +
                "              \"from\" : \"2018-01-26T08:00:00Z\",\n" +
                "              \"to\" : \"2018-01-26T20:00:00Z\",\n" +
                "              \"include_lower\" : true,\n" +
                "              \"include_upper\" : true,\n" +
                "              \"boost\" : 1.0\n" +
                "            }\n" +
                "          }\n" +
                "        }\n" +
                "      ],\n" +
                "      \"disable_coord\" : false,\n" +
                "      \"adjust_pure_negative\" : true,\n" +
                "      \"boost\" : 1.0\n" +
                "    }\n" +
                "  },\n" +
                "  \"_source\" : {\n" +
                "    \"includes\" : [\n" +
                "      \"title\"\n" +
                "    ],\n" +
                "    \"excludes\" : [ ]\n" +
                "  }\n" +
                "}");
    }
}
