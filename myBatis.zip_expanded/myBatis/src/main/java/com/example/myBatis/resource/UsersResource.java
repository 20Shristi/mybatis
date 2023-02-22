//package com.example.myBatis.resource;
//
//import java.util.List;
//
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.myBatis.Mapper.UserMapper;
//import com.example.myBatis.model.Users;
//
//@RestController
//@RequestMapping("/rest/users")
//public class UsersResource {
//	
//	
//	private UserMapper userMapper;
//	
//	public UsersResource() {
//		
//	}
//	public UsersResource(UserMapper userMapper) {
//		this.userMapper= userMapper;
//	}
//	
//	@GetMapping("/all")
//	public List<Users> getAll(){
//		
//		return userMapper.findAll();
//	}
//	
//}
