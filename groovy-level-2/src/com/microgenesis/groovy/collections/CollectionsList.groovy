package com.microgenesis.groovy.collections

//list
def names = ['subramanian', 'Ram', 'Karthik'];

names.each { println it }

class Product {
    Integer id;
    String name;
    double price;
}

def products = [
        new Product(id: 1, name: 'phone', price: 10.5),
        new Product(id: 2, name: 'camera', price: 90.5),
        new Product(id: 3, name: 'Laptop', price: 1990.5)

]
products.each { println "${it.id} ${it.name} ${it.price}" }

///api filter api which reutrns based true or false.

def addNumbers(item) {
    def items = [];
    items.add(item);
    items;
}

for (int i = 0; i < 10; i++) {
    addNumbers(i).each { println it }
}
//////////////////////////////////////////////////////////////////////////////////////////////
//set avoids duplicates
println "Set"
def uniqueNumbers = [1, 1, 2, 4, 5, 5, 6, 7, 8, 9, 8] as Set;
uniqueNumbers.each {println it}
/////////////////////////////////////////////////////////////////////////////////////////////////
def empDetails = [
        id:1,
        name:'Subramnian',
        salary:1000

];
println "$empDetails.id $empDetails.name $empDetails.salary"

empDetails.each {key,value->println "$key $value"}
///////////////////////////////////////////////////////////////////////////////////////////////
def letters = 'a'..'z';
letters.each {println it}

