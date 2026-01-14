//encapsulation
class Bank1{
    // private set-cannot change the value from outside
    var balance:Int=0 
    private set
    
    fun get_balance():Int{
        return balance
    }
    fun add_amount(x:Int){
        balance=balance+x
        println("Amount added sucessfully and the current balance is $balance")
    }
    fun detect_amount(x:Int){
        if(x>balance){
            println("Amount not available")
        }
        else{
            balance=balance-x
            println("Amount detected successfully and the current balance is:$balance")
        }
    }
}
//inheritance

//single inheritance
open class Single1{
    fun read(){
        println("Reading the parent class")
    }
}
class Single2:Single1(){
    fun write(){
        println("writing the child class")
    }
}
//multilevel inheritance
open class Multi_Grandparent{
    fun grandpa(){
        println("Grandpa")
    }
}
open class Multi_Father:Multi_Grandparent(){
    fun father(){
        println("Father")
    }
}
class Multi_son:Multi_Father(){
    fun child(){
        println("Son")
    }
}
//hierachical inheritance
open class Hie_Mom{
    fun mom(){
        println("Hi I'm mom")
    }
}
class Hie_Son:Hie_Mom(){
    fun son(){
        println("Hi I'm son")
    }
}
class Hie_Daughter:Hie_Mom(){
    fun daughter(){
        println("Hi I'm daughter")
    }
}
//polymorphism
//compile time polymorphism(same method name but different parameters-type,order,number)
class Problem(){
    fun add(x:Int,y:Int):Int{
        return x+y
    }
    fun add(x:Int,y:Int,z:Int):Int{
        return x+y+z
    }
    fun add(x:Float,y:Float):Float{
        return x+y
    }
}
//run time polymorphism(same method in parent and child classes but child class overrides the parent class)
open class Parent{
    open fun read()
    {
        println("Parent class is reading...")
    }
}
class Child:Parent(){
    override fun read(){
        println("Child class is reading..")
    }
}
//abstract class doesnt have objects. we cannot create objects to abstract class
abstract class Bank{
    var balance:Int=0
    //abstract methods doesnt have defenitions and it is defined in its child class only
    abstract fun deposit(x:Int)
    abstract fun detuct(x:Int)
    fun get_balance(){
        println("The current balance is:$balance")
    }
}
class Savings_Account:Bank(){
    override fun deposit(x:Int){
        if(x<0){
            println("Invalid amount")
        }
        else{
            balance+=x
            println("Amount deposited successfully and the current balance is:$balance")
        }
    }
    override fun detuct(x:Int){
        if(x>balance){
            println("Amount not available")
        }
        else{
            if(balance-x>=500){
                balance-=x
                println("Amount detucted successfully and the current balance is:$balance")
            }
            else{
                println("Not possible. There should be atleast of rupee 500 in the account")
            }
        }
    }
}
class CurrentAccout:Bank(){
    override fun deposit(x:Int){
        if(x<0){
            println("Invalid amount")
        }
        else{
            balance+=x
            println("Amount deposited successfully and the current balance is:$balance")
        }
    }
    override fun detuct(x:Int){
        if(x>balance){
            println("Amount not available")
        }
        else{
            balance-=x
            println("Amount detucted successfully and the current balance is:$balance")
        }
    }
    
}
fun main(){
    val bank=Bank1()
    println(bank.balance)
    println("Balance:${bank.get_balance()}")
    bank.add_amount(1000)
    bank.add_amount(500)
    bank.detect_amount(5000)
    bank.detect_amount(500)
    println("Balance:${bank.get_balance()}")
    val single=Single2()
    single.read()
    single.write()
    val single2=Single1()
    single2.read()
    val multi1=Multi_son()
    multi1.child()
    multi1.father()
    multi1.grandpa()
    val multi2=Multi_Father()
    multi2.father()
    multi2.grandpa()
    val multi3=Multi_Grandparent()
    multi3.grandpa()
    val son1=Hie_Son()
    son1.son()
    son1.mom()
    val daughter1=Hie_Daughter()
    daughter1.daughter()
    daughter1.mom()
    val prob=Problem()
    println(prob.add(5,3))
    println(prob.add(1,2,3))
    println(prob.add(5.5f,4.5f))
    val child=Child()
    child.read()
    val parent=Parent()
    parent.read()
    val save=Savings_Account()
    save.deposit(1000)
    save.deposit(500)
    save.detuct(200)
    save.get_balance()
    save.detuct(1200)
    println()
    println()
    println()
    val curr=CurrentAccout()
    curr.deposit(1000)
    curr.detuct(1500)
    curr.detuct(900)
}
