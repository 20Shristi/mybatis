package com.example.myBatis;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.myBatis.Mapper.UserMapper;


//@MappedTypes(Users.class) // class which got mapped to that particular mapper.
//@MapperScan("com.example.myBatis.Mapper")

@SpringBootApplication
public class Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	private UserMapper userMapper;
	
	public Application() {
		
	}
	public Application(UserMapper userMapper) {
		
		this.userMapper = userMapper;
	}



	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.userMapper.findAll());
		
	}

	
}
