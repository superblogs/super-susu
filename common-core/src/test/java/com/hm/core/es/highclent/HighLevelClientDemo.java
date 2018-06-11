package com.hm.core.es.highclent;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
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
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")).build());
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
    public void demo3() throws Exception{
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")).build());
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        searchSourceBuilder.query(QueryBuilders.termQuery("OperName", "范文化"));
        searchSourceBuilder.from(1);
        searchSourceBuilder.size(100);

        SearchRequestBuilder searchRequestBuilder ;

        System.out.println(searchSourceBuilder);
//        searchSourceBuilder.fetchSource("Name", "");

        SearchRequest searchRequest = new SearchRequest().source(searchSourceBuilder);
        SearchResponse searchResponse = client.search(searchRequest);


        SearchHit[] searchHits = searchResponse.getHits().getHits();

        Arrays.stream(searchHits).forEach(i -> System.out.println(i.getSource().get("Name")));

        System.out.println(searchResponse);
    }
}
