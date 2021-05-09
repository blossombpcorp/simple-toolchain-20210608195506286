package com.blossom.users.fethers;

import java.util.List;
import java.util.stream.Collectors;

import com.blossom.users.dto.User;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class UsersDataFetcher {

	private final List<User> users = List.of(new User("shaul", "atiya", "shaula", 37, "shker@amel.com"),
			new User("avi", "prize", "avipr", 35, "shker@amel.com"),
			new User("dummy", "user", "dumdum", 31, "aa@amel.com"));

	@DgsQuery
	public List<User> users(@InputArgument String firstNameFilter) {
		if (firstNameFilter == null) {
			return users;
		}

		return users.stream().filter(s -> s.getFirstName().contains(firstNameFilter)).collect(Collectors.toList());
	}
}