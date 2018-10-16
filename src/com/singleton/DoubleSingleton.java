package com.singleton;


/**
 * 双重锁式单例模式
 */
public class DoubleSingleton {


    private volatile static DoubleSingleton singleton = null;

    private DoubleSingleton(){

    }

    public static  DoubleSingleton getInstance(){
        if(singleton == null){
            synchronized (DoubleSingleton.class){
                if(singleton == null){
                    singleton = new DoubleSingleton();
                }
            }
        }
        return singleton;
    }
}
