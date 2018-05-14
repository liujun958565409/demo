package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceC {
    @Autowired
    private UserMapper mapper;

    //public  List<UserEntity> queryList(){
    public  UserEntity queryList(){
      //  List<UserEntity> userList = mapper.queryList();
        UserEntity  userList = mapper.queryList();
        System.out.println("===查询中====");
        System.out.println(userList.getBirthday());
        return userList;

    }
    public String query(){
        String username = mapper.query();

        return username;
    }
}
