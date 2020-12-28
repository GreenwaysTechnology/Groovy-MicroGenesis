import com.microgenesis.fp.closures.Foo

def mycls = {
    println "this : " + this;
    println "Owner :" + owner
    println "Delegate :" + delegate

}
mycls()

def myclass = new Foo();
myclass.myls()
