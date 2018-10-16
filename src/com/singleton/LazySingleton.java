package com.singleton;

/**
 * 懒汉式单例模式
 * 在类加载时不初始化
 */
public class LazySingleton {

    private static LazySingleton singleton = null ;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(singleton == null){
            singleton = new LazySingleton();
        }
        return singleton;
    }
}
