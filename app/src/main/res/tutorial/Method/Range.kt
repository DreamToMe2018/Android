package tutorial.Method

class Range {
    fun Range(){

        //以下3個從最小值到最大值，範圍操作
        //印出1~4 結果:1234
        for (i in 1..4)
            print(i)

        //每次增加2 結果:13
        for (i in 1..4 step 2)
            print(i)

        //印出1~4，但不包含4
        for (i in 1 until 4)
            print(i)

        //從最大值到最小值，範圍操作
        //定義最後結束範圍到1
        for (i in 4 downTo 1)
            print(i)
    }
}