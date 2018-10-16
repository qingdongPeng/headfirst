package com.decorator;

public class Source implements ISourceable {
    @Override
    public void method() {
        System.out.println("the origin method");
    }
}
