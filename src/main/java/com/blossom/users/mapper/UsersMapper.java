package com.blossom.users.mapper;

import com.blossom.usermanagmet.generated.types.User;
import com.blossom.usermanagmet.generated.types.UserInput;
import com.blossom.users.entities.Users;

public class UsersMapper {
	
	public static User convertEntitiyToDTO(Users usersEntity)
	{
		return new User(usersEntity.getFirstName(), 
						usersEntity.getLastName(), 
						usersEntity.getMiddleName(), 
						usersEntity.getNickName(), 
						usersEntity.getAge(), 
						usersEntity.getPreferredLanguage(), 
						usersEntity.getEmail());
		
	}
	
	public static Users convertDTOtoEbtity(User user)
	{
		Users usersEntity  = new Users();
		usersEntity.setFirstName(user.getFirstName());
		usersEntity.setLastName(user.getLastName());
		usersEntity.setMiddleName(user.getMiddleName());
		usersEntity.setNickName(user.getNickName());
		usersEntity.setAge(user.getAge());
		usersEntity.setPreferredLanguage(user.getPreferredLanguage());
		usersEntity.setEmail(user.getEmail());
	
		return usersEntity;
		
	}
	
	public static Users convertDTOtoEbtity(UserInput user)
	{
		Users usersEntity  = new Users();
		usersEntity.setFirstName(user.getFirstName());
		usersEntity.setLastName(user.getLastName());
		usersEntity.setMiddleName(user.getMiddleName());
		usersEntity.setNickName(user.getNickName());
		usersEntity.setAge(user.getAge());
		usersEntity.setPreferredLanguage(user.getPreferredLanguage());
		usersEntity.setEmail(user.getEmail());
	
		return usersEntity;
		
	}

}
