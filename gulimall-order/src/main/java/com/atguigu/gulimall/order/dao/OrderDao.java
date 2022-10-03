package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author eagle
 * @email 448902121@qq.com
 * @date 2022-10-01 00:14:56
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
