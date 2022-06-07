package com.example.springbootmybatis.web;

import com.example.springbootmybatis.model.Student;
import com.example.springbootmybatis.model.Teacher;
import com.example.springbootmybatis.servers.StudentService;
import com.example.springbootmybatis.servers.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService studentService;

    @RequestMapping(value = "/springBoot/teacher")
    public @ResponseBody
    Object student() {

        Teacher student = studentService.queryStudentById(1);

        return student;
    }
}
