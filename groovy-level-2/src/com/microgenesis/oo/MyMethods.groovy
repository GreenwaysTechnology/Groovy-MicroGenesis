package com.microgenesis.oo

class MyMethods {
    //instance methods
    def someMethod() {
        'My return value'
    }

    String someMethod2() {
        'Method 2 return value'
    }

    def someParam(def param1) {
        param1
    }

    def someStringParam(String param2) {
        param2
    }

    def someParamNew(param3) {
        param3
    }
    //positional parameters
    def add(int a = 1, String foo = "hello") {
        println "$a $foo";
    }

    //Named Parameters + Positional Parameter
    def bar(Map args, Integer bar = 0) {
        println "${args.name}  ${args.city} ${bar}"
    }

}
