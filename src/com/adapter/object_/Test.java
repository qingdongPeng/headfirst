package com.adapter.object_;

/**
 * 对象适配器模式测试
 * 原理：通过组合来实现适配器功能
 * 当我们要访问的接口A中没有我们想要的方法 ，却在另一个接口B中发现了合适的方法，
 * 我们又不能改变访问接口A，在这种情况下，我们可以定义一个适配器p来进行中转，这个适配器p要实现我们访问的接口A，
 * 这样我们就能继续访问当前接口A中的方法（虽然它目前不是我们的菜），然后在适配器P中定义私有变量C（对象）（B接口指向变量名）
 * 再定义一个带参数的构造器用来为对象C赋值，再在A接口的方法实现中使用对象C调用其来源于B接口的方法。
 */
public class Test {

    public static void main(String[] args) {
        IPs2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}
