package com.version6.demo6.Services;


import com.version6.demo6.Models.User;

import java.util.List;

public interface UserService {
    void save(User user);
    User findOneUser(Long id);
    List<User> findAllUsers();
    User findByUsername(String username);
}
