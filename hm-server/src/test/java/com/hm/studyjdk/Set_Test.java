package com.hm.studyjdk;

import org.junit.Test;

public class Set_Test {
    @Test
    public void choseCourseSet() {
        Student choseCourseSet = Set_Study.selectCourse();
        for (Course courses : choseCourseSet.courses){
            System.out.println(courses.id+" "+courses.name);
        }


    }
}
