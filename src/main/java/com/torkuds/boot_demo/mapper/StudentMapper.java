package com.torkuds.boot_demo.mapper;

import com.torkuds.boot_demo.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudents();

    int deleteStudent(Long id);

    int addStudent(@Param("student") Student student);

    Student getStudent(Long id);

    List<Student> getStudentByGender(Integer gender);
}
