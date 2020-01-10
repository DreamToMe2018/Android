package tutorial.Class

class Account {
    // 帳號
    var id: String = ""
    // 戶名
    var name: String = ""
    // 餘額
    var balance: String = ""
}

class Class2 {
    fun main(args:Array<String>) {
        // 實體化
        val account = Account()

        // 設定類別屬性值
        account.id = "LoanSky"
        account.name = "LS"
        account.balance ="100"

        // 獲取類別屬性值
        println(account.id)
        println(account.name)
        println(account.balance)
    }
}