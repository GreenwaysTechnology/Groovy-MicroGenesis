import com.microgenesis.oo.isa.traits.more.*

def person = new Person(name: 'Subramanian', age: 18);
println(person.sayHello())

def result = new C();
println(result.exec())
////////////////////////////////////////////////////////////////////

def machine = new Machine() as Advanced;
println machine.doStuff()

def mymachine = new Machine();
def newMachine = mymachine.withTraits Advanced, StartMachine
println(newMachine.doStuff())
println(newMachine.startMachine())