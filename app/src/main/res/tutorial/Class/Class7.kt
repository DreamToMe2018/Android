package tutorial.Class

class Account6 {
    var id: String = ""
}

class Class7 {
    // 擴展Account，加入新功能
    fun Account6.Print() {
        println("帳號:$id")
    }

    fun main(args:Array<String>){
        val account6 = Account6()
        account6.id = "123456879"
        account6.Print() //123456789
    }
}