package com.microgenesis.builder

import groovy.transform.ToString
import groovy.transform.builder.Builder

@Builder
@ToString
class Message {
    String from, to, subject, body
}
