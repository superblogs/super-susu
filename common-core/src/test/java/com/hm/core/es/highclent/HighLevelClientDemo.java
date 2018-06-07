package com.hm.core.es.highclent;

import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;

import java.io.IOException;

public class HighLevelClientDemo {
    @Test
    public void demo1() throws IOException {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost", 9200, "http")).build());

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
        searchSourceBuilder.aggregation(AggregationBuilders.terms("top_10_states").field("state").size(10));
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("social-*");
        searchRequest.source(searchSourceBuilder);
        //@Todo 查询SearchRequestBuilder && SearchSourceBuilder 的关系
        //SearchRequestBuilder

        SearchResponse searchResponse = client.search(searchRequest);

        System.out.println(searchResponse.getHits());
    }
}
