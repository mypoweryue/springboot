package com.example.springbootmybatis.servers.impl;

import com.example.springbootmybatis.mapper.StudentMapper;
import com.example.springbootmybatis.model.Student;
import com.example.springbootmybatis.servers.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student queryStudentById(int i) {
        return studentMapper.selectByPrimaryKey(i);
    }
}
