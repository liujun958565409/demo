package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//@MapperScan("com.example.demo.*")
public class DemoApplicationTests {

	@Autowired
	private UserServiceImpl userService;

	@Test
	public void getUser() {
		userService.getUser();
	}
	@Test
    public void saveUser(){
	    userService.saveUser();
    }
    @Test
	public void updateUser(){
		userService.updateUser();
	}
	@Test
	public void removeUser(){
		userService.removeUser();
	}


	@Autowired
	private UserServiceC userServiceC;
	@Test
	public void queryList(){

		//List<UserEntity> aa=userServiceC.queryList();
		UserEntity aa=userServiceC.queryList();
		System.out.println("=====查询成功！===");
		System.out.println(aa);
		System.out.println(aa.getId()+"\\"+aa.getUserName()+"\\"+ aa.getPassword()+"\\"+aa.getBirthday());
	}
     @Test
	public void query(){
		String username = userServiceC.query();
		 System.out.println("====查询名称成功！======");
		System.out.println(username);
	 }


}
