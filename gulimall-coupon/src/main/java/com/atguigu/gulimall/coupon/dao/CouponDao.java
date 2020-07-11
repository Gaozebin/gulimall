package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author gaozebin
 * @email gaozebin@gmail.com
 * @date 2020-07-10 19:18:41
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
