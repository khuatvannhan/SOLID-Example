package com.nhankv.solidexample.ocp.before

class AreaManager {
    fun calculateArea(shapes: ArrayList<Any>): Double {
        var area = 0.0
        for (shape in shapes) {
            if (shape is Rectangle) {
                val rect = shape as Rectangle
                area += (rect.length * rect.height)
            } else if (shape is Circle) {
                val circle = shape as Circle
                area += (circle.radius * circle.radius * Math.PI)
            } else {
                throw RuntimeException("Shape not supported")
            }
        }
        return area
    }
}