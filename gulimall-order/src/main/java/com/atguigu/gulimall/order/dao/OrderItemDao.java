package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author eagle
 * @email 448902121@qq.com
 * @date 2022-10-01 00:14:57
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
