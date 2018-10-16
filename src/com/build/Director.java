package com.build;

/**
 *按照特定的逻辑或者顺序去构造对象
 */
public class Director {

    public Person createPerson (IBuildPerson person){
        //这里按性别---头部---身体--四肢来构建
        person.buildSex();
        person.buildHead();
        person.buildBody();
        person.buildFoot();
        return person.builePerson();
    }
}
