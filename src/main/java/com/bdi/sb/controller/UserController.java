package com.bdi.sb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdi.sb.dao.UserInfoMapper;
import com.bdi.sb.vo.UserInfoVo;


@RestController
public class UserController {
	
	@Resource
	UserInfoMapper uim;
	
	@GetMapping("/users")
	public List<UserInfoVo> getUserInfos(){
		return uim.selectUserInfoList(null);
	}
}
	
