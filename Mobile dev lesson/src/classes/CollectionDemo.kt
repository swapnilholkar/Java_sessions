package classes

//can add values to the lists (mutable)
val names = mutableListOf<String>("Ed", "Tony", "Swapnil ")
val namesImu = listOf<String>("hello", "this", "is", "test")
//val numbers = (0..20).toList()
val numbers = (0..20).toMutableList()

//sets doesn't print duplicates
val setNumber = setOf(1,2,3,4,5,5,6)
val count = setNumber.count()
val max = setNumber.max()

//Maps

val firstMap = mapOf<Int, String>(0 to "value1",1 to "value2",2 to "value2")
val firstMapforchange = mutableMapOf<Int, String>(0 to "value1",1 to "value2",2 to "value2")

val hashDemo = hashMapOf<Int, String>(0 to "value1",1 to "value2",2 to "value2")

fun main() {

    //for maps
    print(firstMap[0])
    println(firstMap.getOrDefault(3,"value3"))

    firstMapforchange.put(0,"updatedvalue")
    println(firstMapforchange)

    //for hashmaps
    hashDemo[0] = "key0"
    hashDemo[1] = "Key1"
    hashDemo.remove(0)
    //others

//    println(names)
//    println(namesImu)
//    println(names[0])
//
//    println("i think if you want to add something inside string with the name ${names[1]}, ${names.get(2)}")
//    println("you can also print the min or max of a set in a string ${setNumber.min()}, and ${setNumber.max()}")
//    println(setNumber)
//    println(numbers.subList(4,10))
//    print(count)
//    print(max)
//
//    println(numbers union setOf(21,22))
//    println(numbers intersect  setOf(21,22))
//    println(numbers subtract setOf(5, 6))





}