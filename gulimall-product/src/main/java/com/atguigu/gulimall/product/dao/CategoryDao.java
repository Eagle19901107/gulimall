package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author eagle
 * @email 448902121@qq.com
 * @date 2022-09-30 22:19:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
