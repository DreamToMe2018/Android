package tutorial.Class

// 自動生成 equals() hashCode() toString() componentN() copy()
data class Account7(var id:String,var name:String)

class Class8 {
    fun main(args:Array<String>){
        val account1 = Account7("123456789","HKT")
        val account2 = Account7("666666","Kitty")
        val temp = account1

        // false
        println(account1.equals(account2))
        // -2054091236
        println(account1.hashCode())
        // -2054091236
        println(temp.hashCode())
        // -1914842213
        println(account2.hashCode())
        // 123456789
        println(account1.id)
        // HKT
        println(account1.name)
    }
}
