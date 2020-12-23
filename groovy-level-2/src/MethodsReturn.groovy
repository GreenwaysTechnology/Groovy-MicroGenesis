String sayHello() {
    return 'Hello';
}

String result = sayHello();
println result;
println sayHello();

int add() {
    return 10 + 10;
    //  return "hello";
}

println add();

def sayHai() {
    return "Hello"
    //return 100;
}

println sayHai();
////////////////////////////////////////////////////////////////////////////////////////////////////

def getCount() {
    200; // return 200
}

println getCount()

def calculate() {
    10 + 10;
    20 + 20;
    50 + 50;
}

println(calculate())

def multiply(int a = 0, int b = 0) {
    println "multiply";
    def result = a * b;
    result * 10;
}

println(multiply(23, 89))
println(multiply()) // result

double multiply_1(int a = 0, int b = 0) {
    println "multiply";
    def result = a * b;
    result * 10;
}

println(multiply_1(23, 89))
println(multiply_1()) // result

void multiply_2(int a = 0, int b = 0) {
    println "multiply";
    def result = a * b;
    result * 10;
}

println(multiply_2(23, 89))
println(multiply_2()) // result // would be null

/////////////////////////////////////////////////////////////////////////////////////////////
def login(String userName = "admin", String password = "admin") {
    userName.equals("admin") && password.equals("admin");
}

def status;
status = login('guest', 'guest') ? 'Login Success' : 'Login failed';
println status
status = login() ? 'Login Success' : 'Login failed';
println status;