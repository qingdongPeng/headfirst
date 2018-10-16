package com.decorator;

public class Decorator implements ISourceable {

    //装饰对象持有被装饰对象的实例
    private ISourceable sourceable;

    public Decorator(ISourceable sourceable){
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before decorator");
        sourceable.method();
        System.out.println("after decorator");
    }
}
