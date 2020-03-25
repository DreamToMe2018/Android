package tutorial.Method

class Lambda {
    fun main(args:Array<String>){
        // 基本
        var printMsg = {msg:String -> println("lambda -> ${msg}")}

        printMsg("123")

        fun printMsg(msg:String) {
            println("fun($msg)")
        }

        printMsg("456")

        // lambda 也可以傳入多個參數
        // sumB 主要是將傳入與回傳型態提取出來在一開始指定，雖然 lambda 對於回傳型態是可以自行推斷，
        // 不過指定的好處就是避免推斷出來的型態並非預期型態，導致接續程式設計沒有考量到。
        var sumA = {x:Int,y:Int -> x+y}
        sumA(1,2).also(::println)
        // 3

        var sumB :(Int,Int) -> Int={x,y->x+y}
        sumB(1,2).also(::println)
        // 3

        // lambda 可以將函式以引數方式傳遞，首先我們在一個 fun process 中除了接收字串參數外，
        // 也設定一個 f 支援傳入函式，var step使用兩段 println 當作示範，
        // Line: 13, 14 是相同的結果以不同方式編寫，下圖中可以看到 Line: 2，程式進入 fun process 後，仍可執行代入的函式 f()，執行流程可參考最下方的印出結果。
        fun process(str:String,f:() -> Unit){
            println("In process")
            f()
            println(str)
        }

        var step = {
            println("Step 1")
            println("Step 2")
        }

        process("Done",step)
        process("Done",{
            println("Step 1")
            println("Step 2")
        })

        // lambda 也能運用在擴充方法上，str 是一個文字型態 String，
        // 透過宣告在 String 上擴充一個 another 方法，並且支援傳入 Int 參數，
        // 方法回傳型態為 String，方法內容則是本體 (this) + 傳入參數 (it)。
        // 這種寫法可以在 IDE 中打上任何自串型態變數時，能從編輯建議中看到 another 的蹤跡。
        var another : String.(Int) -> String = {this + it}
        var str = "123"

        str.another(456).also(::println)

        // 在陣列中也有 lambda 的使用方式，
        // Line: 62 代表將 arr 之中的每一個值以 item 代稱，
        // 接著在 -> 之後進行處理。Line: 63 的示範表示 item 並非固定命名，
        // 你可以使用任何的代稱，不過還是注意易讀及易用性的平衡。
        // Line: 64 則介紹 it 這個關鍵字，使用 it 時就可省略前面的代稱指定，示範參照下圖：
        val arr = arrayOf(1,2,3,4,5)
        arr.forEach { item -> print(item) }
        arr.forEach { i-> print(i) }
        arr.forEach { print(it) }

        // 對於一開始接觸的人可能會覺得 a -> a > 3 這堆符號到底在表達什麼很難懂，
        // 最簡單的方式是把 -> 視為分隔，前面為代稱，後方為要處理的方法，避免整段連在一起看，應該會比較好理解
        arr.any{a->a>3}.also (::println)
        arr.all { it>3 }.also (::println)
        arr.count{it>3}.also (::println)
        // true
        // false
        // 2
    }
}