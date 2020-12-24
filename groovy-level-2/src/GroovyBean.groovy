import com.microgenesis.groovy.beans.HelloWord
import com.microgenesis.groovy.beans.User

//Strong typing
HelloWord helloWord = new HelloWord();
println(helloWord.sayHello());
println(helloWord.sayHelloAgain("Subramanian"))

def helloWorld1 = new HelloWord();
println(helloWorld1.sayHello());
println(helloWorld1.sayHelloAgain("Ram"))

//Groovy beans
User user = new User();
//calling setters
user.userId = 1; // triggers setters, no need of calling setters manually
user.userName = "Subramanian"; //
user.password = "admin"
//getters
println "User Info ${user.userId} ${user.userName} ${user.password}"

//constructors: id,name,password :groovy uses map syntax to create constructors dynamically
//key:value ; key-instance variable; value ; variable value
User user1 = new User(userId: 1, userName: 'root', password: 'super');
println "User Info  ${user1.userId} ${user1.userName} ${user1.password}"
println user1

