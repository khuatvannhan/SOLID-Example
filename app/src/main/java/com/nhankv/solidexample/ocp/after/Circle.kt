package com.nhankv.solidexample.ocp.after

class Circle : Shape {
    var radius: Double = 0.0

    override fun getArea(): Double {
        return (radius * radius * Math.PI)
    }
}