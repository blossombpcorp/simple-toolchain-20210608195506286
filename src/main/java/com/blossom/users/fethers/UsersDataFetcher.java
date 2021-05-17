package com.blossom.users.fethers;

import java.util.List;
import java.util.stream.Collectors;

import com.blossom.exceptions.BlossomException;
import com.blossom.exceptions.BlossomExceptionType;
import com.blossom.userManagmet.generated.types.User;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;


@DgsComponent
public class UsersDataFetcher {

	private final List<User> users = List.of(new User("shaul","atiya","","shaula",12,"eng","a@b.com"));

	@DgsQuery
	public List<User> users(@InputArgument String firstNameFilter) {
		
		if (firstNameFilter == null) {
			throw new BlossomException(null,BlossomExceptionType.VALIDATION,"1","this is a test exeption");
		}

		return users.stream().filter(s -> s.getFirstName().contains(firstNameFilter)).collect(Collectors.toList());
	}
}