package tutorial.Method

class While {
    fun While(){
        var x = 60

        while (x>0)
            println(x--)

        do{
            println(x)
            x--
        }while (x>0)
    }
}