package com.hm.core.es.highclent;

import com.hm.core.es.lowlevelClient.LowLevelClientDemo;
import org.apache.http.HttpHost;
import org.apache.http.util.EntityUtils;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.junit.Test;

import java.io.IOException;

public class LowLevelRestClientDemo {

    @Test
    public void demo1() {
        //初始化客户端
        RestClient restClient = RestClient.builder(
                new HttpHost("xxxx", 9800, "http"),
                new HttpHost("xxxx", 9800, "http")).build();


        //关闭客户端连接
        try {
            restClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void demo2() throws Exception {
        RestClient restClient = new LowLevelClientDemo().getRestClient();
        String method = "GET";
        String endpoint = "/index/test/1";
        Response response = restClient.performRequest(method, endpoint);
        System.out.println(EntityUtils.toString(response.getEntity()));
        restClient.close();
    }
}
