package com.dyn.mall.member.dao;

import com.dyn.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-23 23:05:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
