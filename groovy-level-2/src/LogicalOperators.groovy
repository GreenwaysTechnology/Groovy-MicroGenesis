def isActive = true;
def isEnabled = true;
println " && => " + isActive && isEnabled; //true
println " || => " + isActive || isEnabled; //true
println " !  => " + !isEnabled; //false

def name = ""   //false
def city = "Coimbatore";  //true
println name && city; //?


def start = 0; //0 false
def stop = 10; //10 true
println start || stop; // true

def isEmpty;
println isEmpty;
println !isEmpty
isEmpty = "hello"
println !isEmpty



