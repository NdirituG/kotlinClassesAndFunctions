fun main(args: Array<String>) {
   class Dice(val numSides: Int){

       fun roll(): Int{
           val randomNumber = (1..numSides).random()
           return randomNumber
       }
   }

    val myFirstDice = Dice(6)
    println(myFirstDice.numSides)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.numSides} dice rolled $diceRoll!")


}