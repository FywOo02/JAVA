package com.cho.service.Implement;

import com.cho.dao.Implement.UserDaoImpl;
import com.cho.dao.UserDao;
import com.cho.entity.User;
import com.cho.service.UserService;

import java.sql.SQLException;

/**
 * @Author: Cho
 * @Date: 2022/04/25/16:28
 * @Description:
 */
public class UserServiceImpl implements UserService {
    @Override
    public boolean checkUser(String userName) throws SQLException {
        // create Dao access object
        UserDao userDao = new UserDaoImpl();
        // execute result
        User user = userDao.selectUserByUname(userName);
        /* cope with result
         *  user == null  false
         *  user != null  true
         */
        if(user != null){
            return true;
        }
        return false;
    }

    @Override
    public int registerUser(User user) throws SQLException {
        UserDao userDao = new UserDaoImpl();
        int row = userDao.insertUser(user);
        return row;
    }
}
