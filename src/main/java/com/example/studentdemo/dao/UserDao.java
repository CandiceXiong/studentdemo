package com.example.studentdemo.dao;

import com.example.studentdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {
    public User findByUsernameAndAndPassword(String username, String password);

    public List<User> findByUsername(String username);

}
