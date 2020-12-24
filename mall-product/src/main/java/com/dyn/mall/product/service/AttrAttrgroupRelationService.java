package com.dyn.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dyn.mall.common.utils.PageUtils;
import com.dyn.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-20 21:56:09
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

