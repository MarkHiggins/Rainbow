package com.fujitsu.rainbow.service.impl;

import com.fujitsu.rainbow.dao.UserDao;
import com.fujitsu.rainbow.entity.User;
import com.fujitsu.rainbow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUser(String username) {
        User user = userDao.getUser(username);
        return user;
    }

    @Override
    public List<User> getUserList() {
        List<User> userList = userDao.getUserList();
        return userList;
    }
}
