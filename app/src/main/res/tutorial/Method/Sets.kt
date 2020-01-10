package tutorial.Method

class Sets {

    // 只能讀
    fun Set(){
        var set = setOf(666,777,888)
        println(set)
    }

    // 能CRUD
    fun MutableSet(){
        var mutableSet:MutableSet<Int> = mutableSetOf()

        //新增資料
        mutableSet.add(666)
        mutableSet.add(777)
        mutableSet.add(888)
        println(mutableSet)

        //移除資料
        mutableSet.remove(666)
        println(mutableSet)

        //判斷元素，是否包含在 Set 集合內
        println(mutableSet.contains(777))

        //清除所有資料
        mutableSet.clear()
        println(mutableSet)
    }
}