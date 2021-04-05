package com.torkuds.boot_demo.repository;

import com.torkuds.boot_demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findAll();

    void deleteById(Long id);

    Student save(Student student);

    Student findStudentById(Long id);


}
