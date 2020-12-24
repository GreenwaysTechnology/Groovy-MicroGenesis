import com.microgenesis.groovy.beans.Person

def person = new Person();
println person.getClass();
println person.id;
println person.@id
println person.name
println person.isActive
println person.pointers

//Person person1=new Person(name:'Subramanian');
Person person1 = null;
println person1.getClass();
//println person1.name
println person1?.name

if (person1?.name) {
    println("Name found")
} else {
    println "Name not found!"
}
def res = person1?.name ? "Name Found" : "Name Not found!"
println res;
//////////////////////////////////////////////////////////////////////////////////////////
//Method pointer Operator
Person person2 = new Person();
println person2.save()
//store method pointer into a variable
def saveDummy = person2.&save
println saveDummy();














