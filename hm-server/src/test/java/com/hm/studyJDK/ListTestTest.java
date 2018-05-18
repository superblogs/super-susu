package com.hm.studyJDK;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTestTest {

    @Test
    public void listTest1() {
        List_Study list_study = new List_Study();
        list_study.testAdd();
    }
    @Test
    public void iterator(){
        Iterator iterator = new ArrayList().iterator();
        System.out.println(iterator.next());
    }
}
