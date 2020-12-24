package com.dyn.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dyn.mall.common.utils.PageUtils;
import com.dyn.mall.ware.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author dyn
 * @email 596324727@qq.com
 * @date 2020-12-23 23:17:14
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

