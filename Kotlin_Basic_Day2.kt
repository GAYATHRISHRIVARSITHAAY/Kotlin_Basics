fun main(){
    //any(used to store any data type in the variable)(.length cannot be used here)
    var v:Any=5
    println(v)
    if(v is Int){
        println("it is a integer")
    }
    v="Hello"
    println(v)
    if(v is String){
        println(v.length)
    }
    v='G'
    println(v)
    //null handling
    //nullable type
    var name:String?="Gayathri"
    println(name)
    name=null
    println(name)
    //safe calls
    println(name?.length)
    //elvis operator
    println(name?.length?:0)
    //not null assertion(if it is not null only it will not crash otherwise it will crash)
    name="Shri"
    println(name!!.length)
    //safe casting
    val value:Any="Gayathri"
    val number:Int?=value as? Int
    println("number:$number")
   //list in kotlin
   val list=mutableListOf(1,2,3,4)
   list.add(5)
   println(list)
   for(i in list){
       print("$i ")
   }
   println()
   println("Size of list is:${list.size}")
   list.remove(2)
   println(list)
   println(list[0])
   println(list.get(0))
   println(list.first())
   println(list.last())
   println(list.elementAt(0))
   println(list.isEmpty())
   println(list.isNotEmpty())
   println(list.sum())
   println(list.min())
   println(list.max())
   println(list.average())
   println(list.count())
   list.sorted()
   list.sortedDescending()
   println(list)
   list.sorted()
   list.add(1,2)
   println(list)
   //set in kotlin
   val set=mutableSetOf<Int>()
   set.add(1)
   set.add(2)
   set.add(3)
   set.add(1)
   set.add(3)
   println(set)
   for(o in set){
       println(o)
   }
   println(set.contains(2))
   println(set.isEmpty())
   println(set.isNotEmpty())
   println(set.size)
   println(set.count())
   println(set.max())
   println(set.min())
   println(set.sum())
   println(set.average())
}