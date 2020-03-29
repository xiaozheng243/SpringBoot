package online.yuluo.demo.domain;

//import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author yuluo
 */
//@Getter // lombok
//@Setter
//@ToString
@Data
//@TableName(value = "user")
public class User {

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
