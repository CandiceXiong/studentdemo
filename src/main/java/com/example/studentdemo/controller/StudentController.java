package com.example.studentdemo.controller;

import com.example.studentdemo.dao.CommonResult;
import com.example.studentdemo.entity.Student;
import com.example.studentdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    /*//添加一个学生
    @PostMapping(value = "/addstudent")
    public String addStudent() {
        return "adduser";

    }

    //修改一个学生
    @PostMapping(value = "/update")
    public String updateStudentById(Student student) {
        CommonResult result = new CommonResult ();
        try {
            studentService.updateStudentDao (student);
            return " updateuser";
        } catch (Exception e) {
            e.printStackTrace ();
            result.setState (500);
            result.setMsg ("失败");
             return "sss";
        }
    }

    //根据id删除一条数据
    @DeleteMapping(value = "/deleteStudent/{id}")
    public CommonResult deleteStudentById(@PathVariable(name = "id", required = true) long id) {
        CommonResult result = new CommonResult ();
        try {
            studentService.deleteStudentById (id);
            return result;
        } catch (Exception e) {
            e.printStackTrace ();
            result.setState (500);
            result.setMsg ("失败");
            return result;
        }
    }


    //查询所有
    @GetMapping(value = "/findAll")
    public CommonResult findAll() {
        CommonResult result = new CommonResult ();
        try {
            List<Student> list = studentService.findAll ();
            //将查询结果封装到CommonResult中
            result.setData (list);
            return result;
        } catch (Exception e) {
            e.printStackTrace ();
            result.setState (500);
            result.setMsg ("失败");
            return result;
        }
    }

    //根据id查询一条数据(2.0后不能使用findOne了)
    @GetMapping(value = "/findStudentById/{id}")
    public CommonResult findStudentById(@PathVariable(name = "id") long id) {
        CommonResult result = new CommonResult ();
        try {
            Student student = studentService.findstudentById (id);
            //将查询结果封装到CommonResult中
            result.setData (student);
            return result;
        } catch (Exception e) {
            e.printStackTrace ();
            result.setState (500);
            result.setMsg ("失败");
            return result;
        }
    }

    //根据学生姓名查询多条数据
    @GetMapping(value = "/findStudentByName")
    public CommonResult findStudentByName(String name) {
        CommonResult result = new CommonResult ();
        try {
            List<Student> studentList = studentService.findstudentByName (name);
            //将查询结果封装到CommonResult中
            result.setData (studentList);
            return result;
        } catch (Exception e) {
            e.printStackTrace ();
            result.setState (500);
            result.setMsg ("失败");
            return result;
        }*/


}

