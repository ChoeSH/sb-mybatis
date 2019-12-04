package com.bdi.sb.dao;


import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.bdi.sb.vo.UserInfoVo;

@MapperScan
public interface UserInfoMapper {
	public List<UserInfoVo> selectUserInfoList(UserInfoVo ui);
}
