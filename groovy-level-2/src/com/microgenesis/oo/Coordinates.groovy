package com.microgenesis.oo

class Coordinates {
    double latitutde;
    double longitude;
    //object destrucing api
    def getAt(int idx) {
        if (idx == 0) latitutde
        else if (idx == 1) longitude
        else throw new Exception("Property not found")
    }
}
