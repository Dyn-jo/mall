package com.dyn.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dyn.mall.common.utils.PageUtils;
import com.dyn.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-23 23:05:10
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

