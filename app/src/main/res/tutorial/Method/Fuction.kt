package tutorial.Method

class Fuction {
    // 定義add方法
    fun add(){
        var x =1
        var y =1
        print(x+y)
    }

    //定義add方法，接收兩個參數，並進行運算
    fun add2(x:Int,y:Int){
        print(x+y)
    }

    //回傳運算值  要回傳的東西要加在後面: Int
    fun add3(x:Int,y:Int) : Int{
        return x+y
    }

    //回傳運算值
    fun add4(x: Int = 2, y: Int = 5): Int {
        return x + y
    }

    //回傳運算值
    fun add5(x: Int = 2, y: Int = 5): Int {
        // format 方法
        //1
        println("x = $x")
        //2
        println("y = $y")
        return x + y
    }

    // 單行表達函數
    fun add6(x: Int = 2, y: Int = 5) = x + y

    fun main(args:Array<String>){

        // 呼叫add方法
        add()

        //呼叫add方法，帶兩個參數
        add2(1,1)

        //呼叫add方法，帶兩個參數，並接收回傳值
        val result = add3(1,1)
        print(result)

        //呼叫add方法，沒帶參數則用默認參數
        val result1 = add4()
        print(result1)

        val result2 = add4(1, 2)
        print(result2)

        //命名參數呼叫 自己指定要先塞哪個參數
        val result3 = add5(y = 2,x = 1)
        print(result3)

        //命名參數呼叫
        val result4 = add6(1, 1)
        print(result4)
    }
}