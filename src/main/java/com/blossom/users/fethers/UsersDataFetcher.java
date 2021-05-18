package com.blossom.users.fethers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blossom.exceptions.BlossomException;
import com.blossom.exceptions.BlossomExceptionType;
import com.blossom.usermanagmet.generated.types.User;
import com.blossom.users.mapper.UsersMapper;
import com.blossom.users.repositories.UsersRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;


@DgsComponent
public class UsersDataFetcher {

	@Autowired
	 private UsersRepository userRepository;

	  
	@DgsQuery
	public List<User> users(@InputArgument String firstNameFilter) {
		
		if (firstNameFilter == null) {
			throw new BlossomException(null,BlossomExceptionType.VALIDATION,"1","this is a test exeption");
		}
		
		return List.of(UsersMapper.convertEntitiyToDTO(userRepository.findById(1).get()));
	}
}