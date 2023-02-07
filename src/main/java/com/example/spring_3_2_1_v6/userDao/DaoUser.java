package com.example.spring_3_2_1_v6.userDao;


import com.example.spring_3_2_1_v6.entity.User;

import java.util.List;

public interface DaoUser {
    List<User> getAllUsers();

    void addUser(User user);

    User getUserById(Integer id);

    void update(Integer id, User user);

    void delete(Integer id);
}
