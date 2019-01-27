package com.fujitsu.rainbow.controller;

import com.fujitsu.rainbow.entity.User;
import com.fujitsu.rainbow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserController
 */
@RestController("userController")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "user", produces = "application/json")
    public @ResponseBody Object getUser(@RequestBody String username) {
        User user = userService.getUser(username);
        System.out.println(username);
        return user;
    }

    @PostMapping(value = "register", produces = "application/json")
    public @ResponseBody Object registUser(@RequestBody User user) {
        List<User> userList = userService.getUserList();

        System.out.println(user);
        return userList;
    }
}
