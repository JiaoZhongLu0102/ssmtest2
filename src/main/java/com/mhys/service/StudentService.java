package com.mhys.service;

import com.mhys.mapper.StudentMapper;
import com.mhys.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    public List<Student> selectAll(){
        return studentMapper.selectAll();
    }
    public List<Student> selectByName(Student student){
        return studentMapper.selectByName(student);
    }

    public int del(int id){
        return  studentMapper.del(id);
    }
    public int insert(Student student){
        return  studentMapper.insert(student);
    }

    public Student selectById(Student student){
        return  studentMapper.selectById(student);
    }
    public int update(Student student){
        return  studentMapper.update(student);
    }

}
