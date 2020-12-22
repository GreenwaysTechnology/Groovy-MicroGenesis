/**
 * Booleans in Groovy
 */

def isActive = true;
def isEnabled = false;
boolean status = true;
def a = 10;

if (isActive) {
    println "Active"
} else {
    println "InActive"
}
if (isEnabled) {
    println "Enabled"
} else {
    println "Disabled"
}
if (status) {
    println "Ok"
} else {
    println "NotOk"
}
if (a > 100) {
    println("A is greater than 100");
} else {
    println("A is not greater than 100");
}
/////////////////////////////////////////////////////////////////////////////
def start = 0;
//int start =0;
if (start) {
    println("START");
} else {
    println("STOP");
}

def city = "";
if (city) {
    println "CITY Found"
} else {
    println "CITY not Found";
}
def emp = null;
if (emp) {
    println "EMP Found"
} else {
    println "EMP not Found";
}

def name = "Subramanian";
if (name) {
    println "NAME Found"
} else {
    println "NAME not Found";
}