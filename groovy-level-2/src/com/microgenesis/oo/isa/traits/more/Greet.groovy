package com.microgenesis.oo.isa.traits.more


trait Greet extends Named{
    def sayHello() {
        "Hello ${name} ${age}"
    }
}