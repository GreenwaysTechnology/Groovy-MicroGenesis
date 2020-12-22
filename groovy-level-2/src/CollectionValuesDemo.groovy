println "Collection types"

println "...............List..................."

def list = [1, 2, 3, 45, 66];
println list;
println list instanceof java.util.List
println list instanceof java.util.ArrayList
def names = ["Subramanian", "Geetha", "Ram", "Karthik"];
println names
def something = [1, "hello", 2, true];
println something

//declare linkedList
def nodes = [1, 2, 34, 56] as LinkedList;
println nodes instanceof java.util.LinkedList

//empty list ; no values
def emptyList = [];
//truth and falsy values in List

if (nodes) {
    println "Nodes Present"
} else {
    println("Nodes not Present")
}
if (emptyList) {
    println "Not Empty List"
} else {
    println("Empty  List")
}

/////////////////////////////////////////////////////////////////////////////////////
//Arrays
String[] strs = ['Hello', 'Hai'];
println strs
//def [] ints = [1,23]
def ints = [1, 23] as int[];
println ints instanceof java.util.ArrayList
println ints instanceof int[]
//Arrays : java style declaration
def mynumbers = new int[]{2, 45, 1, 2, 3};

def emptyArray = [] as int[];
if (emptyArray) {
    println "Not Empty Array"
} else {
    println("Empty  Array")
}
/////////////////////////////////////////////////////////////////////////////////////////////

def map = [1: 'Subramanian', 2: 'Ram', 3: 'Karthik']
println map;
println map.get(1)
println map instanceof java.util.Map;
println map instanceof java.util.LinkedHashMap;

//empty map declaration
def emptyMap = [:];
println(emptyMap)
//Truthy and falsy values in Map
if(map){
    println "Map Present"
}else{
    println "Map not present"
}

if(emptyMap){
    println "Map Present"
}else{
    println "Map not present"
}
