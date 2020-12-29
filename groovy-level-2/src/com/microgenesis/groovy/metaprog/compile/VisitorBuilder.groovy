package com.microgenesis.groovy.metaprog.compile

import groovy.transform.builder.Builder
import groovy.transform.builder.ExternalStrategy

@Builder(builderStrategy = ExternalStrategy, forClass = Visitor)
class VisitorBuilder {
}
