package com.cho.dao.Implement;

import com.cho.dao.UserDao;
import com.cho.entity.User;
import com.cho.utils.C3P0Utils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * @Author: Cho
 * @Date: 2022/04/25/16:32
 * @Description:
 */
public class UserDaoImpl implements UserDao {

    /*private int uid;
    private String username; // correspond to uname in database
    private String uPassword; // password
    private String uSex; //sex
    private String uStatus; // User Activation Status 0 non-activated 1 activated

    private String key;
    private String email; // correspond to uemail in database
    private int uRole; // 0 user 1 admin

    u_id                 int not null auto_increment,
    u_name               varchar(30) not null,
    u_password           varchar(30) not null,
    u_email              varchar(30) not null,
    u_sex                varchar(30),
    u_status             int,
    u_key                varchar(64),
    u_role               int,
     */
    @Override
    public User selectUserByUname(String username) throws SQLException {
        // create a QueryRunner object
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        // implement sql
        String sql = "select u_id as uid, u_name as username, u_password as uPassword" +
                ",u_sex as uSex, u_status as uStatus, u_key as key, u_email as email" +
                ",u_role as uRole from user where u_name = ?";
        User user = queryRunner.query(sql,new BeanHandler<User>(User.class),username);
        return user;
    }

    @Override
    public int insertUser(User user) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
        String sql = "insert into user(u_name,u_password,u_sex,u_status," +
                "u_key,u_email,u_role) value (?,?,?,?,?,?,?)";
        int rows = queryRunner.update(sql,user.getUsername(), user.getuPassword(),user.getuSex(),
                user.getuStatus(), user.getKey(),user.getEmail(),user.getuRole());
        return rows;
    }
}
