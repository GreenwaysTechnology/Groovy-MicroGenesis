//multiple args

def add = null;
add = { int a, int b ->
    int result = a + b;
    println "The Addition Result is ${result}";
};
add(10, 10)
//with default value
add = { int a = 0, int b = 0 ->
    int result = a + b;
    println "The Addition Result is ${result}";
};
add()
//with def and value
add = { def a = 0, def b = 0 ->
    int result = a + b;
    println "The Addition Result is ${result}";
};
add()
//with out any type or def
add = { a = 0, b = 0 ->
    int result = a + b;
    println "The Addition Result is ${result}";
};
add()
/////////////////////////////////////////////////////////////////////////////////////////////////
def sayHello = null;

sayHello = { name -> println("Hello $name") }
sayHello('Subramanian')

sayHello = {println("Hello $it") }
sayHello('Subramanian')










