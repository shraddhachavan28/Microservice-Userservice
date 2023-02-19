package com.user.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service.entity.User;
@Service
public class UserServiceImpl implements UserService{
    List<User> list = List.of(
        new User(1010L, "ABCD", "9090909090"),
        new User(1011L, "BCDE", "9090909091"),
        new User(1012L, "CDEF", "9090909010"),
        new User(1013L, "DEFG", "9090909011"),
        new User(1014L, "EFGH", "9090909001")
    );

    @Override
    public User getUserId(Long id) {
        // TODO Auto-generated method stub
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}