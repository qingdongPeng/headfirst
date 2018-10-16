package com.proxy;

/**
 * 代理模式测试
 * 代理模式的定义：代理模式给某一个对象提供一个代理对象，并由代理对象控制对原对象的引用。
 * 通俗的来讲代理模式就是我们生活中常见的中介。
 * 举个例子来说明：假如说我现在想买一辆二手车，虽然我可以自己去找车源，做质量检测等一系列的车辆过户流程，
 * 但是这确实太浪费我得时间和精力了。我只是想买一辆车而已为什么我还要额外做这么多事呢？于是我就通过中介公司来买车，
 * 他们来给我找车源，帮我办理车辆过户流程，我只是负责选择自己喜欢的车，然后付钱就可以了
 */
public class Test {
    public static void main(String[] args) {
        IBuyHouse buyHouse = new BuyHouseImpl();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
