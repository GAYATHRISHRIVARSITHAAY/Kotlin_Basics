fun main(){
    //basics
    println("Hello World")
    print("Hello ")
    print(" I'm ")
    print(" Gayathri")
    println();
    var i=0;
    println("i value:$i")
    i=1;
    println("i value:$i")
    val j=0;
    println("j value:$j")
    val name:String="Gayathri"
    var age:Int=21
    println("Name:$name and age:$age")
    println(name[0])
    println(name[1])
    println(name[2])
    println(name[3])
    println(name[4])
    println(name[5])
    println(name[6])
    println(name[7])
    //operations
    var x=10
    var y=20
    println(x+y)
    println(x-y)
    println(x*y)
    println(x/y)
    println(x%y)
    println(x==y)
    //if else
    if(x>y){
        println("x is greater")
    }
    else if(y>x){
        println("y is greater")
    }
    else{
        println("both are equal")
    }
    var time=18
    var greetings=if(time<12) "Good morning" else if(time<=18) "Good evening" else "Good night"
    println(greetings)
    //when
    when(x){
        1,3,5,7,9->println("odd number")
        2,4,6,8,10,0->println("even number")
    }
    var n=1
    when(n){
        1->println("One")
        2->println("Two")
        3->println("Three")
        4->println("Four")
        5->println("Five")
        6->println("Six")
        7->println("Seven")
        8->println("Eight")
        9->println("Nine")
        else->println("Ten")
    }
    when(x){
        in 1..5->println("in first 5")
        in 2..10->println("in second 5")
        else->println("not present in first 10")
    }
    //while loop
    i=0
    while(i<=5){
        println(i)
        i++
    }
    //do while loop
    i=0
    do{
        println(i)
        i++
    }
    while(i<=5)
    //break
    i=0
    while(i<=5){
        if(i==4){
            break
        }
        println(i)
        i++
    }
    //continue
    i=0
    while(i<5){
        if(i==4){
            i++;
            continue
        }
        println(i)
        i++
    }
    //for loop
    //forward increment
    println("For loop")
    for(i in 1..5){
        println(i)
    }
    //backward
    for(i in 10 downTo 1){
        println(i)
    }
    //increment 2 steps
    for(i in 1..10 step 2){
        println(i)
    }
    //nested for loop
    for(i in 1..5){
        for(k in 1..i){
            print(k)
        }
        println()
    }
    //arrays
    var numbers=arrayOf("One","Two","Three")
    println(numbers[0])
    println(numbers.size)
    numbers[0]="Zero"
    for(num in numbers){
        println(num)
    }
    numbers[0]="One"
    if("One" in numbers)
    {
        println("One is present in the array")
    }
    else{
        println("One is not presentin the array")
    }
    //ranges
    for(chars in 'a'..'z'){
        println(chars)
    }
    //functions
    without_parameter_and_without_return_value()
    with_parameter_and_without_return_value(5)
    with_parameter_and_without_return_value_multiple_parameter(5,6)
    var a=without_parameter_and_with_return_value()
    println(a)
    a=with_parameter_and_with_return_value(2,4)
    println(a)
    a=shorter_function(2,4)
    println(a)
    //default parameters
    greet("Gayathri")
    greet()
}
fun greet(x:String="Guest")
{
    println("Hello $x")
}
fun without_parameter_and_without_return_value(){
    println("without_parameter_and_without_return_value working!")
}
fun with_parameter_and_without_return_value(x:Int){
    if(x%2!=0){
        println("Odd number")
    }
    else{
        println("Even number")
    }
}
fun with_parameter_and_without_return_value_multiple_parameter(x:Int,y:Int){
    var u=x+y
    println("Add $u")
    u=y-x
    println("Sub $u")
}
fun without_parameter_and_with_return_value():Int{
    return 1+2+3+4+5
}
fun with_parameter_and_with_return_value(x:Int,y:Int):Int{
    return x+y
}
fun shorter_function(x:Int,y:Int)=x+y