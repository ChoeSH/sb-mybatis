package com.bdi.sb.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdi.sb.dao.UserInfoMapper;
import com.bdi.sb.vo.UserInfoVo;

@Service
public class UserInfoService {
	@Resource
	UserInfoMapper uim;
	public int insertUserInfo(UserInfoVo uv) {
		int cnt = uim.insertUserInfo(uv);
		return cnt;
	}
}
