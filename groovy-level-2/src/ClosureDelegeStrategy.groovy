Closure writer = {
    //StringBuffer method
   // append('Hello')
    //append('Subramanian')
    println "Owner $owner"
    println "this $this"
    println "delegate ${delegate}"
    println append(it);
    println log()
}
//script append method: our methods
def append(String str) {
    "Fake append"
}
def log(){
    new Date()
}

//object
StringBuffer sb = new StringBuffer();
//writer.resolveStrategy = Closure.DELEGATE_FIRST
//writer.resolveStrategy = Closure.OWNER_FIRST
writer.resolveStrategy = Closure.OWNER_ONLY
//writer.resolveStrategy =Closure.DELEGATE_ONLY
writer.delegate = sb;
writer('Hello')
writer('Hello')
writer('Hello')

