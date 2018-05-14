package com.example.demo;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

public interface UserService {


    void getUser();
    void saveUser();//增加用户
    void updateUser();//修改用户
    void removeUser();//删除用户




}
