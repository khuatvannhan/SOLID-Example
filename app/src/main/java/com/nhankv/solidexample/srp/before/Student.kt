package com.nhankv.solidexample.srp.before

import java.lang.Error
import java.util.regex.Pattern

class Student {
    var name: String = ""
    var age: Int = 0
    var email: String = ""
    var totalScores: Int = 0
    var mathScores: Int = 0
    var physicsScores: Int = 0
    var chemistryScores: Int = 0

    constructor(
        name: String, age: Int, email: String, mathScores: Int, physicsScores: Int, chemistryScores: Int
    ) {
        this.name = name
        this.age = age
        this.mathScores = mathScores
        this.physicsScores = physicsScores
        this.chemistryScores = chemistryScores
        if (validateEmail(email)) {
            this.email = email
        } else {
            throw Error("Invalid email")
        }
    }

    fun calculateTotalPoints() {
        totalScores = mathScores + physicsScores + chemistryScores
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

    fun showWelcom() {
        System.out.println("Hello word")
    }
}