package com.example.riyaspringproject;

import com.example.riyaspringproject.model.User;
import com.example.riyaspringproject.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RiyaspringprojectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RiyaspringprojectApplication.class, args);
	}

	@Autowired
    private UserRepository userRepository;


	@Override
	public void run(String...args) throws Exception
	{
         this.userRepository.save(new User("ramesh","gupta","ramesh@gmail.com"));
		 this.userRepository.save(new User("tom","krush","tom@gmail.com"));
		 this.userRepository.save(new User("jerry","perry","jerry@gmail.com"));
		 this.userRepository.save(new User("rohan","kumar","rohan@gmail.com"));

	}


}
