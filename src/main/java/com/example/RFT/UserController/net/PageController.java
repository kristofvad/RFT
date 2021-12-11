package com.example.RFT.UserController.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Controller that returns pages.
 */
@Controller
public class PageController {

    private static final String USER_PAGE_MAPPING = "/userPage/{id}";
    private static final String ROOT_MAPPING = "/";
    private static final String USER_PAGE_NAME = "UserPage";
    private static final String USER_LIST_PAGE_NAME = "UserListPage";
    private static final String USERS_MODEL_KEY = "users";
    private static final String USER_MODEL_KEY = "user";

    private UserServiceInterface userService;

    @Autowired
    public PageController(UserServiceInterface userService) {
        this.userService = userService;
    }


    @GetMapping(ROOT_MAPPING)
    public String homePage(Model model) {
        model.addAttribute(USERS_MODEL_KEY, userService.getAllUser());
        return USER_LIST_PAGE_NAME;
    }


    @GetMapping(USER_PAGE_MAPPING)
    public String userPage(@PathVariable Long id, Model model){
        model.addAttribute(USER_MODEL_KEY, userService.getUserById(id));
        return USER_PAGE_NAME;
    }
}
