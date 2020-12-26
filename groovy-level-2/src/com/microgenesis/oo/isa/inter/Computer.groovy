package com.microgenesis.oo.isa.inter

class Computer implements Init, Destroy {
    @Override
    def init() {
        'Init'
    }

    @Override
    def start() {
        'start'
    }

    @Override
    def destroy() {
        'Destory'
    }
}
