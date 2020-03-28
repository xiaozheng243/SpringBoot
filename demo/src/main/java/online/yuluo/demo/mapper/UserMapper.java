package online.yuluo.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import online.yuluo.demo.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yuluo
 */
@Repository
public interface UserMapper extends BaseMapper<User> {

    //    @Select("select * from user")

    /**
     * query User list
     *
     * @param user user
     * @return List<User> user list
     */
//    List<User> queryUsers(User user);
}