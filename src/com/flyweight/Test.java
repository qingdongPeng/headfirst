package com.flyweight;

/**
 * 享元模式测试
 */
public class Test {

    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("黑色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("灰色");
        shape3.draw();

        System.out.println("一共绘制了" + FlyweightFactory.getSum() + "种颜色的图形");
    }
}
