package com.dyn.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dyn.mall.common.utils.PageUtils;
import com.dyn.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-20 21:56:09
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

