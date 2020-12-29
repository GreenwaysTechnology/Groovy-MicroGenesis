package com.microgenesis.groovy.metaprog.compile

import groovy.transform.Sortable
import groovy.util.logging.Log

@Sortable()
@Log
class Employee {
    String first;
    String last
    Integer dob;

    def calculate() {
        log 'called'
    }
}
