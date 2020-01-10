package tutorial.Method

class Maps {

    // 只能讀
    fun Map(){
        val map = mapOf("1" to 666, "2" to 777)
        println(map)
    }

    // 可CRUD
    fun MutableMap(){
        var mutableMap: MutableMap<String, Int> = mutableMapOf()

        //新增資料
        mutableMap.put("1", 666)
        mutableMap.put("2", 777)
        mutableMap.put("3", 888)
        println(mutableMap)

        //移除資料
        mutableMap.remove("1")
        println(mutableMap)

        //獲取資料
        mutableMap.get("2")
        println(mutableMap.get("2"))

        //刪除所有資料
        mutableMap.clear()
        println(mutableMap)
    }
}