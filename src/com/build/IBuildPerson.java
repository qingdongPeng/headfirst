package com.build;

/**
 * 构造人的接口
 */
public interface IBuildPerson {

    void buildSex();

    void buildHead();

    void buildBody();

    void buildFoot();

    //返回要构造的人
    Person builePerson();

}
