package classes


fun main() {
    print(understandingWhenClause(-5))
}

fun understandingWhenClause(temp: Int) {
    when (temp) {
        in 25..30 -> println("It's hot")
        in 16..24 -> println("Shorts weather?")
        in 10..15 -> println("getting cold..!")
        in 1..9 -> println("let's stay inside..")
        in -1..1 -> print("Not a good idea")
        else -> print("this value isn't here")
    }
}