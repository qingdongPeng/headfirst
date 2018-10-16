package com.flyweight;

/**
 * 绘制图形的具体类
 */
public class Circle extends Shape{

    private String color;

    public Circle(String color) {
        this.color = color;
    }


    @Override
    public void draw() {
        System.out.println("画了一个 " + color + " 的圆形");
    }
}
