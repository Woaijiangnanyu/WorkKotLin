package com.study.gjl.workkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.study.gjl.workkotlin.bean.*
import com.study.gjl.workkotlin.utils.KotlinUtil
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //如何创建data_class 类
//        var person1 = Person("John")
//        var person2 = Person("John")
//        person1.age = 10
//        person2.age = 20;
//        println("person1 == person2: ${person1 == person2}")
//        println("person1 with age ${person1.age}:${person1}")
//        println("person2 with age ${person2.age}:${person2}")

        // data_class Copying
        var jack = User(name = "Jack",age = 1)
        println("jack with age:${jack.age}")
        println(jack.toString())
        var olderJack = jack.copy(age = 2)
        println("olderJack with age:${olderJack.age}")
        println("olderJack with name:${olderJack.name}")
        println("jack with age:${jack.age}")
        val man = Man(mapOf("name" to "foo","age" to 19))
        //结构声明
//        var jane = User("jane",22)
//        val (name,age) = jane;
//        println("$name , is $age years of age")
        val name = jack.component1()
        val age = jack.component2()
//
        var kotUtil = KotlinUtil()
//        kotUtil.sum(1,2)
//        kotUtil.str();
//        var a = kotUtil.maxof(3,4)
//        println("maxof : $a")
//        kotUtil.printProduct("8" , "9")
//        kotUtil.printProduct("a" , "9")
//        kotUtil.printProduct("c" , "d")
//        kotUtil.loop2()
//          println(kotUtil.describeWhen(1))
//          println(kotUtil.describeWhen("Hello"))
//          println(kotUtil.describeWhen(1000L))
//          println(kotUtil.describeWhen(2))
//          println(kotUtil.describeWhen("other"))
//        kotUtil.ranges()
//        kotUtil.range3()
//        kotUtil.range4()
//        kotUtil.collection2()
//        kotUtil.collection3()
//        kotUtil.collection4()
//        kotUtil.foo2()
//        kotUtil.foo3()
//        val userList = kotUtil.getSomeThing2(mutableListOf(jack,olderJack))
//        println("userlist size is: ${userList.size}")
//        val rectangle = Rectangle(5.0,2.0) //no 'new' keyword required
//        val triangle = Triangle(3.0,4.0,5.0)
//        println("Area of rectangle is ${rectangle.calculateArea()},its perimeter is ${rectangle.perimeter}")
//        println("Area of triangle is ${triangle.calculateArea()},its perimeter is ${triangle.perimeter}")
        //Creating a singleton
//        val singleton = SingletonGun.name
        //If not null and else shorthand
//        val files = File("Test").listFiles()
//        println(files?.size?:"empty")
//        println(kotUtil.transform("White"))
//        kotUtil.test()
//        kotUtil.foo6(3)
//        val intlist = kotUtil.arrayOfMinusOnes(3)
//        for (item in intlist){
//            println(item)
//        }
//        kotUtil.foo6()
        println(kotUtil.foo7())
    }

}
