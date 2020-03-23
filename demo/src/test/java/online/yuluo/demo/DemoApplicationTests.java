package online.yuluo.demo;

import online.yuluo.demo.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//@SpringBootTest
class DemoApplicationTests {

    //    @Test
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>(10);
        for (long i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setAvatarId(i + 800);
            userList.add(user);
        }
        Collections.shuffle(userList);
        userList.stream().forEach(System.out::println);
        System.out.println("-------------");
        List<User> newUserList = userList.stream().sorted(Comparator.comparing(User::getAvatarId)).sorted(Comparator.comparing(User::getId)).collect(Collectors.toList());
        newUserList.forEach(System.out::println);
    }

}
