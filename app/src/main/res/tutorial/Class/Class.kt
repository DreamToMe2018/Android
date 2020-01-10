package tutorial.Class

// 說明一個Class可以放多個方法 例計算機
class Calc{
    //加法
    fun sum(x: Int, y: Int) {
        println(x + y)
    }

    //減法
    fun substract(x: Int, y: Int) {
        println(x - y)
    }

    //乘法
    fun multiply(x: Int, y: Int) {
        println(x * y)
    }

    //除法
    fun divide(x: Int, y: Int) {
        println(x / y)
    }
}


class Class {
    fun main(args:Array<String>){
        // 2
        Calc().sum(1,1)

        //0
        Calc().substract(1,1)

        //1
        Calc().multiply(1,1)

        //1
        Calc().divide(1,1)
    }
}

