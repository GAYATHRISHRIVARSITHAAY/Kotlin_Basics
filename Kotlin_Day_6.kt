fun main(){
    //scope functions
    //let-performs only if the value is not null and "it" is used as representation of the object
    val name:String?="Gayathri"
    name?.let{
        println(it.length)
        println(it)
        println(it.uppercase())
    }
    //run-works like let but uses "this"
    var per=Person1("Gayathri",21)
    var result=per.run{
        age=age+1
        age
    }
    println(result)
    //apply-used to modify
    var person=Person1("Gayathri",21).apply{
        //name="Shri"
        age=22
    }
    println(person)
    //map
    val map=mutableMapOf(1 to "Apple",2 to "Banana")
    println(map)
    map[3]="Orange"
    map.remove(2)
    println(map)
    map[2]="Banana"
    println(map)
    println(map.keys)
    println(map.values)
    for(entry in map){
        println(entry.value)
        println(entry.key)
    }
    println(map.size)
    map.clear()
    println(map)
    map[1]="Apple"
    map[2]="Banana"
    map[3]="Orange"
    if(map.containsValue("Orange"))
    {
        println("Map contains orange")
    }
    if(map.containsKey(5))
    {
        println("Contains 5")
    }
    else{
        println("Not contains 5")
    }
    //arithmeticexception
    //nullpointerexception
    //arrayindexoutofboundexception
    //numberformatexception
    //ioexception
    //try as an expception
    try{
        val res=10/0
    }
    catch(e:ArithmeticException){
        println("Divide by zero error")
    }
    //multiple catches
    try{
        val arr=arrayOf(1,2,3)
        println(arr[5])
    }
    catch(e:ArithmeticException){
        println("ArithmeticException")
    }
    catch(e:ArrayIndexOutOfBoundsException){
        println("ArrayIndexOutOfBoundException")
    }
    catch(e:Exception){
        println("Some error occured")
    }
    //finally
    try{
        println(10/0)
    }
    catch(e:Exception){
        println("Error occured")
    }
    finally{
        println("This will print for sure")
    }
    //try as an expression
    val res=try{10/0}catch(e:Exception){
        0
    }
    //data classes
    println(res)
    val p=Person("Gayathri",21)
    println(p)
    val p1=p.copy(name="Shri")
    println(p1)
    println(p==p1)
    val(name1,age1)=p
    println(name1)
    println(age1)
    //throw keyword
    var age=12
    if(age<18){
     throw IllegalArgumentException("Below Age limit")  
    }
}
class Person1(var name:String,var age:Int)
data class Person(val name:String,val age:Int)
