package com.microgenesis.groovy.beans

import groovy.transform.Canonical

@Canonical()
class User {
    //in groovy theses variables scope is public by default
    int userId;
    String userName;
    String password;
}
