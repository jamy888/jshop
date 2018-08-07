package net.jeeshop.core.cache;

import java.io.Serializable;

/**
 * cache provider
 * @author dylan  测试
 */
public interface CacheProvider {
    /**
     * 放入cache中
     * @param key
     * @param cacheObject
     */
    void put(String key, Serializable cacheObject);

    /**
     * 获取放在cache中的内容
     * @param key
     * @return
     */
    Serializable get(String key);

    /**
     * 清除cache中对应的值
     * @param key
     */
    void remove(String key);

    /**
     * 清除所有的cache
     */
    void clear();
}
