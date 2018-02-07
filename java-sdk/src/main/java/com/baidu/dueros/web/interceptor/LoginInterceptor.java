package com.baidu.dueros.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    /**
     * <p>
     * 拦截器的前校验
     * </p>
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //        PubLoginUserContext.clear();
        System.out.println("test...");
        if (false) {
            try {
                //                response.sendRedirect(propProvider.getPubLoginPath());
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}
