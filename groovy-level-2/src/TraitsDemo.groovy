import com.microgenesis.oo.isa.traits.Bird
import com.microgenesis.oo.isa.traits.Person

//basic trait: default implementation
def bird = null;
bird = new Bird();
println(bird.fly())

def greetings= new Person(age:18);
println(greetings.greeting() + " " + greetings.age)
println(greetings.getCounter())
println(greetings.getCounter())


