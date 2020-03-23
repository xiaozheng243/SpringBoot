package online.yuluo.demo.controller;


import online.yuluo.demo.domain.User;
import online.yuluo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yuluo
 */
@RestController
@RequestMapping(value = "/api/users")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> users(User user) {
        return userService.getUserList(user);
    }
}
