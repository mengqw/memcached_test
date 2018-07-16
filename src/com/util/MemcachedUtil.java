package com.util;

import com.danga.MemCached.MemCachedClient;
import com.danga.MemCached.SockIOPool;

import java.util.Date;

public class MemcachedUtil {
    private static MemCachedClient memCachedClient = new MemCachedClient();

    private static MemcachedUtil memcachedUtil = new MemcachedUtil();

    public static MemcachedUtil getInstance(){
        return memcachedUtil;
    }

    static {
        String[] servers = {"127.0.0.1:11211"};
        Integer[] weights = {3};
        SockIOPool pool = SockIOPool.getInstance();
        pool.setServers(servers);
        pool.setWeights(weights);
        pool.initialize();
    }

    public boolean add(String key, Object value){
        return memCachedClient.add(key, value);
    }

    public boolean add(String key, Object value, Date expiry){
        return memCachedClient.add(key,value,expiry);
    }

    public boolean replace(String key, Object value) {
        return memCachedClient.replace(key, value);
    }

    public boolean replace(String key, Object value, Date expiry) {
        return memCachedClient.replace(key, value, expiry);
    }

    public Object get(String key) {
        return memCachedClient.get(key);
    }
}
