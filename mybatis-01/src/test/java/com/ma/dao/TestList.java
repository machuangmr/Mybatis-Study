package com.ma.dao;

import lombok.Data;

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
public class TestList {
    public static void main(String[] args) {
        Student stu1 = new Student(1, "wang");
        Student stu2 = new Student(2, "li");
        List<Student> students = new ArrayList<Student>();
        students.add(stu1);
        students.add(stu2);
        Collections.sort(students, stu1);
    }
}


class Student implements Comparator<Student>{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compare(Student o1, Student o2) {
        if (o1.getId()  > o2.getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}