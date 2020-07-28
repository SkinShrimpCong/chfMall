package haifeng.cong.mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import haifeng.cong.mall.service.RedisService;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company:
 * Create Time: 2020/7/15 16:07
 *
 * @author conghaifeng
 */
public class RedisServiceImpl implements RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * @param key
     * @param value
     * @Description: 存储数据
     * @Param:
     * @return:
     * @Date 2020/7/15
     */
    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    /**
     * @param key
     * @Description: 获取数据
     * @Param:
     * @return:
     * @Date 2020/7/15
     */
    @Override
    public String get(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }

    /**
     * @param key
     * @param expire
     * @Description: 设置超期时间
     * @Param:
     * @return:
     * @Date 2020/7/15
     */
    @Override
    public boolean expire(String key, long expire) {
        return stringRedisTemplate.expire(key, expire, TimeUnit.SECONDS);
    }

    /**
     * 删除数据
     *
     * @param key
     */
    @Override
    public void remove(String key) {
        stringRedisTemplate.delete(key);
    }

    /**
     * 自增操作
     *
     * @param key
     * @param delta 自增步长
     */
    @Override
    public Long increment(String key, long delta) {
        return stringRedisTemplate.opsForValue().increment(key, delta);
    }
}
