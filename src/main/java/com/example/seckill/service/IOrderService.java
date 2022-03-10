package com.example.seckill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckill.pojo.Order;
import com.example.seckill.pojo.User;
import com.example.seckill.vo.GoodsVo;
import com.example.seckill.vo.OrderDetailVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zpy
 * @since 2022-03-10
 */
public interface IOrderService extends IService<Order> {
    Order seckill(User user, GoodsVo goods);
    OrderDetailVo detail(Long orderId);

    boolean checkPath(User user, Long goodsId, String path);

    String createPath(User user, Long goodsId);

    boolean checkCaptcha(User user, Long goodsId, String captcha);
}
