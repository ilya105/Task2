package gmail.ilya105.basics

open class animals(val name: String, val age: Int, val breed: String?, val color: String?){
    fun sleep(){

    }
    fun agechecker() = age > 20

}


class Dogs(name: String, age: Int, breed: String?) : animals(name,age,breed,color = null){
    init {

    }
        fun bark() = println("$name barks")
}

class Cats(name: String ="fdgg", age: Int =4,color: String = "white and black") : animals(name,age,breed = null,color){

        fun scratch() = println("$name scratches")





}

fun printanimals(animalslist: List<animals>){



    for (animals in animalslist) {
        if (animals is Dogs) {
            println("${animals.name}, ${animals.age} ${animals.breed} ")
        }else if (animals is Cats){
            println("${animals.name}, ${animals.age} ${animals.color}")
        }

    }


}

fun main(){
    val dog1 =Dogs("ic",7,"Alaskan Husky")
    val cat1 = Cats("karlos",5,"white")
    val poppy = Dogs("budy", 21,"german shepherd")
    val luna = Cats("luna",2,"Black")
    val buck = Dogs("buck",23,"St,Bernard")

    /*i don't know how to reference list of Dogs and Cats the error is
     "classifier does not have a companion need to initialize it here"*/

    val animalslist = arrayListOf<animals>(poppy,luna)
    printanimals(animalslist)

}
