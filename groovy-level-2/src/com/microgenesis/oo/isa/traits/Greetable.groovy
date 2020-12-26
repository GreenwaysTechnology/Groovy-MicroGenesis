package com.microgenesis.oo.isa.traits

trait Greetable implements Named {
    //abstract String name();
    private String getMessage() {
        'Hello'
    }
    @Override
    String name() {
        'Subramanian'
    }
    String greeting() {
        "${getMessage()} ${name()} "
    }
}