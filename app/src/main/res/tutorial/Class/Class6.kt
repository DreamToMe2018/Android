package tutorial.Class

class Account5 : IPersonService {
    override fun show() {
        println("Name: HKA")
    }
}

class Class6 {
    fun main(args: Array<String>) {
        var account5 = Account5()
        account5.show() // name:HKT
    }
}