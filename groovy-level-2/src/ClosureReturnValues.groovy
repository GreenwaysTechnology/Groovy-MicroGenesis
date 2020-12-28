//Closure Return Value
def add = null;
add = { a = 1, b = 2 ->
    def result = a + b;
    return result;
}
println "${add(3, 5)}"

add = { a = 1, b = 2 ->
    def result = a + b;
    result;
}
println "Without Return statement ${add(3, 5)}"
add = { a = 1, b = 2 ->
    def result = a + b;
}
println "Without Return statement ${add(3, 5)}"

add = { a = 1, b = 2 ->
    result = a + b;
}
println "Without Return statement ${add(3, 5)}"

add = { a = 1, b = 2 ->
    a + b;
}
println "Without Return statement ${add(3, 5)}"
//////////////////////////////////////////////////////////////////////////////////////////////////

def sayHello = null;

sayHello = { name -> name };
println sayHello('Subramanian')

//using it
sayHello = { it };
println sayHello('Subramanian')







