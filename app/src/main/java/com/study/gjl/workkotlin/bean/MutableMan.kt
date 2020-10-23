package com.study.gjl.workkotlin.bean

class MutableMan (val map:MutableMap<String,Any>){
    //MutableMap 内容是var类型
    var name:String by map
    var ag:Int by map
}