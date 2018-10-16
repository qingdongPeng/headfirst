package com.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class FlyweightFactory {

    static Map<String,Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String key){
        Shape shape = shapeMap.get(key);
        //不存在则新建
        if(shape == null){
            shape = new Circle(key);
            shapeMap.put(key,shape);
        }
        return shape;
    }

    public static int getSum(){
        return shapeMap.size();
    }
}
