package com.blossom.users.repositories;

import org.springframework.data.repository.CrudRepository;

import com.blossom.users.entities.Users;

public interface  UsersRepository  extends CrudRepository<Users, Integer> {

}
