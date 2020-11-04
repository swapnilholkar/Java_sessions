package classes

interface Parent {

    val eyeColour: String
        get() = "blue"

    val hairColour: String
        get() = "Black"

    fun eyeColour(){
        print(eyeColour)
    }

    fun hairColour(){
        print(hairColour)
    }
}

