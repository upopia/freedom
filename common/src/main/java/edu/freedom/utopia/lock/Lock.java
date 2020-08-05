package edu.freedom.utopia.lock;

/**
 * @Description 锁
 * @Author: lihj
 * @Date: 2020/8/3 2:58 下午
 */
 public abstract class Lock {
    /**
     * 上锁
     *
     * @throws Exception
     */
   public boolean lock() throws Exception {
        return false;
    }

    /**
     * 上锁
     * @param  key key
     * @return 上锁是否成功 true/false
     * @throws Exception
     * */
    public boolean lock(String key) throws Exception{
        return false;
    }
    /**
     * 上锁
     * @param  key   key
     * @param timeout 超时时间
     * @return 上锁是否成功 true/false
     * @throws Exception
     * */
    public boolean lock(String key , Integer timeout) throws Exception{
        return false;
    }

    /**
     * 解锁
     * @return 解锁是否成功 true/false
     * */
    public boolean unLock(){
        return false;
    }
}
