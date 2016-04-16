package com.company;


public class Men implements Cloneable{
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Men men = (Men) o;

        if (age != men.age) return false;
        return name.equals(men.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

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
