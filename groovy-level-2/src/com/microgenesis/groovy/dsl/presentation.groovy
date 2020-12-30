package com.microgenesis.groovy.dsl

//def presentation(Map args, String topic) {
//    println "I am Presenting about $topic at $args.at on $args.on"
//}
//
//presentation('DSL',at:'Google',on:'Dec 30')
//
//presentation 'DSL',at:'Google',on:'Dec 30'

//def talk(topic) {
//    def talkBuilder = new TalkBuilder(topic: topic)
//    talkBuilder; // Return talk builder Object
//}
////builder class
//class TalkBuilder {
//    def topic, location, when;
//    //location function
//    def at(location) {
//        this.location = location
//        this; // returning the TalkBuilder object
//    }
//
//    def on(when) {
//        this.when = when;
//        println("I am Presenting $topic at $location on $when");
//        this;
//    }
//}
//
//talk('DSL').at('Microsoft').on('Dec 31')
//talk 'Spring With Groovy DSL ' at 'Google' on 'Jan 1'
///////////////////////////////////////////////////////////////////////////////////////////

//function + map + closure
def speak(topic) {
    ['at': { location ->
        ['on': {
            when -> println("I am Presenting $topic at $location on $when");
        }]
    }];
}

speak 'Spring With Groovy DSL ' at 'Google' on 'Jan 1'
////////////////////////////////////////////////////////////////////////////////////////////////////
//please show the sequare_root of 100

def show = { println it }
def square_root = { Math.sqrt(it) }

def please(action) {
    [the: {
        what ->
            [of: {
                number -> action(what(number))
            }
            ]
    }]
}
please show the square_root of 100
please show the square_root of 400
///////////////////////////////////////////////////////////////////////////////////////////////


def c = 10.plus 10
println c;
def pow = 10.power 2
println pow




