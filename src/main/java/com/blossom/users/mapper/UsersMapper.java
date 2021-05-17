package com.blossom.users.mapper;

import com.blossom.usermanagmet.generated.types.User;
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

}
