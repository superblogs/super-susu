package com.hm.yewu.esdata;

import org.junit.Test;

public class QueryDtoTest {

    @Test
    public void queryDtoTest(){
        QueryDto queryDto = new QueryDto();
        queryDto.setPageSize(100);
        System.out.println(queryDto.toString());
    }
}
