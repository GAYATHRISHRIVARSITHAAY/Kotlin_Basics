class Class_name{
    fun read(){
        println("Reading..")
    }
}
//primary constructor
class Class_name1(val name:String){
    fun greet(){
        println("Hello $name")
    }
}
//val and var in parameters
class Class_name2(val name:String, var age:Int)
{
    fun nextyear(){
        age++;
        println("$name age is $age")
    }
}
//giving a default value if the user didnt enter
class Application_form(val name:String="User",var age:Int=0)
{
    fun display(){
        println("The user name is $name and thier age is $age")
    }
}
//init block
class Intital_block(){
    init{
        println("Object created successfully")
    }
}
//init block with parameters
class Initial_block2(var name:String="User"){
    init{
        println("Hi $name")
    }
}
//init block with parameters and methods
class Initial_block3(var name:String="User",val age:Int)
{
  init{
      if(age<18){
        println("$name is not eligible to vote")   
      }
      else{
          println("$name is eligible to vote")
      }
  }
  fun greet(){
      println("Thanks for visiting!!")
  }
}
//secondary constructor basic
class Car{
    val brand:String
    var color:String
    var speed:Int
    constructor(brand:String,color:String,speed:Int){
        
        this.brand=brand
        this.color=color
        this.speed=speed
    }
    fun read(){
        println("The car $brand is in $color and goes in $speed km/hr")
    }
}
// more secondary constructor
class Car2{
    val brand:String
    var color:String
    var speed:Int
    constructor(brand:String,color:String,speed:Int)
    {
        this.brand=brand
        this.color=color
        this.speed=speed
    }
    constructor(brand:String,color:String){
        this.brand=brand
        this.color=color
        this.speed=65
    }
    constructor(brand:String)
    {
        this.brand=brand
        this.color="Pink"
        this.speed=10
    }
    fun read(){
        println("The car $brand is in $color and goes in $speed km/hr")
    }
}
//direct deligation in secondary constructor
class Direct(var brand:String,var speed:Int){
    init{
        println("Initi block is printing.. Car $brand running in the speed of $speed km/hr")
    }
    constructor(brand:String):this(brand,75){
        println("Constructor 1 is running")
    }
    constructor(speed:Int):this("Swift",speed){
        println("Constructor 2 is running")
    }
    fun info(){
        println("Brand:$brand, Speed:$speed")
    }
    
}
//indirect deligation in secondary Constructor
class Indirect(var brand:String,var speed:Int){
    init{
        println("Init block is printing.. the car is $brand it is running in the speed of $speed km/hr")
    }
    constructor(brand:String):this(brand,100){
        println("First constructor is printing..")
    }
    constructor():this("Ritz"){
        println("Second constructor is printing..")
    }
}
fun main(){
    val cla=Class_name()
    cla.read()
    val cla1=Class_name1("Gayathri")
    cla1.greet()
    println("The name is ${cla1.name}")
    val cla2=Class_name2("Shri",21)
    cla2.nextyear()
    val app=Application_form("Gayathri",21)
    app.display()
    val app1=Application_form(age=22)
    app1.display()
    val app2=Application_form("Shri")
    app2.display()
    val app3=Application_form()
    app3.display()
    val ini=Intital_block()
    val ini2=Initial_block2("Gayathri")
    val ini3=Initial_block2()
    val init4=Initial_block3("Gayathri",21)
    init4.greet()
    val init5=Initial_block3(age=17)
    init5.greet()
    val car=Car("Swift","Pink",65)
    car.read()
    val car2=Car2("Swift")
    car2.read()
    val car3=Car2("Ritz","blue")
    car3.read()
    val car4=Car2("Scorpio","Red",100)
    car4.read()
    val dir=Direct("Ritz",50)
    dir.info()
    val dir2=Direct("Scorpio")
    dir2.info()
    val dir3=Direct(40)
    dir3.info()
    val in1=Indirect()
    val in2=Indirect("Swift")
    
}