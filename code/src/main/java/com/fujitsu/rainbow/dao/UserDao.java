package com.fujitsu.rainbow.dao;

import com.fujitsu.rainbow.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public interface UserDao {

    User getUser(String username);

    /**
     * 查询所有用户User
     * @return
     */
    List<User> getUserList();
}
