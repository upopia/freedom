package edu.freedom.utopia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * @Description 用户实体
 * @Author: lihj
 * @Date: 2020/8/5 1:58 下午
 */
@Entity
@Table
//Springboot2.2.1集成的Spring data jpa比较新，需要加上如下配置
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Data
public class User {
    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Long id;
    @Column //这是和数据表对应的一个列
    private String username;
    @Column
    private String sex;
    @Column
    private Integer age;
    @Column
    private String password;
    @Column
    private String remark;


}
