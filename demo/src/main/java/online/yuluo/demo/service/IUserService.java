package online.yuluo.demo.service;


import online.yuluo.demo.domain.User;

import java.util.List;

public interface IUserService {
    List<User> getUserList(User user);
    List<User> getAllUserList();
}
