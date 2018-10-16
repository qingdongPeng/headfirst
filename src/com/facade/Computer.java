package com.facade;

/**
 * 电脑类,由Cpu,Memory,Disk等组成
 */
public class Computer {

    private Cpu cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new Cpu();
        memory = new Memory();
        disk = new Disk();
    }

    public void startUp(){
        System.out.println("computer ready start ");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
    }

    public void shutDown(){
        System.out.println("computer ready shutdown ! ");
        cpu.shutDown();
        memory.shutDown();
        disk.shutDown();
    }
}
