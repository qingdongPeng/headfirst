package com.build;

/**
 * 构建一个强壮的男人
 */
public class StrongManBuild implements IBuildPerson {

    Person person;

    public StrongManBuild() { person = new Person(); }

    @Override
    public void buildSex() {
        person.setSex("男人");
    }

    @Override
    public void buildHead() {
        person.setHead("头部");
    }

    @Override
    public void buildBody() {
        person.setBody("强壮的身体");
    }

    @Override
    public void buildFoot() {
        person.setFoot("发达的四肢");
    }

    @Override
    public Person builePerson() {
        return person;
    }
}
