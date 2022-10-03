package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author eagle
 * @email 448902121@qq.com
 * @date 2022-10-01 00:13:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
