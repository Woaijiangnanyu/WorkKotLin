package com.study.gjl.workkotlin.utils

import android.os.Build
import androidx.annotation.RequiresApi
import com.study.gjl.workkotlin.bean.User
import java.lang.IllegalStateException
import java.nio.file.Files
import java.nio.file.Paths

class KotlinUtil {

    /**
     * Function having two Int parameters with Int return type:
     */
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * Function with an expression body and inferred return type:
     */
    fun sum2(a: Int, b: Int) = a + b

    /**
     * Function with an expression body and inferred return type:
     */
    fun printSum(a: Int, b: Int): Unit {
        println("sum of $a and $b is ${a + b}")
    }

    /**
     * Unit return type can be omitted:
     */
    fun printSum2(a: Int, b: Int) {
        println("sum of $a and $b is ${a + b}")
    }

    /**
     * Assign-once (read-only) local variable:
     * val read-only need initializer 只读的需要初始化变量
     */
    fun loaclVariable() {
        val a: Int = 1
        val b = 2
        val c: Int
        c = 3
        println("a = $a ,b = $b ,c = $c")
    }

    /**
     * Top-level variable
     */
    val PI = 3.14
    var x = 0
    fun incrementX() {
        x += 1
    }

    /**
     * String
     */
    fun str() {
        var a = 1
        val s1: String = "kotlin for android a is$a"
        a = 2
        val s2 = "${s1.replace("is", "was")},but now is $a"
        println(s2)
    }

    /**
     * an expression
     */
    fun maxof(a: Int, b: Int): Int {
        if (b > a) {
            return b
        } else return a
    }

    fun maxof2(a: Int, b: Int) = if (a > b) a else b

    /**
     *  function returning nullable value
     */
    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    fun printProduct(arg1: String, arg2: String) {
        val x = parseInt(arg1)
        val y = parseInt(arg2)
        if (x != null && y != null) {
            println(x * y)
        } else println("a '$arg1' ,or b '$arg2' is not integer")
    }

    /**
     * type checks and automatic casts 类型自动转换
     */
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            return obj.length
        } else return null
    }

    /**
     * using for loop
     */
    fun loop() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (item in items) {
            println(item)
        }
    }

    fun loop2() {
        val items = listOf("apple", "banana", "kiwifruit")
        for (index in items.indices) {
            println("item at $index is ${items[index]}")
        }
    }

    /**
     * using for while
     */
    fun loop3() {
        val items = listOf("apple", "banana", "kiwifruit")
        var index = 0;
        while (index < items.size) {
            println("item at $index is ${items[index]}")
            index++
        }
    }

    /**
     * using when expression
     */
    fun describeWhen(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> "Unknown"
        }

    /**
     * Check if a number is within a range using in operator
     */
    fun ranges() {
        val x = 10
        val y = 9
        if (x in 1..y + 1) {
            println("fits in range")
        } else println("not fits in this range")

    }

    /**
     * Check if a number is out of range
     */
    fun ranges2() {
        val list = listOf("a", "b", "c")
        if (-1 !in 0..list.lastIndex) {
            println("-1 is out of range")
        }
        if (list.size !in list.indices) {
            println("list size is out of valid list range too ")
        }
    }

    /**
     * terating over a range 迭代范围
     */
    fun range3() {
        for (x in 1..5) {
            print(x)
        }
    }

    /**
     * over a progression 跳级
     */
    fun range4() {
        for (x in 1..10 step 2) {
            print(x)
        }
        println()
//        for (i in 9 downTo  0 step 3) {
//            print(i)
//        }
    }

    /**
     * Checking if a collection contains an object using in operator
     */
    fun collection2() {
        val items = listOf("apple", "banana", "kiwifruit")
        when {
            "orange" in items -> println("juicy")
            "apple" in items -> println("apple is fine too")
        }
    }

    /**
     * Using lambda expressions to filter and map collections
     */
    fun collection3() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    }

    fun collection4() {
        val list = listOf(1, 2, 3, 4)
        val positives = list.filter { x -> x > 3 }
        println(positives[positives.lastIndex])
    }

    fun foo(a: Int = 0, b: String = "") {

    }

    fun foo2() {
        val map = mapOf("key" to 20, "name" to "foo", "age" to 20)
        val map2 = mutableMapOf("key" to 20, "name" to 20, "age" to 20)
        map2["key"] = 20
        for ((k, v) in map) {
            println("$k -> $v")
        }
    }

    fun foo3() {

        val list = listOf(1, 2, 3, 4)
        val arrayDouble = list.map { value -> value * 2 }
        for (item in arrayDouble) {
            print(item)
        }
        println()
    }
//
//    fun <T,R> List<T>.map(transform:(T) -> R):List<R>{
//        val result = arrayListOf<R>()
//        for(item in this)
//            result.add(transform(item))
//        return result
//    }

    // 数组复制
    fun getSomeThing(users: MutableIterable<User>): MutableList<Any> {
        val userList = mutableListOf<Any>()
        users?.forEach { userList.add(it) }
        return userList
    }

    // 数组复制便利方式
    fun getSomeThing2(users: MutableIterable<User>): MutableList<Any> {
        return users.mapTo(arrayListOf(), { it })
    }

    /**
     * Executing a statement if null
     */
    fun foo4() {
        val map = mapOf("name" to "niu", "age" to 20)
        val emial = map["email"] ?: throw IllegalStateException("Email is missing")
        val emails = listOf<String>()
        val mainEmail = emails.firstOrNull() ?: "empty"
    }

    fun transform(color: String): Int {
        return when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> throw IllegalArgumentException("Invalid color param value")
        }
    }

    /**
     * 'try/catch' expression
     */
    fun test() {
        val result = try {
            //count()
        } catch (e: ArithmeticException) {
            throw IllegalStateException(e)
        }
        // Working with result
    }

    fun foo6(param: Int) {
        val result = if (param == 1) {
            "One"
        } else if (param == 2) {
            "Second"
        } else {
            "Three"
        }
        println(result)
    }

    fun arrayOfMinusOnes(size: Int): IntArray {
        //apply 根据指定的函数 fill 指定参数填满
        return IntArray(size).apply { fill(7) }
    }

    @RequiresApi(Build.VERSION_CODES.O)
            /**
             * Java 7's try with resources
             */
    fun withResure() {
        val stream = Files.newInputStream(Paths.get("/some/file.txt"))
        stream.buffered().reader().use { reader -> println(reader.readText()) }
    }

    fun foo6() {
        val str = "abcd"
        for (c in str) {
            println(c)
        }
    }

    fun foo7(): String {
        val price = """
                    ${'$'}9.99
                    """
        val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
        return text
    }
}
