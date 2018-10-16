package com.build;

/**
 * 建造者模式测试
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Person person = director.createPerson(new StrongManBuild());
    }
}
