package com.dyn.mall.coupon.dao;

import com.dyn.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-23 23:01:03
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
