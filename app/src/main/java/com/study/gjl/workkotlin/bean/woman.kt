package com.study.gjl.workkotlin.bean

class woman {
    val name:String by lazy { "liying" }
    //lateinit 不能用于基本的数据类型
    lateinit var phone:String
}