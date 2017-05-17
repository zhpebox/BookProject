package com.book.controller.test;

import java.io.Serializable;  

import net.sf.ehcache.Cache;  
import net.sf.ehcache.CacheManager;  
import net.sf.ehcache.Element;  
  
public class EhCache   
{  
    public static void main(String[] args) {  
        //创建一个缓存管理器  
        CacheManager singletonManager = CacheManager.create();  
        //建立一个缓存实例  
        Cache memoryOnlyCache = new Cache("testCache1", 3, false, false, 50, 3);  
        //在内存管理器中添加缓存实例  
        singletonManager.addCache(memoryOnlyCache);  
        Cache cache = singletonManager.getCache("testCache1");  
        //使用缓存  
        Element element = new Element("key1", "value1");  
        cache.put(element);  
        cache.put(new Element("key1", "value2")); 
        
        Element element2 = new Element("keya", "valuea");  
        cache.put(element2);  
        cache.put(new Element("keya", "valueb")); 
  
        try {
        	Thread.sleep(2000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        
        element = cache.get("key1");  
        Serializable value = element.getValue();  
        System.out.println("valuea:"+value);  
        
        try {
        	Thread.sleep(2000);
        } catch (InterruptedException e) {
        	e.printStackTrace();
        }
        
        element = cache.get("key1");  
        Serializable valueb = element.getValue();  
        System.out.println("valueb:"+valueb);  
  
        
        int elementsInMemory = cache.getSize();  
        System.out.println("elementsInMemory:"+elementsInMemory);  
  
        long elementsInMemory2 = cache.getMemoryStoreSize();  
        System.out.println("elementsInMemory2:"+elementsInMemory2);  
  
        Object obj = element.getObjectValue();  
        cache.remove("key1");  
        System.out.println("obj:"+obj);  
        singletonManager.shutdown();  
    }  
}  
