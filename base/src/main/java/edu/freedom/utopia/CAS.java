package edu.freedom.utopia;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description cas算法
 * @Author: lihj <lhjbpqbfq@163.com>
 * @Date: 2020-08-09 14:45
 */
public class CAS {

    // 通过U(不安全)这个类直接操作内存的
    //cas 底层地指令 lock cmpxchg
    AtomicInteger version = new AtomicInteger(0);

/**    synchronized */ void m (){
    for(int i = 0;i<10000;i++){
        version.incrementAndGet(); // version++
    }
}

    public static void main(String[] args) {
        CAS cas = new CAS();
        cas.m();


    }


}
