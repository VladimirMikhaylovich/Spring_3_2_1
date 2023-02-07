package com.example.spring_3_2_1_v6.service;

import com.example.spring_3_2_1_v6.entity.User;

import java.util.List;

public interface ServiceUser {
    List<User> getAllUsers();
    void addUser(User user);

    User getUserById(Integer id);

    void update(Integer id, User user);

    void delete(Integer id);
}
