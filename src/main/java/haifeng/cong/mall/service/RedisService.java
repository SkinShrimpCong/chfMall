package haifeng.cong.mall.service;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company:
 * Create Time: 2020/7/15 9:19
 *
 * @author conghaifeng
 */
public interface RedisService {

    /**
    * @Description: 存储数据
    * @Param:
    * @return:
    * @Date 2020/7/15
    */
    void set(String key, String value);

    /**
    * @Description: 获取数据
    * @Param:
    * @return:
    * @Date 2020/7/15
    */
    String get(String key);

    /**
    * @Description: 设置超期时间
    * @Param:
    * @return:
    * @Date 2020/7/15
    */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);
}
