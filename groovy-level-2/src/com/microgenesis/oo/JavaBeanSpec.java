package com.microgenesis.oo;

public class JavaBeanSpec {
    public static void main(String[] args) {
        Customer customer = new Customer();

//        customer.id =1;
//        customer.name ="Subramanian";
//        System.out.println(customer.id + " " + customer.name);
        customer.setId(12);
        customer.setName("Subramanian");
        System.out.println(customer.getId() + " " + customer.getName());

        //args constructors
        //single id
        Customer customer1 = new Customer(125);
        customer1.setName("foo");
        System.out.println(customer1.getId() + " " + customer1.getName());

        Customer customer2 = new Customer("bar");
        customer2.setId(1000);
        System.out.println(customer2.getId() + " " + customer2.getName());

        Customer customer3 = new Customer(7888,"barfoo");
        System.out.println(customer3.getId() + " " + customer3.getName());



    }
}
