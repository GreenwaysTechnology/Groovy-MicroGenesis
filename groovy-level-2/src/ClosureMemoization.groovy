def fib
fib = {
    long n -> n < 2 ? n : fib(n - 1) + fib(n - 2)
}.memoize()
println(fib(25))
