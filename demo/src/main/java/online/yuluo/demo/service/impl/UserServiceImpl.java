package online.yuluo.demo.service.impl;


import online.yuluo.demo.domain.User;
import online.yuluo.demo.mapper.UserMapper;
import online.yuluo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yuluo
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList(User user) {
        return userMapper.queryUsers(user);
    }
}
