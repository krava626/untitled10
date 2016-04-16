package com.company;


public class Men implements Cloneable{
    private String name;
    private int age;

    public Men(String name, int age) {
        System.out.println("constructor");

        this.name = name;
        this.age = age;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Men{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
