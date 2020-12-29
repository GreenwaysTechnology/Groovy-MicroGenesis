def one = {
    //value of it would be output of second composed function
    it + 2
}
def two = {
    it * 3 //12
}
def three1 = one(two(4))
println three1// one(two(4))
def three = one << two // composition one(two(4))
println three(2)// one(two(4))

//This reverse operation for above one
def four = one >> two
println four(2)