package com.microgenesis.oo.isa.inter

class Bird implements Flyable {
    @Override
    def fly() {
        'Bird flies'
    }
    def eat(){
        'Bird can eat'
    }
}
