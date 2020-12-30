package com.microgenesis.groovy.fileio

def readFile() {
    try {
        def file = new File("greetings.txt")
        file.eachLine { println "$it" }
    }
    catch (Exception es) {
        println es.getMessage()
    }
}

readFile()

//list all files from the directory
def listFiles() {
    try {
        def dir = new File(/c:\ /)
        dir.eachFile { file -> println file.name }
    }
    catch (Exception es) {
        println es.getMessage()
    }
}

listFiles()

def writeData(info) {
    try {
        new File('foo.txt').withWriter('utf-8') { writer ->
            writer.writeLine(info)
        }
    }
    catch (Exception es) {
        println es.getMessage()
    }
}

writeData("Hello!! Greetings!!")

//file copy

def fileCopy() {
    try {
        def source = new File("foo.txt")
        def dest = new File("foocopy.txt")
        //copy
         dest << source.text
    }
    catch (Exception es) {
        println es.getMessage()
    }
}
fileCopy()
