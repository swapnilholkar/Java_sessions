package classes

class Artithmetic(var num1: Int,var num2: Int){

    fun addition(): Int {
        return num1+num2.also(::print)
    }

    fun subtraction(): Int {
        return num1-num2.also(::print)
    }

}

fun main() {

    Artithmetic(1,3).addition()
    Artithmetic(1,3).subtraction()

}



//Null value checking:
//fun main() {
//    var isNotNull: String = "I can't be null"
//    var isNull: String? = null
//    var size = 0
//    //null check
//    size = isNull?.length ?: -1
//    println(size)
//    //null check, safe call operator
//    println(isNull?.length)
//    //Elvis Operator
//    size = isNull?.length ?: -2
//    println(size)
//    //!! only used when you're aware of the value
////    val l = isNull!!.length
////    isItNull(null)
////    FullName("bob", "jones")
////    MoreNames("first", second = "second")
//}