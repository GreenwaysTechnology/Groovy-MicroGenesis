package com.microgenesis.oo.isa

class Car extends Vehicle {
    String owner;
    def stopCar() {
        'Stop Car' + super.model
    }
    def getOwner(){
        this.owner='Subramanian'
    }
    def startEngine() {
        "Car engine starts";
    }
}
