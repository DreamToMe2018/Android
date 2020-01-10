package tutorial.Method

class Lists {

    // 只能讀
    fun List(){
        //宣告一個 List 集合，並初始化資料，kotlin 會根據資料，自動推斷，資料型別
        var lists = listOf(666,777,888)

        //取出索引值為1的資料
        println(lists[1])
    }

    // 能CRUD
    //若需要事後可以修改，需使用 MutableList 集合操作新增、移除、讀取、全部刪除資料:
    fun MutableList() {
        //宣告一個 MutableList 資料型態為整數的集合變數
        var mutableList:MutableList<Int> = mutableListOf()

        //新增資料
        mutableList.add(666)
        mutableList.add(777)
        mutableList.add(888)
        println(mutableList)

        //獲取索引第二筆資料
        mutableList[2]
        println(mutableList[2])

        //移除資料為 666 的資料（需要注意的是這裏跟 Java 不同，此處移除不是根據索引筆數）
        mutableList.remove(666)
        println(mutableList)

        //根據索引筆數刪除方式
        mutableList.remove(mutableList[1])
        println(mutableList)

        //刪除全部 mutableList 內的資料
        mutableList.clear()
        println(mutableList)
    }
}