package com.mycom;

public class TypeTesting {
    public static void main(String[] args) {
        int a = 10; //10 type is int---size 4 bytes
        byte b = 19; // 19 type is ? - int only  // byte(2) === int(4)
        //byte b1 =9000; // here 9000 cant be stored inside b1 because b1 capacity is lesser than value
        //what if i want to store 9000 inside b1
        //type conversion
        byte b2 = (byte) 10000;
        System.out.println(b2);
        ///////////////////////////////////////////////////////////////////////
        //decimal numbers
        //  float price = 10.5; //error
        float price = 10.5f;
        float price1 = (float) 10.5;
        /////////////////////////////////////////////////////////////////////////////
        double d = 10.78;

        char c = 'A'; //int
        char c1 = 99; //int
        System.out.println(c1 + " " + c);
        System.out.println((char) c1 + " " + (int) c);
        ///////////////////////////////////////////////////////////////////////////////////
        //How to work with wrapper class

        Integer i = new Integer(10); // def i = 10 ; def i = new Integer(10);
        //conversion : object to primitive : Integer ---> int
        System.out.println(i.intValue());
        int x = i.intValue() * 100;
        System.out.println(x);

        //Object -- to primitive Boxing
        Integer j = 10;
        int y = j * 10;
        System.out.println(y);

    }
}
