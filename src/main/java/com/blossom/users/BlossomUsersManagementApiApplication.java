package com.blossom.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.blossom.exceptions.BlossomDataFetchingExceptionHandler;


@Import({
	BlossomDataFetchingExceptionHandler.class
})
@SpringBootApplication
public class BlossomUsersManagementApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlossomUsersManagementApiApplication.class, args);
		
		
	}

}
