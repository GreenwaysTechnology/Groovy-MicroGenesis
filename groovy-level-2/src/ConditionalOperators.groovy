//!
def myvar = true;
println !myvar;
//?:
//where ever if ..else lader you can replace with ?:
def a = 10;
def b = 20;
if (a == b) {
    println "Equal"
} else {
    println "Not equal"
}
a == b ? println("Equal") : println("Not Equal");
def result = a == b ? "Equal" : "Not Equal";
println result
def name = "subramanian";
def found = name ? "Name Found $name" : "Name not Found"
println found;
//////////////////////
def price;
//Using tenary
println price ? price : 10;
//Using elivs
println price ?: 10

def totalPrice = price?:10 * 100;
println "Total Price $totalPrice"


