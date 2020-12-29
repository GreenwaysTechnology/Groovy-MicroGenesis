package com.microgenesis.groovy.metaprog.compile

import groovy.transform.ToString
import groovy.transform.builder.Builder
import groovy.transform.builder.SimpleStrategy

@ToString
@Builder(builderStrategy = SimpleStrategy)
class Message {
    String from, to, subject, body
}
