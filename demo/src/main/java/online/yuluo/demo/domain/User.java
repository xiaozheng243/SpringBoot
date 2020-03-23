package online.yuluo.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author yuluo
 */
@Getter // lombok
@Setter
@ToString
//@Table(name = "user")  // https://www.cnblogs.com/xuwenjin/p/8830850.html
public class User {

    //    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private Long avatarId;
    private String email;
    private int enabled;
    private String password;
    private String username;
    private String phone;
    private Date createTime;
    private Date lastPasswordResetTime;
    private String nickName;
    private String sex;
}
