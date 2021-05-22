package com.blossom.users.fethers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;

import com.blossom.exceptions.BlossomException;
import com.blossom.exceptions.BlossomExceptionType;
import com.blossom.usermanagmet.generated.types.User;
import com.blossom.usermanagmet.generated.types.UserInput;
import com.blossom.users.mapper.UsersMapper;
import com.blossom.users.repositories.UsersRepository;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;


@DgsComponent
public class UsersDataFetcher {

	@Autowired
	 private UsersRepository userRepository;

	  
	@DgsQuery
	public List<User> users(@InputArgument String firstNameFilter) {
		
		return List.of(UsersMapper.convertEntitiyToDTO(userRepository.findById(1).get()));
	}
	
	@DgsMutation
	public User addUser(@InputArgument UserInput user) {
		try
		{
			return UsersMapper.convertEntitiyToDTO(userRepository.save(UsersMapper.convertDTOtoEbtity(user)));
		}
		catch(DataIntegrityViolationException dataIntegrityViolationException)
		{
			throw new BlossomException(dataIntegrityViolationException,BlossomExceptionType.GENERAL,"ERR_INSERT_01", "User Was not Added, Verify The User is uniqe");
		}
					
	
	}
}