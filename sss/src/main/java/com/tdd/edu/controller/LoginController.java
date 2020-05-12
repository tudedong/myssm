package com.tdd.edu.controller;

import com.tdd.edu.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author tudedong
 * @description 登录控制器
 * @date 2020-05-10 22:13:58
 */
@Controller
public class LoginController {

    @Autowired
    private ResumeService resumeService;

    /**
     * 登录：拦截过后跳转到登录页
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String  toLogin() {
        return "login";
    }

    /**
     * 登录：处理登录请求
     * @param username
     * @param password
     * @param modelAndView
     * @param session
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username, String password, ModelAndView modelAndView, HttpSession session) {
        if("admin".equals(username) && "admin".equals(password)){
            session.setAttribute("username",username);
            return "redirect:/resume/findAll";
        }
        //登录失败
        modelAndView.addObject("msg","用户名或密码错误！");
        return "login";
    }

}
