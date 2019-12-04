package com.bdi.sb.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("user")
@Data
public class UserInfoVo {
	private int[] uiNums;
	private String uiNum;
	private String active;
	private String uiName; 
	private String uiId; 
	private String uiPwd;
	private String credat;
	private String cretim;
	private String moddat;
	private String modtim;
	private String[] search;
	private String searchStr;
}
