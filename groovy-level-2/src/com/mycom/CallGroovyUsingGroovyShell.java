package com.mycom;

import groovy.lang.GroovyShell;

import java.io.File;
import java.io.IOException;

public class CallGroovyUsingGroovyShell {
    public static void main(String[] args) throws IOException {
        GroovyShell groovyShell = new GroovyShell();
        double result = (Double) groovyShell.
                evaluate("(4/3) * Math.PI * 6370 " +
                        "// Earth volume in cubic killometeres ");
        System.out.println(result);
        String path="C:\\session\\MicroGenesis\\groovy-level-2\\src\\script.groovy";
        groovyShell.evaluate(new File(path));
    }
}
