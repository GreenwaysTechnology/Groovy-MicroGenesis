package com.microgenesis.groovy.metaprog.runtime

class Service {
    //store all dynamic propertes and its values
    protected Map dynamicProperties = [:];
    //override set
    public void setProperty(String propertyName, Object newValue) {
        // println("$propertyName $newValue")
        dynamicProperties[propertyName] = newValue
    }

    def getProperty(String propertyName) {
       //  println("$propertyName")
        dynamicProperties[propertyName]
    }

    def methodMissing(String methodName,args){
        def prop = dynamicProperties[methodName]
        if(prop instanceof Closure){
            return prop(*args); // expand args[0],args[1],args[2]
        }
    }
}
