package org.desgnpatterns.creational.singletonpattern;

import java.util.HashMap;
import java.util.Map;

public class LocalCache {
    // static keyword
    // Declares that instance belongs to the class, not to any specific object.
    // Allows access like CacheManager.getInstance(), without needing an object.
    // It’s the foundation of a singleton — there should be only one instance shared across the application.

    //volatile keyword
    // Ensures visibility across threads.
    // When one thread updates instance, all other threads immediately see the updated value.
    // Without volatile, another thread might read a stale (cached) version of the variable.
    // It also prevents instruction reordering during new object creation (which can lead to partially constructed objects being visible).
    private static volatile LocalCache localCache;
    private final Map<Object,Object> cache = new HashMap<>();
    private LocalCache(){ }
    // synchronized keyword
    // Ensures that only one thread at a time can execute the block.
    // Prevents multiple threads from creating multiple instances of the singleton simultaneously.
    // Without it, race conditions could occur.
    public static LocalCache getInstance(){
        if(localCache == null){
            synchronized (LocalCache.class){
                if(localCache == null){
                    localCache = new LocalCache();
                    return localCache;
                }
            }
            // Why are there two if (instance == null) checks?

            // First if → for performance
            // In most cases, the instance is already created.So this check avoids entering the expensive synchronized block unnecessarily.

            // Second if → for thread safety
            // Multiple threads can pass the first check simultaneously.
            // Only the first thread entering the synchronized block creates the instance.
            // The second if ensures that no other thread creates a second instance.
        }
    return localCache;
    }
    public void put(Object key,Object val){
        cache.put(key,val);
    }
    public Object get(Object key) {
        return cache.get(key);
    }

    public boolean contains(Object key) {
        return cache.containsKey(key);
    }

    public void remove(Object key) {
        cache.remove(key);
    }

    public void clear() {
        cache.clear();
    }
}
