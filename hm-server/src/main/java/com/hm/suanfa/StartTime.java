package com.hm.suanfa;

import java.util.Date;

public class StartTime {

    public static Date startTime;

    static {
        startTime = new Date();
        System.out.println("执行启动时间" + startTime);
    }
}
