//Identify the type of variable.
//instance of operator tells that the variable belongs to what type ?
//either byte /short/long/int.
//variableName instanceof Type

def myvar = 1;
println "My var instance of   : " + myvar instanceof Byte;
println "My var instance of   : " + myvar instanceof Short;
println "My var instance of   : " + myvar instanceof Integer;
println "My var instance of   : " + myvar instanceof Long;
println "My var instance of   : " + myvar instanceof Float;
println "My var instance of   : " + myvar instanceof Double;
println "My var instance of   : " + myvar instanceof BigInteger;
println "With out string concation"
println myvar instanceof Integer
println myvar instanceof Short
println myvar instanceof Byte
println myvar instanceof Long

println "initalizing with long numbers"
myvar = 999999999999999;
println myvar instanceof Integer
println myvar instanceof Short
println myvar instanceof Byte
println myvar instanceof Long
println "initalizing with big  numbers"
myvar = 9999999999999999777777777777777777777777777777777777777777777777777777777777777777;
println myvar instanceof Integer
println myvar instanceof Short
println myvar instanceof Byte
println myvar instanceof Long
println myvar instanceof BigInteger
/////////////////////////////////////////////////////////////////////////////////
println "String identification"
myvar = "hello world"
println myvar instanceof String;
println "Character identification"
myvar = 'A';
println myvar instanceof Character;
println myvar instanceof String;
////////////////////////////////////////////////////////////////////////////////////////////
println "Boolean identification"
myvar = true;
println myvar instanceof Boolean;
/////////////////////////////////////////////////////////////////////////////////////////////////
println "Decimal identification"
myvar = 10.89000;
println myvar instanceof Float; //false
println myvar instanceof Double; //false
println myvar instanceof BigDecimal; //true
///////////////////////////////////////////////////////////////////////////////////////////////////



