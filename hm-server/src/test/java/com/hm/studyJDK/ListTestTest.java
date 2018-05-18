package com.hm.studyJDK;

import org.junit.Test;

import java.util.*;

public class ListTestTest {


    @Test
    public void listTestAll() {
        ArrayList arrayList = new ArrayList();

        LinkedList linkedList = new LinkedList();

        Vector vector = new Vector();

    }

    @Test
    public void listTest1() {
        List_Study list_study = new List_Study();
        List list = list_study.addCourseList();
        list_study.getList(list);
    }

    @Test
    public void childListTest1() {
        List_Study list_study = new List_Study();
        list_study.testChildList();
    }

    @Test
    public void iterator() {
        Iterator iterator = new ArrayList().iterator();
        System.out.println(iterator.next());
    }
}
