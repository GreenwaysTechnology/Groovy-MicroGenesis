package com.microgenesis.pms

@groovy.util.logging.Log
class UserService {
    def createUser(String username, String password) {
        log.info("creating user with name ${username}")
    }
}