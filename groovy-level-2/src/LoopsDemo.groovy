//classic for loop
for (int i = 0; i < 10; i++) {
    println i;
}
for (def i = 0; i < 10; i++) {
    println i;
}
//classic while loop
def x = 0
def y = 5
while (y-- > 0) {
    x++
    println "Y $y"
}
println x;
//do ..while
def counter = 5;
def fact = 1;
do {
    fact *= counter--
} while (counter > 1)
println fact

