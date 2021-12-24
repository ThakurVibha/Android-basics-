package com.example.crypton.kotlinbasics

import java.util.*

//Kotlin classes tutorial shows how to work with classes in Kotlin language.
// A class is a blueprint for an object in Kotlin.
//There are three widely used programming paradigms: procedural programming, functional programming, and object-oriented programming. Kotlin supports all of them.
// In object-oriented programming, we solve complex problems using objects.
//Object-oriented programming (OOP) is a programming paradigm that uses objects and
// their interactions to design applications and computer programs.


//Simple class
class Simple {

    private val name = "Simple"
    fun info() = "This is $name class"
}

//Empty class
//An empty class has no members or member functions. The curly brackets can be omitted.

class Being {

}

class Empty

//Kotlin primary constructor
//A Kotlin class can have a primary constructor and one or more secondary constructors. The primary constructor is part of the class header:
// it goes after the class name (and optional type parameters)
class User(name: String, email: String) {

    private val name = name
    private val email = email

    override fun toString(): String {

        return "User $name has email $email"
    }

}
//Maximum element in array
class MaxArray(){
    var a= arrayOf(22, 33, 44,11, 60, 55)

    var max=a[0]
    fun maxNumberInArray(){
        for (i in a){
            if(max<i){
                max=i
                var sortedArray=a.sortDescending()
                println(sortedArray)


            }
        }
        println(max-2)

    }
}
fun main() {

//    val s = Simple()
//    println(s)
//    println(s.info())
//
//    var being = Being()
//    println(being)
//
//    var empty = Empty()
//    println(empty)
//
//    val u=User("Vibha Thakur", "vibha@gmail.com")
//    println(u)

    var max=MaxArray()
    max.maxNumberInArray()
}

