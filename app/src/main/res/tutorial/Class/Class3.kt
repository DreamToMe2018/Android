package tutorial.Class

class Account1{
    // 戶名
    var name:String = ""
    //主構造函數不能包含任何的代碼。
    //初始化的代碼可以放到以init關鍵字作為前綴的初始化塊（initializer blocks）中。
    // 可以在New的過程中秀出訊息
    init{
        println("初始化，第一層")
    }

    // 類也可以聲明前綴有constructor的次構造函數：
    // 如果類有一個主構造函數，每個次構造函數需要委託給主構造函數
    // ，可以直接委託或者通過別的次構造函數間接委託。
    // 委託到同一個類的另一個構造函數用this關鍵字即可：
    // 會發生在初始化之後
    constructor(name1:String){
        name = name1
        println("初始化，第二層")
    }
}

class Class3 {
    fun main(args:Array<String>){
        // 實體化
        val account = Account1("666")
        account.name = "LS"
        println(account.name)

        //初始化，第一層
        //初始化，第二層
        //hkt
    }
}