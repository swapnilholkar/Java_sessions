package com.example.firstapplication

import kotlin.random.Random

var joinedList= mutableListOf<String>()

fun listBase() : String {
    var maleNames = listOf<String>("Luke", "Swapnil", "Ali","John")
    var femaleNames = listOf<String>("Lucy", "Jennifer", "Sumaya", "Mai")
    joinedList.addAll(maleNames)
    joinedList.addAll((femaleNames))
    var r = (1..joinedList.count()).random()
   return joinedList[r]

}
//
//fun listBase(): String {
//    var maleNames = mutableListOf("SWapnil","Niklas" "Luke", "Enrico")
//    var femaleNames = mutableListOf("Lucy", "Jennifer", "Sumaya")
//    var joinedList = maleNames union femaleNames
//    return joinedList.random()
//}