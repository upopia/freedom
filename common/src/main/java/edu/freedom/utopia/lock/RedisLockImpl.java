package edu.freedom.utopia.lock;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Description redis锁
 * @Author: lihj
 * @Date: 2020/8/3 1:50 下午
 */
public class RedisLockImpl extends Lock {
    @Resource
    RedisTemplate redisTemplate;

    @Override
    public boolean lock(String key ) {
        if (redisTemplate.opsForValue().setIfAbsent(key, UUID.randomUUID().toString())) {
            redisTemplate.expire(key, 5, TimeUnit.MINUTES);
            return true;
        }
        return false;
    }
    @Override
    public boolean lock(String key , Integer timeout) {
        if (redisTemplate.opsForValue().setIfAbsent(key, UUID.randomUUID().toString())) {
            redisTemplate.expire(key, timeout, TimeUnit.MINUTES);
            return true;
        }
        return false;
    }
}
