import com.microgenesis.oo.isa.inter.AirPlane
import com.microgenesis.oo.isa.inter.Bird
import com.microgenesis.oo.isa.inter.SpiderMan

//Flyable flyable = null;
//Object flyable=null;
def flyable = null;
flyable = new Bird();
println(flyable.fly())
println(flyable.eat())
flyable = new AirPlane();
println(flyable.fly())

flyable = new SpiderMan();
println(flyable.fly())


