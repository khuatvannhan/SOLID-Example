package com.nhankv.solidexample.ocp.after

class Rectangle : Shape {
    var length: Double = 0.0
    var height: Double = 0.0

    override fun getArea(): Double {
        return (length * height)
    }
}