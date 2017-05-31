package xzfm.kotlin.main

/**
 * Created by wangxizhong on 2017/5/31.
 */
fun sum(a: Int, b: Int) = a + b

var a = 1
var b:Int=2
var s1 = "a is ($a+$b)"

fun main(args: Array<String>) {
    println("sum of 19 and 23 is ${sum(19, 23)}")
    println(s1)
    println(a+b)
}