package com.mhys.mapper;

import com.mhys.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {
     List<Student> selectAll();
     List<Student> selectByName(Student student);
     int del(int id);
     int insert(Student student);
     Student selectById(Student student);
     int update(Student student);
}
