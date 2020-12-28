import com.microgenesis.fp.closures.Boss
import com.microgenesis.fp.closures.Person
import com.microgenesis.fp.closures.UtilClosure

//define closure that return uppercase
def upperCasedName = {
    println "this : ${this}"
    println "Owner : ${owner}"
    println "Delegate : ${delegate}"
   // println("${delegate.name.toUpperCase()}")
    println("${name.toUpperCase()}")
}

def person = new Person(name: 'subramanian');
def boss = new Boss(name: 'Dhivya sree')
//upperCasedName()
//bind this closure to Person Object
upperCasedName.delegate = person;
println ".............After changing Delegate........"
upperCasedName()
upperCasedName.delegate = boss;
upperCasedName()
/////////////////////////////////////////////////////////////////////////////
//lower case
def util = new UtilClosure();
util.lowerCasedName.delegate = person
util.lowerCasedName()



