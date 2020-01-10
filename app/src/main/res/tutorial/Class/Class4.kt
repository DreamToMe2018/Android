package tutorial.Class

// open
open class Person {
    //
    var name: String = ""
    //
    var address: String = ""
}

// 繼承Person
class Account2 : Person() {
    var id: String = ""
}

class Class4 {
    fun main(args:Array<String>){
        // 實體化
        val account = Account2()

        account.id = "123456789"
        account.name = "HKT"
        account.address="台北市信義區信義路五段7號"

        println(account.id)
        println(account.name)
        println(account.address)
    }
}