//List and closures

def list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
list.each { println "$it" }

def iterator = { println "$it" };
list.each(iterator)
def doubleIt = { println "${it * 2}" };
list.each (doubleIt)
