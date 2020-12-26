import com.microgenesis.oo.abs.Crow
import com.microgenesis.oo.abs.Dove

def bird = null;
bird = new Dove();
println(bird.eat())
println(bird.saveBirds())
bird = new Crow();
println(bird.eat())
println(bird.saveBirds())
