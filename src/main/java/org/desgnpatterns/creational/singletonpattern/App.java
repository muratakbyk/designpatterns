package org.desgnpatterns.creational.singletonpattern;

public class App {
    public static void main(String[] args) {
        LocalCache localCache = LocalCache.getInstance();

        localCache.put("Example data key", "Example data value");
        localCache.put("Example data key 2", "Example data value 2");

    }
}
