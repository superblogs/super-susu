package com.hm.studyJDK;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Vector;

public class Set_Test {
    @Test
    public void choseCourseSet() {
        Student choseCourseSet = Set_Study.selectCourse();
        for (Course courses : choseCourseSet.courses){
            System.out.println(courses.id+" "+courses.name);
        }


    }
}
