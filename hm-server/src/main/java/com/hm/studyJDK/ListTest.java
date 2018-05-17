package com.hm.studyJDK;

import java.util.*;

/**
 * 用于存放备选课程的list
 */
public class ListTest {

    public List courseToSelect;

    public ListTest() {
        System.out.println("构造函数执行");
        this.courseToSelect = new ArrayList();
    }

    public void testAdd() {
        //创建一个课程对象 调用array的add方法 添加到备选课程的list中
        Course course = new Course("1", "数据结构");
        courseToSelect.add(course);
        //把新课程添加到0位置 把course 挤走,
        courseToSelect.add(0, new Course("2", "java开发课程"));

        Course[] courses = {new Course("3", "数学3"), new Course("4", "语文4")};
        //list的AddAll
        courseToSelect.addAll(Arrays.asList(courses));

        courseToSelect.forEach(i -> {
            Course eachCourse = (Course) i;
            System.out.println(eachCourse.id + ":" + eachCourse.name);
        });


    }
}

/**
 * 课程类
 */
class Course {
    public String id;
    public String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 学生类
 */
class Student {
    public String id;
    public String name;
    public Set courses;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet();
    }
}
