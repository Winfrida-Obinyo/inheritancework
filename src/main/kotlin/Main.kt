fun main(){
    var car = Car("Limousin","I100","black",9)
    car.carry(11)
    car.identity()
    var result = car.calculateParkingFees(12)
    println(result)

    var bus = BUS("Mazda","demio","red",25)
    var  money= bus.maxTripFare(130.10)
    println(money)
    var winnie = bus.calculateParkingFees(8)
    println(winnie)

}
open class Car(var make:String, var model:String, var color: String,var capacity:Int){

    fun carry(people:Int){
        var x = (people-capacity)
        if(people<=capacity){
            println("Carrying $people passengers")
    }
    else if (people>capacity){
        println("over capacity by $x people")
        }

    }
    fun identity(){
        println("I am a $color $make $model")


    }
   open fun calculateParkingFees(hours:Int): Int{
        var Calculate = hours * 20
        return(Calculate)

    }


}
class BUS(make: String, model: String,color: String,capacity: Int): Car(make,model,color,capacity){
    fun maxTripFare(fare: Double):Double{
        var fare= capacity * fare
        return fare

    }
    override fun calculateParkingFees(hours: Int):Int{
        var parking = hours * capacity
        return parking
    }


    }



