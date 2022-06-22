package com.cho.dao;

import com.cho.entity.User;

import java.sql.SQLException;

/**
 * @Author: Cho
 * @Date: 2022/04/25/16:29
 * @Description: User module database access interface
 */
public interface UserDao {
    /**
     * check existence of user by username
     * @param username
     * @return user data
     */
    User selectUserByUname(String username) throws SQLException;

    /**
     * inser the user
     * @param user
     * @return
     */
    int insertUser(User user) throws SQLException;
}
