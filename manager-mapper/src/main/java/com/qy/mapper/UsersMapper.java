package com.qy.mapper;

import com.qy.pojo.Users;

import java.util.List;

public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
