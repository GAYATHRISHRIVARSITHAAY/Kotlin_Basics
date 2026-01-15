//multiple inheritance using interface
interface Parent1{
    abstract fun read()
    abstract fun write()
    abstract fun play()
}
interface Parent2{
    abstract fun read()
    abstract fun write()
    abstract fun sleep()
}
class Child:Parent1,Parent2{
    override fun read(){
        println("Reading..")
    }
    override fun write(){
        println("Writing")
    }
    override fun play(){
        println("Playing")
    }
    override fun sleep(){
        println("Sleeping")
    }
    fun dance(){
        println("Dancing")
    }
}
//hybrid inheritance
interface Father{
    abstract fun work()
    abstract fun earn()
}
interface Mother{
    abstract fun cook()
    abstract fun care()
}
interface Student:Mother{
    abstract fun study()
}
class Child1:Student,Father{
    override fun work(){
        println("Working..")
    }
    override fun earn(){
        println("Earning..")
    }
    override fun cook(){
        println("Cooking..")
    }
    override fun care(){
        println("Caring..")
    }
    override fun study(){
        println("Studing..")
    }
    fun child(){
        println("Child")
    }
}
fun main(){
    val child=Child()
    child.read()
    child.write()
    child.play()
    child.sleep()
    child.dance()
    val child1=Child1()
    child1.work()
    child1.earn()
    child1.cook()
    child1.care()
    child1.study()
    child1.child()
}