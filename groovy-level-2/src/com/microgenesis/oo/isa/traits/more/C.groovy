package com.microgenesis.oo.isa.traits.more

class C implements A,B {
    @Override
    String exec() {
        A.super.exec()
    }
}
