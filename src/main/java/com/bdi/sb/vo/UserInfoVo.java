package com.bdi.sb.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("user")
@Data
public class UserInfoVo {
	private int uNum;
	private String tiName;
	private String tiAddr;
	private String tiEtc;
}
