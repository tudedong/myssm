package com.tdd.edu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author tudedong
 * @description 登录验证拦截器
 * @date 2020-05-10 21:57:57
 */
public class LoginIntercepter implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("into LoginIntercepter preHandle......");
        String username= (String) request.getSession().getAttribute("username");
        //若用户没有登录，直接访问列表页等内容，将进行拦截，直接进入登录页
        if(username == null){
            response.sendRedirect("/login");
            return false;
        }
        //若用户已经登录，则放行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
