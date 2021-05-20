package com.ee.y1.member;

import javax.validation.constraints.Email;
//import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MemberVO {
	
	private String username;
	private String password;
	
	@NotEmpty //name은 null이 아니여야 한다는 의미
	private String name;
	@Email
	private String email;
	private String phone;

}
