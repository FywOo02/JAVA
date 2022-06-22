package com.cho.controller;

import com.cho.entity.User;
import com.cho.service.Implement.UserServiceImpl;
import com.cho.service.UserService;
import com.cho.utils.Constants;
import com.cho.utils.MD5Utils;
import com.cho.utils.RandomUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

/**
 * @Author: Cho
 * @Date: 2022/04/25/16:22
 * @Description: Controller for the user module
 */
@WebServlet("/user")
public class UserController extends BaseServlet{
    public String check(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        // get username
        String username = request.getParameter("username");
        if (username == null) {
            return Constants.HAS_USER; // cant register
        }

        // call the business logic to check if the username exist
        UserService userService = new UserServiceImpl();
        boolean b = userService.checkUser(username);

        // response (1 exist 0 non-exist)
        if (b) {
            // user exist
            return Constants.HAS_USER;
        }
        return Constants.NOT_HAS_USER;
    }
    public String register(HttpServletRequest request, HttpServletResponse response){
        // get user information
        Map<String, String[]> parameterMap = request.getParameterMap();
        User user = new User();
        try {
            BeanUtils.populate(user, parameterMap);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        user.setuStatus("0");
        user.setuRole(0);
        user.setKey(RandomUtils.createActive());
        user.setuPassword(MD5Utils.md5(user.getuPassword()));
        // complete user information
        // call user business
        UserService userService = new UserServiceImpl();
        try {
            userService.registerUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("registerMsg","FALL TO REGISTER");
            return Constants.FORWARD+"/register.jsp";
        }

        // corresponding
        return Constants.FORWARD+"/registerSuccess.jsp";
    }
}
