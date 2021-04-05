package com.torkuds.boot_demo.controller;

import com.torkuds.boot_demo.base.IResult;
import com.torkuds.boot_demo.entity.Student;
import com.torkuds.boot_demo.repository.StudentRepository;
import com.torkuds.boot_demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class FirstController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id){
//        return "hello spring boot hahaha";
        return id.toString();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public int save(@RequestBody Student student, HttpSession httpSession){
        return studentService.save(student);
    }

    @RequestMapping(value = "/getAllStudents", method = RequestMethod.POST)
    public IResult getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/getStudentById", method = RequestMethod.POST)
    public Student getStudentById(@RequestBody Long id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/getStudentByGender", method = RequestMethod.POST)
    public List<Student> getStudentById(@RequestParam(value = "gender") Integer gender){
        return studentService.getStudentByGender(gender);
    }

    @RequestMapping(value = "/deleteStudentById", method = RequestMethod.POST)
    public String deleteStudentById(@RequestParam(value = "id") Long id){
        studentService.deleteStudentById(id);
        return "删除成功";
    }

}
