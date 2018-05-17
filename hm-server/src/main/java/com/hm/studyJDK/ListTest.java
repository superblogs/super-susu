package com.hm.studyJDK;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用于存放备选课程的list
 */
public class ListTest {

    public List courseToSelect;
    public ListTest(){
        System.out.println("构造函数执行");
        this.courseToSelect=new ArrayList();
    }

    public void testAdd(){
        //创建一个课程对象 调用array的add方法 添加到备选课程的list中
        Course course = new Course("1","数据结构");
        courseToSelect.add(course);
        Course course1 = (Course) courseToSelect.get(0);
        System.out.println("添加了课程: "+course1.id+":"+course1.name);
    }
}

/**
 * 课程类
 */
class Course {
    public String id;
    public String name;

    public  Course(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 学生类
 */
class Student{
    public String id;
    public String name;
    public Set courses;
    public Student(String id,String name){
        this.id=id;
        this.name=name;
        this.courses=new HashSet();
    }
}
