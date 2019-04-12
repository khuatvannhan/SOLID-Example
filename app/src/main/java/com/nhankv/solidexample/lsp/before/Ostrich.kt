package com.nhankv.solidexample.lsp.before

class Ostrich : Bird {
    //but ostrich can't fly => error Liskov substitution principle
    override fun fly() {
        //do something
    }
}