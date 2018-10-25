package com.example.studentdemo.service;

import com.example.studentdemo.dao.UserDao;
import com.example.studentdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User FindNameAndPsw(String username, String password) {
        return userDao.findByUsernameAndAndPassword (username, password);

    }

    public void save(User user) {
        userDao.save (user);
    }

    public List<User> findByName(String username) {
        return userDao.findByUsername (username);
    }
}

