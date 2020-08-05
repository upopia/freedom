package edu.freedom.utopia.lock;

/**
 * @Description 锁的具体实现类
 * @Author: lihj
 * @Date: 2020/8/3 11:56 上午
 */
public class ZKLockImpl extends Lock {

    @Override
    public boolean lock() throws Exception {
        return false;
    }

    @Override
    public boolean unLock() {
        return false;
    }
}
