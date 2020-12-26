package com.microgenesis.oo.javademo;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        System.out.println(dog.hashCode());
        //program to super type
        Animal animal = new Dog();
        animal.eat();
        Dog mydog = (Dog) animal;
        mydog.bark();
        System.out.println(animal.hashCode());

        ///Object
        Object animalObj = new Dog();
        Dog mydogObj = (Dog) animalObj;
        mydogObj.bark();
        mydogObj.eat();

        //dynamic typing

        Integer i = new Integer(100);
        System.out.println(i.intValue());

        Number i1 = new Integer(100);
        System.out.println(i1.intValue());

        Object i2 = null;
        i2 = new Integer(100);
        Integer myInteger = (Integer) i2;
        System.out.println(myInteger.intValue());
        i2 = new String("Hello");
        System.out.println(i2.toString());

    }
}
