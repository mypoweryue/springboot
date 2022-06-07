package com.example.springbootmybatis.servers;

import com.example.springbootmybatis.model.Student;

public interface StudentService {
    Student queryStudentById(int i);
}
