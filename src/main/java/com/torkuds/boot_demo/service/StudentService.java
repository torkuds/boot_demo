package com.torkuds.boot_demo.service;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.Student;
import com.torkuds.boot_demo.mapper.StudentMapper;
import com.torkuds.boot_demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentMapper studentMapper;

    public int save(Student student){
//        return studentRepository.save(student);
        return studentMapper.addStudent(student);
    }

    @Cacheable(value = "students")
//    @CacheEvict(value="students")
    public IResult getAllStudents(){
//        return studentRepository.findAll();
        IResult<List<Student>> result = new IResult<>();
        List<Student> students = studentMapper.getStudents();
        if (students != null){
            result.setSuccess(true);
            result.setMessage("获取成功");
            result.setData(students);
        } else {
            result.setSuccess(false);
            result.setMessage("获取失败");
        }
        return result;
    }

    public Student getStudentById(Long id){
//        return studentRepository.findStudentById(id);
        return studentMapper.getStudent(id);
    }

    public List<Student> getStudentByGender(Integer gender){
//        return studentRepository.findStudentById(id);
        return studentMapper.getStudentByGender(gender);
    }

    public int deleteStudentById(Long id){
//        studentRepository.deleteById(id);
        return studentMapper.deleteStudent(id);
    }

}
