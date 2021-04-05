package com.torkuds.boot_demo.service;

import com.torkuds.boot_demo.entity.Student;

import java.util.List;

public interface StudentService2 {

    List<Student> getAllStudents();

    int deleteStudent(int id);
}
