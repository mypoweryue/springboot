package com.example.springbootmybatis.servers;

import com.example.springbootmybatis.model.Student;
import com.example.springbootmybatis.model.Teacher;
import org.apache.ibatis.annotations.Mapper;


public interface TeacherService {
    Teacher queryStudentById(int i);
}
