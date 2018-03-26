package com.hm.HttpClient;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class RestfulServicePool {

    public static void main(String[] args) {
        String url = "http://10.1.4.185:8001/saveAndSendMessage";
        String url2 = "http://10.1.4.185:8001/directSendMessage";
        AtomicLong atomicLong = new AtomicLong(1);

        HttpConnectionManager connectionManager = new HttpConnectionManager();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(200, 200, 300,
                TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(3),
                new ThreadPoolExecutor.CallerRunsPolicy());

        long start = System.currentTimeMillis();

        int sendCount = 20000;
        for (int i = 0; i < sendCount; i++) {
            executor.execute(() -> {
                try {
                    UUID uuid = UUID.randomUUID();
                    Map<String, String> maps = new HashMap<>();
                    maps.put("messageBody", "{\"messageId\":\"" + uuid.toString() + "\",\"tableName\":\"credits_source\",\"columnData\":{\"id\":\"" + atomicLong.getAndIncrement() + "\",\"person_id\":\"ccc\",\"credit\":\"aaa\",\"earn_credits_way\":\"ddd\"}}");
                    maps.put("messageId", uuid.toString());
                    maps.put("consumerQueue", "test");
                    maps.put("messageDataType", "json");

                    List<NameValuePair> nameValuePairs = new ArrayList<>();

                    for (String key : maps.keySet()) {
                        nameValuePairs.add(new BasicNameValuePair(key, maps.get(key)));
                    }

                    CloseableHttpClient httpClient = connectionManager.getHttpClient();
                    HttpPost post = new HttpPost(url);
                    post.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
                    CloseableHttpResponse response = httpClient.execute(post);

                    HttpEntity httpEntity = response.getEntity();

                    String json = IOUtils.toString(httpEntity.getContent(), "utf-8");
                    System.err.println("  <<<------   " + atomicLong + "  ------>>>" + json);

                    EntityUtils.consume(httpEntity);
                    response.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        }
        executor.shutdown();
        while (true) {
            if (executor.isTerminated()) {
                System.err.println(sendCount / ((System.currentTimeMillis() - start) / 1000));
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
