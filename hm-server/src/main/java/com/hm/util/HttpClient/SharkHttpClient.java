package com.hm.util.HttpClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.InputStream;

//@Component
public class SharkHttpClient {

//    @Autowired
    HttpConnectionManager connectionManager = new HttpConnectionManager();

    private ObjectMapper mapper = new ObjectMapper();

    public <T> T get(String url, Class<T> clazz) throws IOException {
        String json = httpGet(url);
        return mapper.readValue(json, clazz);
    }

    public String get(String url) throws IOException {
        String json = httpGet(url);
        return json;
    }

    public <T> T post(String url, String requestJson, Class<T> clazz) throws IOException {
        String json = httpPost(url, requestJson);
        return mapper.readValue(json, clazz);
    }

    public String post(String url, String requestJson) throws IOException {
        String json = httpPost(url, requestJson);
        return json;
    }

    private String httpGet(String url) throws IOException {
        CloseableHttpClient httpClient = connectionManager.getHttpClient();
        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse response = httpClient.execute(httpGet);
        InputStream inputStream = response.getEntity().getContent();

        String json = IOUtils.toString(inputStream, "utf-8");
        inputStream.close();
        response.close();
        return json;
    }

    private String httpPost(String url, String requestJson) throws IOException {
        CloseableHttpClient httpClient = connectionManager.getHttpClient();
        HttpPost httpPost = new HttpPost(url);

        StringEntity request = new StringEntity(requestJson, ContentType.APPLICATION_JSON);
        httpPost.setEntity(request);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        HttpEntity httpEntity = response.getEntity();

        String json = IOUtils.toString(httpEntity.getContent(), "utf-8");

        EntityUtils.consume(httpEntity);
        response.close();
        return json;
    }

}
