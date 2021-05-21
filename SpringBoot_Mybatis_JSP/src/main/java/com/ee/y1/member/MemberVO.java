package com.ee.y1.member;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
//import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
public class MemberVO {
	
	private String username;
	
	//최소 4글자 이상
	@Length(max = 12, min = 6)
	private String password;
	
	@NotEmpty(message = "이름을 입력해주세요.") //name은 null이 아니여야 한다는 의미
	private String name;
	
	@Email@NotEmpty
	private String email;
	
	@NotEmpty
	private String phone;
	
	//0이상 200이하
	//@Min(value=0)@Max(value=200)
	@Range(min = 0, max = 200)
	private Integer age;

}
