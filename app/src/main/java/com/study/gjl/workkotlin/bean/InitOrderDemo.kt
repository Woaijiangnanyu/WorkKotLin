package com.study.gjl.workkotlin.bean

class InitOrderDemo constructor(name:String) {
    val firstProperty = "First property :$name".also (::println)
    init {
        println("First initializer block that prints${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(:: println)
    init {
        println("second initializer block that prints${name.length}")
    }

}