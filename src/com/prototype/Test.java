package com.prototype;

/**
 * 原型模式测试
 */
public class Test {

    public static void main(String[] args) {
        Resume resume = new Resume();
        resume.setAge(21);
        resume.setBirthday("2018-08-27");
        resume.setName("pqd");
        resume.setSex("男");

        //克隆该对象
        Resume resumeClone = (Resume) resume.clone();

        /**
         * 对任何的对象x，都有x.clone() !=x，即克隆对象与原对象不是同一个对象
         */

        System.out.println(resume == resumeClone);


        /**
         * 对任何的对象x，都有x.clone().getClass()==x.getClass()，即克隆对象与原对象的类型一样。
         */
        System.out.println(resume.getClass() == resumeClone.getClass());

        System.out.println(resume.toString());
        System.out.println(resumeClone.toString());
    }
}
