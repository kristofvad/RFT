package com.example.RFT.UserController.net;
import lombok.Builder;
import lombok.Data;
import org.springframework.context.annotation.Bean;

/**
 * Web layer representation of a user.
 */
@Data
@Builder
public class UserView implements Comparable<UserView>{


    private Long id;
    private String userName;
    private String emailAddress;


    @Override
    public int compareTo(UserView o) {
        return userName.compareTo(o.userName);
    }
}