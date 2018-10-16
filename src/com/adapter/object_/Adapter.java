package com.adapter.object_;

public class Adapter implements IPs2 {

    private IUsb usb;

    public Adapter(IUsb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }
}
