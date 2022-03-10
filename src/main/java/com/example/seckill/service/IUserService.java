package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.pojo.User;
import com.example.seckill.vo.LoginVo;
import com.example.seckill.vo.RespBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zpy
 * @since 2022-03-03
 */
public interface IUserService extends IService<User> {
    RespBean login(HttpServletRequest request, HttpServletResponse response, LoginVo loginVo);
    User getByUserTicket(String userTicket,HttpServletRequest request,HttpServletResponse response);

    RespBean updatePassword(String userTicket,Long id,String password);
}
