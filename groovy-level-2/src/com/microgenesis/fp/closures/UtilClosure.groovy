package com.microgenesis.fp.closures

class UtilClosure {
    String name = 'Ram'
    def lowerCasedName = {
        println "this : ${this}"
        println "Owner : ${owner}"
        println "Delegate : ${delegate}"
        println("${delegate.name.toLowerCase()}")
    }
    def upperCasedName = {
        println "this : ${this}"
        println "Owner : ${owner}"
        println "Delegate : ${delegate}"
        println("${name.toUpperCase()}")
    }
}
