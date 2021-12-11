package com.example.RFT.UserController.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultUserService implements UserServiceInterface{


    @Override
    public UserView getUserById(Long id) {
        return null;
    }

    @Override
    public List<UserView> getAllUser() {
        return null;
    }

    @Override
    public void addUser(CreateUserRequest request) {

    }

    @Override
    public void deleteUserById(Long id) {

    }

    @Autowired
    public DefaultUserService() {
    }
}
