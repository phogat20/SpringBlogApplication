package com.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class UserDto {
	
	private Integer id;
	
	@NotEmpty
	@Size(min = 4,message = "Username must be more than 4 charaacters")
	private String name;
	
	@Email(message = "Please enter valid Email!!")
	private String email;
	
	@NotEmpty
	@Pattern(message = "Password must be min 3 char and maximumb of 10 char", regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$" )
	@Size(min = 3,max=10)	
	
	private String password;
	
	@NotEmpty
	private String about;
	
}
