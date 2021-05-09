package com.blossom.users.dto;

import lombok.Data;
import lombok.NonNull;



@Data
public class User {
	
	@NonNull
	private String firstName;
	
	@NonNull
	private String lastName;
	
	private String middleName;
	
	@NonNull
	private String nickName;
	
	@NonNull
	private Integer age;
	
	private String preferredLanguag;
	
	@NonNull
	private String email;

}
