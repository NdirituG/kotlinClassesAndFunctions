fun main(args: Array<String>) {
   class Dice{
       var sides = 6

       fun roll(): Int{
           val randomNumber = (1..sides).random()
           return randomNumber
       }
   }

    val myFirstDice = Dice()
    println(myFirstDice.sides)
    val diceRoll = myFirstDice.roll()
    println("Your ${myFirstDice.sides} dice rolled $diceRoll!")

    myFirstDice.sides = 20
    println("Your ${myFirstDice.sides} sides dice rolled ${myFirstDice.roll()}")

}