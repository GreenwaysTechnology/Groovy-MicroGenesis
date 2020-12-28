//method takes String parameter
void sayGreet(String name) {
    println("$name")
}
//hardcode value
sayGreet('Subramanian')
def firstName = 'Subramanian';
sayGreet(firstName);
//method can take closure as parameter.
void connect(def callback) {
    //invoke closure
    callback();
}
//pass closure via variable
def db = {
    println "Database Connection";
};
connect(db)
//pass closure directly
connect({
    println "NOSQL Connection"
})
///////////////////////////////////////////////////////////////////////////////////////////////////
//what if a closure takes args
void startWebServer(def callback) {
    callback('Running')
}

//def server = { status -> println "Server is $status" }
def server = { println "Server is $it" }
startWebServer(server)
//startWebServer({ status -> println "Server is $status" })
startWebServer({ println "Server is $it" })
///////////////////////////////////////////////////////////////////////////////////////////////////
//Passing multiple closures as parameter and invoke any of them

void login(resolve, reject) {
    //biz logic
    String userName = 'admin'
    String password = 'foo';
    if (userName.equals('admin') && password.equals('admin')) {
        resolve('Login Success')
    } else {
        reject('Login failed')
    }

}

login({
    println "$it"
}, {
    println "$it"
})

login { println "$it" } { println "$it" }
//////////////////////////////////////////////////////////////////////////////////////////////////
println "Closure as parameter to another closure"
def auth = { userName, password, resolve, reject ->

    if (userName.equals('admin') && password.equals('admin')) {
        resolve('Login Success')
    } else {
        reject('Login failed')
    }
};
auth('admin', 'admin', { println "$it" } ,{ println "$it" });

auth('admin', 'admin') { println "$it" } { println "$it" }




























