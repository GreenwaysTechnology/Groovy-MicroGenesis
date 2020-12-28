def outerClosure = {
    println("Outer closure")
    def a = 10;
    //you cant call this clousre outside
    def innerClosure = {
        println "Inner closure $a"
        def innerMost = {
            println "Inner most $a"
        }
        innerMost();
    }
    innerClosure()
}
outerClosure();
