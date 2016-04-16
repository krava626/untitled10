package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Men fred =  new Men("Fred",23);
        Men red =  new Men("Fred",23);

        System.out.println(fred.hashCode());
        System.out.println(red.hashCode());
        System.out.println(fred.hashCode()==red.hashCode());
    }
}
