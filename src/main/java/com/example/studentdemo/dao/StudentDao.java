package com.example.studentdemo.dao;

import com.example.studentdemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface StudentDao extends JpaRepository<Student, Long> {
    public List<Student> findByName(String name);

    Student findById(long id);

    Long deleteById(long id);

}
