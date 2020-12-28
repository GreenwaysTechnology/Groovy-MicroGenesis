package com.microgenesis.fp.closures

class Foo {
    def myls = {
        println "Foo "
        println "this : " + this;
        println "owner : " + owner;
        println "Delegate :" + delegate

    }
}
