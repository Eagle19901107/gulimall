package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author eagle
 * @email 448902121@qq.com
 * @date 2022-09-30 23:56:43
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
