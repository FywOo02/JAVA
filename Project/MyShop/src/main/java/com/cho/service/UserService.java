package com.cho.service;

import com.cho.entity.User;

import java.sql.SQLException;

/**
 * @Author: Cho
 * @Date: 2022/04/25/16:26
 * @Description: The business logic interface corresponding to the user module
 */
public interface UserService {
    /**
     * check user if exist
     * @param userName
     * @return boolean (true exist false non-exist)
     */
    boolean checkUser(String userName) throws SQLException;

    /**
     * register business logic
     * @param user
     * @return
     */
    int registerUser(User user) throws SQLException;
}
