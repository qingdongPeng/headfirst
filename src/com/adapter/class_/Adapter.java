package com.adapter.class_;

public class Adapter extends Usber implements IPs2 {

    /**
     * 类适配器,在接口A的方法中引用了接口B的方法
     */
    @Override
    public void isPs2() {
        isUsb();
    }
}
