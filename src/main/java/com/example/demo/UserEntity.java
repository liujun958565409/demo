package com.example.demo;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;


public class UserEntity {
    private int id;
    private String username;
    private String password;
    private Date birthday;
    public int getId(){
        return id;
    }
    public void setUserName(int id){
        this.id = id;

    }
    public String getUserName(){
        return username;
    }
    public void setUserName(String username){
       this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getBirthday(){
        return birthday;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
}
