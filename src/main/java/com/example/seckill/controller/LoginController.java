package com.example.seckill.controller;

import com.example.seckill.service.IUserService;
import com.example.seckill.vo.LoginVo;
import com.example.seckill.vo.RespBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
@RequestMapping("/login")
@Slf4j
public class LoginController {
    @Autowired
    private IUserService userService;
    /**
     * 跳转登录页
     *
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }
    /**
     * 登录
     * @return
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public RespBean doLogin(HttpServletRequest request, HttpServletResponse response, @Valid LoginVo loginVo) {
        log.info(loginVo.toString());
        return userService.login(request, response, loginVo);
    }


}
