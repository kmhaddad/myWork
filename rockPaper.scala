import io.StdIn._
//Rock Paper Scissors
//Kris Haddad
var repeat:Boolean = true
while (repeat) {
  println("Welcome to rock, paper, scissors. The game is simple, you will select either rock, paper, or scissors and so will your opponent. Scissors beat paper, paper beats rock, and rock beats scissors. If it is a tie then you will go again until someone wins.")

  var answercheck:Boolean = false
  println("Please choose one of them:")
  println("Rock")
  println("Paper")
  println("Scissors")
  var answer = readLine.toUpperCase
  while (!answercheck) {


  if (answer == "ROCK") {
    answercheck = true
    }
  else if (answer == "PAPER") {
      answercheck = true
    }
  else if (answer == "SCISSORS") {
    answercheck = true
    }
  else {
    println("That answer is not one of these three options, please try again.")
    println("Rock")
    println("Paper")
    println("Scissors")
    answer = readLine.toUpperCase
    }
  }
  import scala.util.Random

  // will generate a random number from 0 to 2
  var randomNumber: Int = new Random().nextInt(3)
  var computeranswer = ""
  if (randomNumber == 0) {
    computeranswer = "ROCK"
  }
  else if (randomNumber == 1) {
    computeranswer = "PAPER"
  }
  else {
    computeranswer = "SCISSORS"
  }

  println(s"You chose: $answer")
  println(s"The computer chose: $computeranswer")

  if (answer == computeranswer) {
    println("There was a tie, try again!")
  }

  else if (((answer == "ROCK") && (computeranswer == "SCISSORS")) || ((answer == "PAPER") && (computeranswer == "ROCK")) || ((answer == "SCISSORS") && (computeranswer == "PAPER"))) {
    println("You have won, good job!")
    repeat = false
  }
  else {
    println("The computer won, sorry:/")
    repeat = false
  }

}
