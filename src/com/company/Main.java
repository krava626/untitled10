package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Men fred =  new Men("Fred",23);
        Men Ded=(Men) fred.clone();

       /* System.out.println(fred);
        System.out.println(Ded);*/
        System.out.println(fred.getClass()==Men.class);
    }
}
