package com.microgenesis.groovy.metaprog.compile

import groovy.transform.Canonical
import groovy.transform.ToString
import groovy.transform.TupleConstructor

//@TupleConstructor(excludes = ['lastName'])
//@TupleConstructor
//@ToString(includeNames = true, includePackage = false)
@Canonical()
class Customer {
    long id;
    String firstName;
    String lastName;
}
