package com.fujitsu.rainbow.dao.impl;

import com.fujitsu.rainbow.dao.UserDao;
import com.fujitsu.rainbow.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User getUser(String username) {

        List<User> userList = getUserList();
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            } else {
                return userList.get(0);
            }

        }
        return null;

    }

    @Override
    public List<User> getUserList() {
        String sql = "select * from test_00.Person";
        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setUserId(rs.getInt("user_id"));
                user.setUsername(rs.getString("user_name"));
                user.setPassword(rs.getString("user_pwd"));
                user.setRemark(rs.getString("remark"));
                return user;
            }
        });
        return userList;
    }
}
