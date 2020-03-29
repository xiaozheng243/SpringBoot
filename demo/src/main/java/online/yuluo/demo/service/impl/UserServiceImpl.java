package online.yuluo.demo.service.impl;


import online.yuluo.demo.domain.User;
import online.yuluo.demo.mapper.UserMapper;
import online.yuluo.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author yuluo
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList(User user) {
        return userMapper.queryUsers(user);
    }


    @Override
    public List<User> getAllUserList() {
//        return userMapper.selectList(null);
        return null;
    }
}
