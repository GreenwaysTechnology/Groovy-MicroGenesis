package com.microgenesis.oo;

public class HelloMain {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        String result = hello.sayHello("Subramanian");
        System.out.println(result);
        System.out.println(hello.getClass());
        HelloWorld helloWorld=null;
        System.out.println(helloWorld.getClass());

    }
}
