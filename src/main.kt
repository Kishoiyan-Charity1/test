fun main() {
    var name= "codeHive"
    var newName= name[5].toString() + name[6] +name[7]
    println(newName)

    Numbers( 9, 4)
    greeting( "ann", 21)
    last( "today")


}
fun Numbers(x: Int, y:Int) {
    var z= x%y
    println(z)
}
fun greeting(name:String, age:Int) {
    var hello= "hi, my is  $name, and i am $age old "
    println(hello)

}
fun last(name:String) {
    println(name.length)

}