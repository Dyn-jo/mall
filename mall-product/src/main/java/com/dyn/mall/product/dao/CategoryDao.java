package com.dyn.mall.product.dao;

import com.dyn.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-20 21:56:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
