package com.nhankv.solidexample.ocp.after

class AreaManager {
    fun calculateArea(shapes: ArrayList<Shape>): Double {
        var area: Double = 0.0

        for (shape in shapes) {
            area += shape.getArea()
        }
        return area
    }
}