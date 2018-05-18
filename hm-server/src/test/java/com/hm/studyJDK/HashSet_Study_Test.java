package com.hm.studyJDK;

import org.junit.Test;

public class HashSet_Study_Test {
    @Test
    public void choseCourseSet() {
        Student choseCourseSet = HashSet_Study.selectCourse();
        for (Course courses : choseCourseSet.courses){
            System.out.println(courses.id+" "+courses.name);
        }
    }
}
