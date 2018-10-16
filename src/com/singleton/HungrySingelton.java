package com.singleton;

/**
 * 饿汉式单例模式
 * instance在类装载时就实例化
 */
public class HungrySingelton {

    private static HungrySingelton singelton = new HungrySingelton();

    private HungrySingelton(){

    }

    public static  HungrySingelton getInstance(){
        return singelton;
    }

}
