package com.version6.demo6.Services;

import com.version6.demo6.Models.User;
import com.version6.demo6.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public void save(User user) {

        userRepository.save(user);
    }

    @Override
    public User findOneUser(Long id) {
//        return userRepository.findOne(id);
        return userRepository.getOne(id);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
