package com.hm.studyJDK;

import java.util.*;

/**
 * 用于存放备选课程的list
 * ArrayList 元素可以重复
 */
public class List_Study {

    //带有泛型的List
    private ArrayList<Course> courseToSelect;

    List_Study() {
        System.out.println("构造函数执行");
        this.courseToSelect = new ArrayList<>();
    }

    public List<Course> addCourseList() {
        //创建一个课程对象 调用array的add方法 添加到备选课程的list中
        Course course = new Course("1", "数据结构");
        courseToSelect.add(course);
        //把新课程添加到0位置 把course 挤走,
        courseToSelect.add(0, new Course("2", "java开发课程"));

        Course[] courses = {new Course("3", "数学3"), new Course("3", "数学3"), new Course("4", "语文4")};
        //list的AddAll
        courseToSelect.addAll(Arrays.asList(courses));

        courseToSelect.set(0, new Course("0", "修改List0的位置的课程"));
        courseToSelect.remove(0);
        courseToSelect.remove(new Course("3", "数学3"));
        return courseToSelect;
    }

    /**
     * 泛型结合可以添加泛型子类的对象实例
     */
    public void testChildList() {
        ChildCourse childCourse = new ChildCourse("100", "100Name", "child100");

        courseToSelect.add(childCourse);
        getList(courseToSelect);
    }

    /**
     * 从List取出元素 并打印
     */
    public void getList(List courseToSelect) {
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

    Course() {
    }

    Course(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

/**
 * 课程子类
 */
class ChildCourse extends Course {
    private String child;

    ChildCourse(String id, String name, String child) {
        this.id = id;
        this.name = name;
        this.child = child;
    }
}

/**
 * 学生类
 */
class Student {
    public String id;
    public String name;
    public Set<Course> courses;


    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new HashSet<>();
    }
}
