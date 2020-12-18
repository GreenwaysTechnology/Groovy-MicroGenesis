println "Hello Groovy World"

/**

Code written by groovy for the above 

import org.codehaus.groovy.runtime.InvokerHelper;

class HelloWorld extends Script {    
                 
    def run() {                                 
  	      println "Hello Groovy World";          
    }
    static void main(String[] args) {           
        InvokerHelper.runScript(HelloWorld, args)     
    }
}
**/