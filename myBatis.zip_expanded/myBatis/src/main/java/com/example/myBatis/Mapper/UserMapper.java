package com.example.myBatis.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.myBatis.model.Users;


//mapper class btw the users and db
//mapping choices: Annotations and xml 

@Mapper
public interface UserMapper { //userDao

	@Select("Select * from users")
	List<Users> findAll();

}
