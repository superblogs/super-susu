package com.hm.core.es.highclent;

import org.apache.http.HttpHost;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SaveEsBulkTest {

    private String index = "credit";

    private String _type = "companyInfo";


    private RestHighLevelClient rhlClient = new RestHighLevelClient(
            RestClient.builder(new HttpHost("172.16.0.194", 9200, "http")).build());


    @Test
    public void batchAddTest() {
        long start = System.currentTimeMillis();
        BulkRequest bulkRequest = new BulkRequest();


        List<IndexRequest> requests = generateRequests();

        requests.forEach(bulkRequest::add);
        try {
            rhlClient.bulk(bulkRequest);
            long time = System.currentTimeMillis() - start;
            System.out.println("市场" + time);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<IndexRequest> generateRequests() {
        List<IndexRequest> requests = new ArrayList<>();
        IntStream.range(0, 20000).forEach(i -> {
            requests.add(generateNewsRequest("341231"));
        });
        return requests;
    }

    public IndexRequest generateNewsRequest(String companId) {
        IndexRequest indexRequest = new IndexRequest(index, _type);
        String source = "{\"title\":34263627462378}";
        indexRequest.source(source, XContentType.JSON);
        return indexRequest;
    }


}
