package edu.freedom.utopia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @Description 公共模块启动类（测试时候使用，将来删除）
 * @Author: lihj
 * @Date: 2020/7/31 11:51 上午
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonApplicationTest {
    @Test
    public void test(){
        System.out.println("测试redis工具");

    }

}
