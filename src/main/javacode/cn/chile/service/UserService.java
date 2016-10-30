package cn.chile.service;

import cn.chile.entity.User;
import cn.chile.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.batch.MyBatisCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by chile on 2016/10/29.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(readOnly = true)
    public User login(String username, String password) {

        User user = userMapper.selectUserByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Login success.");
            return user;
        }
        return null;
    }

}
