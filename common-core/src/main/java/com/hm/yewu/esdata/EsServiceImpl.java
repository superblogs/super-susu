package com.hm.yewu.esdata;

import com.hm.core.es.highclient.ESConfig;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class EsServiceImpl {

    @Autowired
    public ESConfig esConfig;

    public void getData() throws IOException {


        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        searchSourceBuilder.query(QueryBuilders.termQuery("Name", "北京京东"));
        searchSourceBuilder.from(1);
        searchSourceBuilder.size(100);
        searchSourceBuilder.fetchSource("Name", "");

        SearchRequest searchRequest = new SearchRequest().source(searchSourceBuilder);

        esConfig.getRHLClient().search(searchRequest);
    }
}
