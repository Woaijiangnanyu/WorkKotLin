package com.study.gjl.workkotlin.base

abstract class Shape (val sides:List<Double>){
    val perimeter : Double get() = sides.sum()
    abstract fun calculateArea():Double
}