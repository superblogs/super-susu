package com.hm.studyJDK;

import org.junit.Test;

public class ListTestTest {

    @Test
    public void listTest1() {
        ListTest listTest = new ListTest();
        listTest.testAdd();


        String htllo = "";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();

        /**
         * 测试reverse方法
         */
        stringBuffer.append("中国我爱你");
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        builder.append("中国我爱你");
        builder.reverse();
        System.out.println(builder);
    }
}
