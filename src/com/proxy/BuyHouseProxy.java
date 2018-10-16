package com.proxy;

/**
 * 代理类
 */
public class BuyHouseProxy implements IBuyHouse{

    private IBuyHouse buyHouse;

    public BuyHouseProxy(final IBuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        System.out.println("买房前准备");
        buyHouse.buyHouse();
        System.out.println("买房后装修");
    }
}
