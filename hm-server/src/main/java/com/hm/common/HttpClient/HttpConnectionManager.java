package com.hm.common.HttpClient;

import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.LayeredConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;
import java.security.NoSuchAlgorithmException;

@Component
public class HttpConnectionManager {

    private PoolingHttpClientConnectionManager connectionManager = null;

    public HttpConnectionManager() {
        this.init();
    }

    //    @PostConstruct
    private void init() {
        LayeredConnectionSocketFactory socketFactory = null;

        try {
            socketFactory = new SSLConnectionSocketFactory(SSLContext.getDefault());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        assert socketFactory != null;
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                .register("https", socketFactory)
                .register("http", new PlainConnectionSocketFactory())
                .build();

        connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        connectionManager.setMaxTotal(300);
        connectionManager.setDefaultMaxPerRoute(connectionManager.getMaxTotal());
    }

    public CloseableHttpClient getHttpClient() {

        RequestConfig requestConfig = RequestConfig.custom()
                .setConnectTimeout(3 * 1000)
                .setSocketTimeout(60 * 1000)
                .setConnectionRequestTimeout(500)
                .build();

        return HttpClients.custom().setConnectionManager(connectionManager).setDefaultRequestConfig(requestConfig).build();
    }
}
