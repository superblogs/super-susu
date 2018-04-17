package com.hm.common.es;

import com.hm.common.HttpClient.HttpConnectionManager;
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

public class TestEsData {

    public static void main(String[] args) {


        String url = "http://172.29.11.50:8001/";

        UUID uuid = UUID.randomUUID();
        Map<String, String> maps = new HashMap<>();
        maps.put("messageBody", "{\"messageId\":\"" + uuid.toString() +
                "\",\"tableName\":\"credits_source\",\"columnData\":{\"id\":\""
                + "\",\"person_id\":\"ccc\",\"credit\":\"aaa\",\"earn_credits_way\":\"ddd\"}}");
        maps.put("messageId", uuid.toString());
        maps.put("consumerQueue", "test");
        maps.put("messageDataType", "json");

        List<NameValuePair> nameValuePairs = new ArrayList<>();

        for (String key : maps.keySet()) {
            nameValuePairs.add(new BasicNameValuePair(key, maps.get(key)));
        }

        HttpConnectionManager connectionManager = new HttpConnectionManager();
        CloseableHttpClient httpClient = connectionManager.getHttpClient();
        HttpPost post = new HttpPost(url);
        try {
            post.setEntity(new UrlEncodedFormEntity(nameValuePairs, "UTF-8"));
            CloseableHttpResponse response = httpClient.execute(post);

            HttpEntity httpEntity = response.getEntity();

            String json = IOUtils.toString(httpEntity.getContent(), "utf-8");

            System.out.println(json);

            EntityUtils.consume(httpEntity);
            response.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
