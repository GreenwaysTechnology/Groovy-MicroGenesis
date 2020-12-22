def isActive = true;

if (isActive) {
    println "Active"
} else {
    println "Not Active"
}
///////////////////////////////////////////////////////////////////////////////////////////
def x = 1.23;
def result = "";

switch (x) {
    case "foo":
        result = "foo value"
        break
    case "bar":
        result = "bar value"
        break
    case 122:
        result = "some numbers"
        break
    case true:
        result = "some boolean"
        break
    case Integer:
        result = "Integer value"
        break
    case ~/fo*/:
        result = "Regular expression value"
        break
    case Number:
        result = "Number value"
        break;
        defalut:
        result = "No match found"
}
println result;
