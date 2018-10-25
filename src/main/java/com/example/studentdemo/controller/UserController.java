package com.example.studentdemo.controller;

import com.example.studentdemo.entity.User;
import com.example.studentdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/front/*")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String index() {
        return index ();
    }

    /**
     * 去注册页面
     */
    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * 执行注册页面
     */
    @RequestMapping("/doregister")
    public String doregister(HttpServletRequest request, User user) {
        String username = request.getParameter ("username");
        String password = request.getParameter ("password");
        String password2 = request.getParameter ("password2");
        if (password.equals (password2))

            if (registerUser (username) == true) {
                User user1 = new User ();
                user1.setUsername (username);
                user1.setPassword (password);
                userService.save (user1);
                return "login";
            } else {
                return "register";
            }
        else {
            return "register";
        }


    }

    public Boolean registerUser(String username) {
        Boolean a = true;
        if (userService.findByName (username).isEmpty ()) {
            return a;
        } else {
            return false;
        }

    }

    /**
     * 去登录页面
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 执行登录
     */

    @RequestMapping("/dologin")
    public String login(HttpServletRequest request) {
        String username = request.getParameter ("username");
        String password = request.getParameter ("password");
        User user = userService.FindNameAndPsw (username, password);
        String str = "";
        if (user != null) {
            str = "index";
        } else {
            str = "register";
        }
        return str;
    }
}
