package com.study.gjl.workkotlin.bean

import com.study.gjl.workkotlin.base.RectangleProperties
import com.study.gjl.workkotlin.base.Shape


class Rectangle(var height:Double,var length:Double): Shape(listOf(height,length,height,length)),RectangleProperties{
    override fun calculateArea(): Double  = height * length
    override val isSquare: Boolean get() = length == height //To change initializer of created properties use File | Settings | File Templates.
}