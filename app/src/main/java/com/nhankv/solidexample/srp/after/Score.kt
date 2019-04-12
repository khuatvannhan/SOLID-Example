package com.nhankv.solidexample.srp.after

class Scores {
    var totalScores: Int = 0
    var mathScores: Int = 0
    var physicsScores: Int = 0
    var chemistryScores: Int = 0

    constructor(mathScores: Int, physicsScores: Int, chemistryScores: Int) {
        this.totalScores = totalScores
        this.mathScores = mathScores
        this.physicsScores = physicsScores
        this.chemistryScores = chemistryScores
        calculateTotalPoints()
    }

    private fun calculateTotalPoints() {
        totalScores = mathScores + physicsScores + chemistryScores
    }
}