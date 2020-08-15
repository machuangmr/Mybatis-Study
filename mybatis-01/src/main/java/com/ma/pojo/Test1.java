package com.ma.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 请添加注释
 *
 * @author <a href="mailto:macd@zjport.gov.cn">macd</a>
 * @version 3
 * @since 3.0
 */
public class Test1 {
    public static void main(String[] args) {
        Student sut1 = new Student(1, "wang");
        Student stu2 = new Student(2, "li");
        List<Student> students = new ArrayList<Student>();
        students.add(stu2);
        students.add(sut1);
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // 这里使用Integer比较，不能使用int,
                return s2.getId().compareTo(s2.getId());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

