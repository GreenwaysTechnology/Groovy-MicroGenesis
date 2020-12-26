package com.microgenesis.oo.isa.traits

trait Age {
    private int counter = 0;
    int age; //properties
    int getCounter() {
        counter += 1;
        counter;
    }

}