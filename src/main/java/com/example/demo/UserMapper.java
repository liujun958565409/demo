package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper

public interface UserMapper {
    @Select("select * from user where id='3' ")
    @Results({
            @Result(property = "id", column="id"),
            @Result(property = "username", column="username"),
            @Result(property = "password", column="password"),
            @Result(property = "birthday", column="birthday")
    })

   // public List<UserEntity> queryList();
    public UserEntity queryList();

    @Select("select username from user where id='3'")

    public String query();

}
