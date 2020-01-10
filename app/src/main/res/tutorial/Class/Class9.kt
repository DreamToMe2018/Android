package tutorial.Class

class Box<T>(t: T) {
    var value: T = t
}

class Class9 {
    fun main(args:Array<String>){
        // 1
        val boxInt = Box(1)
        println(boxInt.value)

        // 我是字串
        val boxString = Box("我是字串")
        println(boxString.value)
    }
}