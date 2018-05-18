package com.hm.studyJDK;

public class Set_Study {

    public static Student selectCourse(){
        Student student1 = new Student("1","胡文俭");
        student1.courses.add(new Course("1","数据结构1"));
        student1.courses.add(new Course("2","数据结构2"));
        student1.courses.add(new Course("3","数据结构3"));
        student1.courses.add(new Course("4","数据结构4"));
        student1.courses.add(new Course("5","数据结构5"));
        student1.courses.add(new Course("6","数据结构6"));
        return student1;
    }

    public static Student selectCourseLinkList(){

        return null;
    }

}
