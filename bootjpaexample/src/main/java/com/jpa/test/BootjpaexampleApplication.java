package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
	    
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		/*
		//create user object
		User user1=new User();
		user1.setName("vikash jha");
		user1.setCity("punjab");
		user1.setStatus("python programer");
		
		User user2=new User();
		user2.setName("Vinay jha");
		user2.setCity("Bihar");
		user2.setStatus("C++ programer");
		
		List<User> users=List.of(user1,user2);
		
		Iterable<User> result = userRepository.saveAll(users);
		
		result.forEach(user->{
			
			System.out.println(user);
		});
		
		*/
		
		/*
		//Update User
		Optional<User> optional = userRepository.findById(3);
		
		User user=optional.get();
		user.setName("Jigyasa Jha");
		User result = userRepository.save(user);
		
		System.out.println(result);
		
		//Read user
		Iterable<User> itr = userRepository.findAll();
		
		Iterator<User> iterator=itr.iterator();
		
		while(iterator.hasNext())
		{
			User user1=iterator.next();
			
			System.out.println(user1);
		}
		
		//Delete user
		userRepository.deleteById(3);
		
		*/
		

		List<User> users = userRepository.findByName("Vinay jha");
		
		users.forEach(user->{
			
			System.out.println(user);
		});
		
		
		/*
		List<User> users=userRepository.getAllUser();
		 users.forEach(user->{
			 
			 System.out.println(user);
		 });
		*/
		
	}
	
	
}
