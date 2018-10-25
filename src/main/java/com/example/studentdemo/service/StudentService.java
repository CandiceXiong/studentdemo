package com.example.studentdemo.service;

import com.example.studentdemo.dao.StudentDao;
import com.example.studentdemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    //插入一个学生
    public void addstudent(Student student) {
        studentDao.save (student);
    }
    //修改一个学生

    public void updateStudentDao(Student student) {
        studentDao.save (student);

    }

    //根据id删除一条数据
    public void deleteStudentById(long id) {
        studentDao.deleteById (id);
    }

    //查询所有
    public List<Student> findAll() {
        return studentDao.findAll ();
    }

    //根据id查询一条数据
/*    public Student findstudentById(long id) {
        return studentDao.findById (id).get ();
    }*/

    //根据学生姓名查询多条数据
    public List<Student> findstudentByName(String name) {
        return studentDao.findByName (name);
    }
}
