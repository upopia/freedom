package edu.freedom.utopia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 公共模块启动类（测试时候使用，将来删除）
 * @Author: lihj
 * @Date: 2020/7/31 11:51 上午
 */

@EnableTransactionManagement
@SpringBootApplication
public class CommonApplication {
    public static void main(String[] args){
        SpringApplication.run(CommonApplication.class);
    }

}
