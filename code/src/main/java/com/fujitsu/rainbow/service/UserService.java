package com.fujitsu.rainbow.service;

import com.fujitsu.rainbow.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public interface UserService {

    User getUser(String username);

    List<User> getUserList();
}
