package ink.zhaibo.user.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Author zhaibo
 * @Date 2019/8/16 15:35
 */
@Entity(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private String cellphone;
}
