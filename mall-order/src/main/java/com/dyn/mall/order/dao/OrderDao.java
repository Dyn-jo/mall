package com.dyn.mall.order.dao;

import com.dyn.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-23 23:10:54
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
