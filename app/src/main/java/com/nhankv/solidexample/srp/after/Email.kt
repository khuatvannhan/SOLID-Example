package com.nhankv.solidexample.srp.after

import java.lang.Error
import java.util.regex.Pattern

class Email {
    var email: String = ""

    constructor(email: String) {
        if (validateEmail(email)) {
            this.email = email
        } else {
            throw Error("Invalid email")
        }
    }

    private fun validateEmail(email: String): Boolean {
        val emailAddressPattern = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        return emailAddressPattern.matcher(email).matches()
    }
}