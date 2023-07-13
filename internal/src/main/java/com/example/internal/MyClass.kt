package com.example.internal


internal class MyClass {

    companion object {
        @JvmStatic
        fun test() {
            println("print")
        }
    }

    var x = 0;

    fun a() {

    }

    internal var internalX = 0;

    internal fun internalA() {
        println("internalA")
    }

}