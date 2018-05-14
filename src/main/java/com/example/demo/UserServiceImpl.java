package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  JdbcTemplate jdbcTemplate ;

    public  void  getUser(){
        String sql="SELECT username FROM user where password='123'";
        String a =(String) jdbcTemplate.queryForObject(sql,String.class);
        System.out.println("======查询成功！========");
        System.out.println(a);
    }
    //增加用户
    public void saveUser(){
        String sql = "insert into user(username,password,birthday) values(?,?,?)";
        int rows = jdbcTemplate.update(sql,"波仔1","111","2017-02-01");
        System.out.println("======增加成功！=========");
        System.out.println(rows);
    }
    //修改用户
    public void updateUser(){
        String sql ="update user set username=?,password=?,birthday=? where id=?";
        int rows = jdbcTemplate.update(sql,"波仔2","222","2017-05-11",1);
        System.out.println("======修改成功！=====");
        System.out.println(rows);
    }
    //删除用户
    public void removeUser(){
        String sql ="delete from user where id=?";
        int rows = jdbcTemplate.update(sql,1);
        System.out.println("=====删除成功！=======");
        System.out.println(rows);

    }



}
