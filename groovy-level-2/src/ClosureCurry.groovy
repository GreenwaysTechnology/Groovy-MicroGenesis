def multiply = { a, b -> a * b };
def doubler = multiply.curry(10)
println doubler(10)
println doubler(40)

def log = { String type, Date createdOn, String message ->
    println "$type $createdOn $message";
}
log('Info', new Date(), 'The record is deleted')

def typeLog = log.curry("Info");
typeLog(new Date(), "The record is Inserted")
typeLog(new Date(), "The record is updated")

def dateLog = typeLog.curry(new Date());
dateLog('The record search is done!!!')

def divide = { a, b -> a / b }
def halver = divide.rcurry(2)
println(halver(10))
//N curry- index based curry

def volume = { double l, double w, double h ->
    l * w * h
};
def fixedwithVolume = volume.ncurry(1, 2d, 4d)
println fixedwithVolume(2d)
