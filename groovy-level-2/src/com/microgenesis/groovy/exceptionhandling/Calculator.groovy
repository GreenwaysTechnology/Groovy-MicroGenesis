package com.microgenesis.groovy.exceptionhandling

import groovy.util.logging.Log

@Log
class Calculator {
    def divNumbers(def a = 1, def b = 1) {
        //when we write risky code: code may cause runtime error at any time
        try {
            a.div b;
        }
        catch (Exception es) {
             es.getMessage()
        }
    }
}
