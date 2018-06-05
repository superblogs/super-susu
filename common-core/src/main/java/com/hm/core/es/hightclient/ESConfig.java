package com.hm.core.es.hightclient;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackageClasses = ESClientSpringFactory.class)
public class ESConfig {
    @Value("${httpHost.host}")
    private String host;

    @Value("${httpHost.port}")
    private int port;

    @Value("${httpHost.schema}")
    private String schema;

    @Value("${esclient.connectNum}")
    private Integer connectNum;

    @Value("${esclient.connectPerRoute}")
    private Integer connectPerRoute;


    @Bean
    public HttpHost httpHost() {
        return new HttpHost(host, port, schema);
    }

    @Bean(initMethod = "init", destroyMethod = "close")
    public ESClientSpringFactory getFactory() {
        return ESClientSpringFactory.
                build(httpHost(), connectNum, connectPerRoute);
    }

    @Bean
    @Scope("singleton")
    public RestClient getSingletonRestClient() {
        return getFactory().getClient();
    }

    @Bean
    @Scope("prototype")
    public RestClient getPrototypeRestClient() {
        return getFactory().getClient();
    }

    @Bean
    @Scope("singleton")
    public RestHighLevelClient getRHLClient() {
        return getFactory().getRhlClient();
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Integer getConnectNum() {
        return connectNum;
    }

    public void setConnectNum(Integer connectNum) {
        this.connectNum = connectNum;
    }

    public Integer getConnectPerRoute() {
        return connectPerRoute;
    }

    public void setConnectPerRoute(Integer connectPerRoute) {
        this.connectPerRoute = connectPerRoute;
    }
}
