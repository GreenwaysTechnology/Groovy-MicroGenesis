package com.microgenesis.groovy.beans

class HelloWord {
    //methods
    String sayHello() {
        return 'Hello';
    }

    def sayHelloAgain(name = "default") {
        "Hello $name";
    }
}
