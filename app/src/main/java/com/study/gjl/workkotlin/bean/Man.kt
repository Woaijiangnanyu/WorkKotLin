package com.study.gjl.workkotlin.bean

class Man constructor (val map:Map<String,Any?>) {
    //Map 只读
    val name:String by map
    val age:Int by map
}