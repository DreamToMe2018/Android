package tutorial.Class

enum class Color{
    YELLOW,
    GREEN,
    RED
}
enum class Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY
}

class Class10 {
    fun main(args:Array<String>){
        // 0 : YELLOW
        println("${Color.YELLOW.ordinal} : ${Color.YELLOW.name}")
        // 1 : TUESDAY
        println("${Day.TUESDAY.ordinal} : ${Day.TUESDAY.name}")
    }
}