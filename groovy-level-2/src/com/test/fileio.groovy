package com.test

new File("hello.txt").withWriter {
    it.write('hello')
}

