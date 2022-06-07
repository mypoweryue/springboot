package com.example.springbootmybatis.servers.impl;

import com.example.springbootmybatis.mapper.StudentMapper;
import com.example.springbootmybatis.mapper.TeacherMapper;
import com.example.springbootmybatis.model.Student;
import com.example.springbootmybatis.model.Teacher;
import com.example.springbootmybatis.servers.StudentService;
import com.example.springbootmybatis.servers.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper studentMapper;

    @Override
    public Teacher queryStudentById(int i) {

        return studentMapper.selectByPrimaryKey(i);
    }
}
