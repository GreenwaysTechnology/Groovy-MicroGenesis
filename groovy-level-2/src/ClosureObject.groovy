
//Strong clsoure
Closure myclosure = { arg -> println("$arg") }
println myclosure.getClass()
def mynewClosure = { arg -> println("$arg") }
println(mynewClosure.getClass())

//calling closure
myclosure('Hai'); // myclosure.call()
myclosure.call('Hello')
mynewClosure.call('welcome')