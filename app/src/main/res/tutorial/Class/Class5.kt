package tutorial.Class

// 加入open、override關鍵修飾詞
open class Person1 {
    //
    open var name: String = ""
}

class Account3 : Person1() {
    override var name: String = ""
}

open class Person2 {
    open fun show() {
        println("HA")
    }
}

class Account4 : Person2() {
    override fun show() {
        println("Koala")
    }
}

class Class5 {
    fun main(args: Array<String>) {
        // 實體化
        // 覆寫屬性
        val account3 = Account3()
        account3.name = "HKE"
        println(account3.name) //HA

        // 覆寫函數
        val account4 = Account4()
        account4.show() // Koala
    }
}