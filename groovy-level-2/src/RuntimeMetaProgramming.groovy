import com.microgenesis.groovy.metaprog.runtime.Service
import com.microgenesis.groovy.metaprog.runtime.UtilService

def service = new Service();
//setters
service.name = 'subramanian'
service.age = 18
service.city = "Coimbatore"
//adding methods via closure
service.sayHello = {
    println "Say Hello"
}
service.calculate = { a, b -> a + b }

println service.name + " " + service.age + service.city;
service.sayHello()
println service.calculate(10, 23)

/////////////////////////////////////////////////////////////////////////////////////////////

def util = new UtilService();
//add new Property
util.metaClass.name = 'Subramanian'; // setter method on metaClass
println(util.name) //getter
util.metaClass.city = "Chennai"
println(util.city)
util.metaClass.add = { a, b -> a + b };
println util.add(10,10)


def expando = new Expando()
expando.language = 'Groovy';
expando.multiply = {it*2};
println(expando.language + " " + expando.multiply(2))









