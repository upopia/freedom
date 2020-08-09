package edu.freedom.utopia;

import org.openjdk.jol.info.ClassLayout;

/**
 * @Description java对象布局
 * @Author: lihj <lhjbpqbfq@163.com>
 * @Date: 2020-08-09 15:34
 *
 * 对象头   markword          8 byte
 * 类指针   class pointer     4 byte
 * 实例数据 instance data
 * 对齐     padding           补齐到可以被8整除
 *
 */

public class JOL {

    public static void main(String[] args) {
        try {
            //加入线程睡眠可以看到偏向锁
//            开启偏向锁效率一定提高吗
//            偏向锁有一个前提是在单线程的情况下，多线程并发情况下偏向锁无意义，会有偏向锁撤销
//            jvm 开启默认设置延时四秒是避免开机分配的时候的多线程争抢资源
            //Thread.sleep(5000L);
//              匿名偏向
//            java.lang.Object object internals:
//            OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
//            0     4        (object header)                           05 00 00 00 (00000101 00000000 00000000 00000000) (5)
//            4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
//            8     4        (object header)                           e5 01 00 f8 (11100101 00000001 00000000 11111000) (-134217243)
//            12     4        (loss due to the next object alignment)
            Object obj = new Object();
            String str = ClassLayout.parseInstance(obj).toPrintable();
            System.out.println(str);

            synchronized (obj) {
                System.out.println(ClassLayout.parseInstance(obj).toPrintable());

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
