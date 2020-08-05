package edu.freedom.utopia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @Description todo
 * @Author: lihj
 * @Date: 2020/8/5 2:34 下午
 */
@Entity
@Table
//Springboot2.2.1集成的Spring data jpa比较新，需要加上如下配置
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Data
public class Order {
    @Id //主键
    private String id;
    @Column(name = "[name]")//这是和数据表对应的一个列
     //"订单名"
    private String name;
    @Column
    //"商品"
    private String subject;
    @Column
//    "金额"
    private BigDecimal amount;
    @Column(name = "[status]")
    // "状态"
    private Integer status;
    @Column
    //"关联用户"
    private Long buyId;
    @Column
    //"备注"
    private String remark;
}
