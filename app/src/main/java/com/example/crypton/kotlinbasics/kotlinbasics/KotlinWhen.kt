package com.example.crypton.kotlinbasics

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek
import java.time.LocalDate
//Kotlin when expression tutorial shows how to use when expressions in Kotlin.
// A when expression is a replacement of a switch statement known from C family of languages.
//Kotlin is a statically-typed programming language that runs on the Java virtual machine.
//Kotlin when matches its argument against all branches sequentially until some branch condition is satisfied.
// It can be used either as an expression or as a statement.
// If it is used as an expression, the value of the satisfied branch becomes the value of the overall expression.


@RequiresApi(Build.VERSION_CODES.O)
fun main() {
//    Kotlin when simple example
    val dayOfMonth = 6
    when (dayOfMonth) {
        1 -> println("monday")
        2 -> println("tuesday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> println("friday")
        6 -> println("saturday")
        7 -> println("sunday")
        else -> println("invalid day")
    }


    //when as an expression

    val dayOfWeek: DayOfWeek = LocalDate.now().dayOfWeek
    val day = 5

    val msg: String = when (dayOfWeek) {
        DayOfWeek.MONDAY -> "It is monday"
        DayOfWeek.TUESDAY -> "It is tuesday"
        DayOfWeek.WEDNESDAY -> "It is wednesday"
        DayOfWeek.THURSDAY -> "It is thursday"
        DayOfWeek.FRIDAY -> "It is friday"
        DayOfWeek.SATURDAY -> "It is saturday"
        DayOfWeek.SUNDAY -> "It is sunday"
        else -> "Invalid day of week"
    }

    println(msg)

//    Kotlin when grouping values
    when (day) {
        1, 2, 3, 4, 5 -> println("weekday")
        6, 7 -> println("weekend")
        else -> println("wrong value")
    }

//    Kotlin when ranges

    val age = 55

    when (age) {
        in 0..13 -> println("value from 0 to 13")
        in 14..55 -> println("value from 14 to 55")
        else -> println("value invalid")

    }

}