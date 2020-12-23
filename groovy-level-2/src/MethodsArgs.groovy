def sayHello(String name = 'defaultName') {
    println("${name.toUpperCase()}");
}

sayHello('Subramanian');
sayHello();

def add(int a = 0, int b = 0) {
    int result = a + b;
    println "The Add Result is $result";
}

add(10, 10)
add()

def doStuff(def x, def y) {
    int result = x + y;
    println "The DoStuff Result is $result";
}

doStuff(10, 10);
doStuff(78.9, 89.90)
//doStuff(true,90.78) : this produces runtime error;
def logger(String... message) {
    println message;
}

logger('hello'); //single parameter
logger('hello', 'hai'); //2 parameter
logger('hello', 'greetings', 'welcome'); //3 parameter
////////////////////////////////////////////////////////////////////////////////////////////////
//Without type keywords or def keywords

//def doSomething(def x){
//
//}
//def doSomething(String x){
//
//}
def doSomething(x = 0) {
    pritln x
}

doSomething(1000)
