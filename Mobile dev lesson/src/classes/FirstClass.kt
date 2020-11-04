package classes

import variables.num1


fun countWords(str: String): Int {
    return str.split(" ").count().also(::println)
}

fun verticalStr(str: String){
    for (s in str.split(" ")){ println(s) }
}

fun reverseStr(str: String){
    for (s in str.split(" ").reversed()){ println(s) }
}




fun namePrint(msg : String): String{

    return msg.also(::println)
}


fun theNameBoolean(str : String): Boolean{
    val boolean = str is String
    return boolean.also { println(boolean) }
}


fun addValues(a : Int, b : Int) {
    print(a+b)
}






fun main() {
//    print("Hello my friends")
//    namePrint("this is calling the fun and printing this")
//    print("this is using the number from Var $num1")
//
//    theNameBoolean("some things")



    countWords("should be 4 words")
    verticalStr("should be 4 words")
    reverseStr("should be 4 words")
//    addValues(2,4)
}