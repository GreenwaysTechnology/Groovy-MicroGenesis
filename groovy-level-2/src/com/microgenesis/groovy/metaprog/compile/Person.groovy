package com.microgenesis.groovy.metaprog.compile

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString(excludes = ['age'], includeNames = true, includePackage = false)
@EqualsAndHashCode(includes = ['id', 'city'])
class Person {
    long id;
    String firstName;
    String lastName;
    String age;
    String city;
//    @Override
//    String toString() {
//        return "$firstName $lastName"
//    }
}
