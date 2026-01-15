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
//using final keyword in override
open class Food{
    //this functions should be open to override in the future
    open fun print(){
        println("Food")
    }
}
open class Fruit:Food(){
    final override fun print(){
        println("Fruit")
    }
}
class Fruitchild:Fruit(){
    //this gives error cause the function print is final in Fruit
    // override fun print(){
    //     println("Friutchild")
    // }
}
//handling diamond problem
interface A{
    fun show(){
        println("A")
    }
}
interface B:A{
    override fun show(){
        println("B")
    }
}
interface C:A{
    override fun show(){
        println("C")
    }
}
class D:B,C{
    override fun show(){
        //we cannot do this super<A>.show because A is not immediate super class for D
        //it will be an error
        super<B>.show()
        super<C>.show()
    }
}
//this keyword
open class This_Class(val name:String,val age:Int){
    fun info(name:String){
        println("Given name is:$name")
        println("Already given name is:${this.name}")
    }
}
//super keyword
//accessing parent method
open class Parent_Super1{
    open fun disp(){
        println("Parent class")
    }
}
class Child_Super1:Parent_Super1(){
    override fun disp(){
        println("Child Class")
        super.disp()
    }
}
//accessing parent property
open class Parent_Super2{
    open val color="Pink"
}
class Child_Super2:Parent_Super2(){
    override val color="Blue"
    fun disp(){
        println("Child color:$color")
        println("Parent color:${super.color}")
    }
}
//polymorphism using interface
interface Animal{
    abstract fun sound()
}
class Dog:Animal{
    override fun sound(){
        println("Bark")
    }
    fun eat(){
        println("Dog food")
    }
}
class Cat:Animal{
    override fun sound(){
        println("Meow")
    }
    fun eat(){
        println("Cat food")
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
    val fruitchild=Fruitchild()
    fruitchild.print()
    val d=D()
    d.show()
    val child_super1=Child_Super1()
    child_super1.disp()
    val child_super2=Child_Super2()
    child_super2.disp()
    val this_class=This_Class("Gayathri",21)
    this_class.info("Shri")
    val dog=Dog()
    dog.sound()
    dog.eat()
    val cat=Cat()
    cat.sound()
    cat.eat()
    //upcasting
    //storing a child object inside a parent refernce
    val a1:Animal=Dog()
    val a2:Animal=Cat()
    a1.sound()
    a2.sound()
    //these create error. So we use downcaste
    //a1.eat()
    //a2.eat()
    //downcasting
    //converting a parent reference back into a child refernce
    if(a1 is Dog){
        val d:Dog=a1 as Dog
        d.eat()
    }
    //another type(safe downcasting) only runs if a2 is a cat
    val c: Cat? = a2 as? Cat
    c?.eat()
}
