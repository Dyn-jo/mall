package com.dyn.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dyn.mall.common.utils.PageUtils;
import com.dyn.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-23 23:10:54
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

