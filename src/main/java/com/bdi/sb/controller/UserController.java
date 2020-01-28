package com.bdi.sb.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdi.sb.dao.UserInfoMapper;
import com.bdi.sb.service.UserInfoService;
import com.bdi.sb.vo.UserInfoVo;

@RestController
public class UserController {
	@Resource
	UserInfoService uis;
	@Resource
	UserInfoMapper uim;
	
	@GetMapping("/users")
	public List<UserInfoVo> getUserInfos(){
		return uim.selectUserInfoList(null);
	}
	
	@PostMapping("/insert")
	public int insertUserInfo(@ModelAttribute UserInfoVo uv){
		return uis.insertUserInfo(uv);
	}
}
	
