package com.hm.core.es;

import org.junit.Test;

public class EsApi {
    @Test
    public void createIndex(){
         String initString = "{"+
                "\"settings\": {"+
                "\"index\": {"+
                "\"analysis\": {"+
                "\"analyzer\": {"+
                "\"ngram_analyzer\": {"+
                "\"tokenizer\": \"ngram_tokenizer\""+
                "}"+
                "},"+
                "\"tokenizer\": {"+
                "\"ngram_tokenizer\": {"+
                "\"token_chars\": ["+
                "\"letter\""+
                ","+
                "\"digit\""+
                "],"+
                "\"min_gram\": \"2\","+
                "\"type\": \"ngram\","+
                "\"max_gram\": \"20\""+
                "}"+
                "}"+
                "}"+
                "}"+
                "},"+
                "\"mappings\": {"+
                "\"eci_detail_company_info\": {"+
                "\"dynamic\": \"true\","+
                "\"properties\": {"+
                "\"RegistCapi\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"BelongOrg\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"CreditCode\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"Email\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"Address\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"EconKind\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"UpdatedDate\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"SubIndustry\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"companyhot\": {"+
                "\"type\": \"long\""+
                "},"+
                "\"Name\": {"+
                "\"analyzer\": \"ngram_analyzer\","+
                "\"type\": \"text\""+
                "},"+
                "\"Industry\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"StartDate\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"CheckDate\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"Status\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"No\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"OperName\": {"+
                "\"type\": \"text\""+
                "},"+
                "\"IndustryCode\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"City\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"OrgNo\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"OriginalName\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"EndDate\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"Province\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"TermStart\": {"+
                "\"type\": \"text\""+
                "},"+
                "\"KeyNo\": {"+
                "\"type\": \"text\""+
                "},"+
                "\"TeamEnd\": {"+
                "\"type\": \"text\""+
                "},"+
                "\"SubIndustryCode\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"is_expired\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"Scope\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"regist_capi_desc\": {"+
                "\"type\": \"text\""+
                "},"+
                "\"PhoneNumber\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "},"+
                "\"startyear\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"created_date\": {"+
                "\"type\": \"keyword\""+
                "},"+
                "\"regist_capi\": {"+
                "\"type\": \"double\""+
                "},"+
                "\"EnglishName\": {"+
                "\"analyzer\": \"ik_max_word\","+
                "\"type\": \"text\""+
                "}"+
                "}"+
                "}"+
                "}"+
                "}";
        System.out.println(initString);
    }

}
