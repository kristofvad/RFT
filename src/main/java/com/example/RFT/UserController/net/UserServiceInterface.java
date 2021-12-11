package com.example.RFT.UserController.net;


import com.example.RFT.UserController.net.CreateUserRequest;
import com.example.RFT.UserController.net.UserView;
import org.springframework.context.annotation.Bean;

import java.util.List;

public interface UserServiceInterface{


    UserView getUserById(Long id);

    List<UserView> getAllUser();

    void addUser(CreateUserRequest request);


    void deleteUserById(Long id);
}
