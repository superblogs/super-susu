
package com.hm.common.es;

import com.alibaba.fastjson.JSON;
import com.hm.util.UtilHello;

import java.util.List;

public class ZjsGetEs {
    public static void main(String[] args) {
        querySearch("小米 雷军");
    }

    private static void querySearch(String q) {
        String url = "http://172.29.11.50:8001/creditdb/_search";
        String queryByCompanyName = "{\n" +
                "  \"query\": {\n" +
                "    \"match_phrase_prefix\": {\n" +
                "      \"Name\": \""+q+"\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"sort\": [\n" +
                "    {\n" +
                "      \"_score\": {\n" +
                "        \"order\": \"desc\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"regist_capi\": {\n" +
                "        \"order\": \"desc\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"_source\": [\n" +
                "    \"Name\",\n" +
                "    \"OperName\",\n" +
                "    \"City\",\n" +
                "    \"regist_capi\"\n" +
                "  ]\n" +
                "}";

        String queryByPersonName = "{\n" +
                "  \"query\": {\n" +
                "    \"query_string\": {\n" +
                "      \"fields\": [\n" +
                "        \"_all^0.1\",\n" +
                "        \"OperName^5\",\n" +
                "        \"City\"\n" +
                "      ],\n" +
                "      \"query\": \"\\\"" + q + "\\\"\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"aggs\": {\n" +
                "    \"Province\": {\n" +
                "      \"terms\": {\n" +
                "        \"field\": \"Province\"\n" +
                "      }\n" +
                "    },\n" +
                "    \"SubIndustry\": {\n" +
                "      \"terms\": {\n" +
                "        \"field\": \"SubIndustry\"\n" +
                "      }\n" +
                "    }\n" +
                "  },\n" +
                "  \"sort\": [\n" +
                "    {\n" +
                "      \"regist_capi\": {\n" +
                "        \"order\": \"desc\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"_score\": {\n" +
                "        \"order\": \"desc\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"from\": 0,\n" +
                "  \"size\": 10\n" +
                "}";

        String queryByCompanyName1="{\n" +
                "  \"query\": {\n" +
                "    \"bool\": {\n" +
                "      \"must\": {\n" +
                "        \"match\": {\n" +
                "          \"Name\": \""+q+"\"\n" +
                "        }\n" +
                "      },\n" +
                "      \"should\": [\n" +
                "        {\n" +
                "          \"term\": {\n" +
                "            \"Name\": \"科技\"\n" +
                "          }\n" +
                "        }\n" +
                "      ]\n" +
                "    }\n" +
                "  }\n" +
                "}";

        EsBaseDto esBaseDto = GetEsData.getInfoByName(url, UtilHello.isNameBoolean(q) ? queryByPersonName : queryByCompanyName1);
        List<EsBaseDto.Hits.Hits_> list = esBaseDto.getHits().getHits();
        for (EsBaseDto.Hits.Hits_ aList : list) {
            CompanyInfo companyInfo = JSON.parseObject(aList.get_source(), CompanyInfo.class);
            System.out.print(companyInfo.getOperName());
            System.out.println(" " + companyInfo.getName());

        }
    }
}
