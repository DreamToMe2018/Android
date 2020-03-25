package tutorial.Method

class For {
    fun For(){
        var titles = listOf("C#","JAVA","KOTLIN")
        println(titles)

        for (title in titles)
            println(title)

        val from = 0
        val to = 10
        // from..to = 0 到 10
        for(count in from..to)
            println("$count")

        val num = 0
        for(count in num..(num+10))
            println("$count")

        // 每次加2
        for(i in from..to step 2)
            println("$i")

        // until = ..
        for(count in from until to)
            println("$count")

        // 遞減 10 8 6 4 2
        for(i in 10 downTo 1 step 2)
            println("$i")
    }
}