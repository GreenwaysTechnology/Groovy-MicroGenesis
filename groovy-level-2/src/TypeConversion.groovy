//type conversion
//int is converted to byte.
byte b = 10000;
println b;
byte b1 = (byte) 10000;
println b1;

float f = 10.5;
float f1 = 10.5f;

println f;
println f1;

//////////////////////////////////////////////////////////////////////////////////////////////////

//Dynamic typing and type conversion

def myvar = 100;
println myvar instanceof Integer /// int
//What if i want to convert into Short, i want to represent in side short/long/byte
def myvar2 = 100 as Short;
println myvar2 instanceof Integer /// int
println myvar2 instanceof Short /// int
//////////////////////////////////////////////////////////////////////////////////////////////

Integer j = 10;
int y = j * 10;
println y;

def x = 100;
def result = x * 100;
println result;

////////////////////////////////////////////////////////////////////////////////////////////////

def ab = 100;
def c =10.5;
def myresult = ab * c; // integer * bigdecimal
println myresult

println "................"
int c1 = 10;
float c2 = 10.5;
def y1 = c1 * c2;
println y1;
println (y1 instanceof Double) // Result cannot be found
