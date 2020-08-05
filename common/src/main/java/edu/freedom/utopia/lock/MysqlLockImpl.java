package edu.freedom.utopia.lock;

/**
 * @Description 数据库锁
 * @Author: lihj
 * @Date: 2020/8/3 1:54 下午
 */
public class MysqlLockImpl extends Lock {
    @Override
    public boolean lock() throws Exception {
        return false;
    }

    @Override
    public boolean unLock() {
        return false;
    }
}
