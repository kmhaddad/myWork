import scala.io.StdIn._

println("Welcome to the Triathlon Simulator!")
println("Two particpants will compete in this simulation.")
println("Please enter the first particpants name:")

val firstName1 = readLine

println("Please enter the first participant's swimming segment time in min.")

val numberSwim1 = readInt

println ("Please enter the first participant's biking segment time in min")

val numberBike1 = readInt

println("Please enter the first participant's running segment time in min")

val numberRun1 = readInt

println("Please enter the second participant's name:")

val firstName2 = readLine

println("Please enter the second participant's swimming segment time in min.")

val numberSwim2 = readInt

println ("Please enter the second participant's biking segment time in min")

val numberBike2 = readInt

println("Please enter the first participant's running segment time in min")

val numberRun2 = readInt

println ("Race is starting!")
println ("Participants:")
println ("1." + firstName1)
println ("2." + firstName2)
println ("Swimming segment has started!")
println("...")

println("Swimming segment has concluded!")
println (firstName1 + "'s" + "  " + "time" + " " + numberSwim1)

println (firstName2 + "'s" + " " + "time" + " " + numberSwim2)

if (numberSwim1 < numberSwim2) {
  println (firstName1 + " " + "had the fastest swimming segment time!")
}

if (numberSwim1 > numberSwim2) {
  println (firstName2 + " " + "had the fastest swimming segment time!")
}

println ("Biking segment has started")
println ("...")
println ("Biking segment has concluded!")

println (firstName1 + "'s" + " " + "time" + " " + numberBike1)

println (firstName2 + "'s" + " " + "time" + " " + numberBike2)

if (numberBike1 < numberBike2) {
  println (firstName1 + " " + "had the fastest biking segment time!")
}

if (numberBike1 > numberBike2) {
  println (firstName2 + " " + "had the fastest biking segment time!")
}

println ("Running segment has started")
println ("...")
println ("Running segment has concluded!")

println (firstName1 + "'s" + " " + "time" + " " + numberRun1)

println (firstName2 + "'s" + " " + "time" + " " + numberRun2)

if (numberRun1 < numberRun2) {
  println (firstName1 + " " + "had the fastest running segment time!")
}

if (numberRun1 > numberRun2) {
  println (firstName2 + " " + "had the fastest running segment time!")
}

val total1 = (numberSwim1 + numberBike1 + numberRun1)
val total2 = (numberSwim2 + numberBike2 + numberRun2)

println(firstName1 + "total race time:" + total1 + " " + "minutes")
println(firstName2 + "total race time:" + total2 + " " + "minutes")

if (total1 < total2) {
  println (firstName1 + "won the Triathlon!")
}

if (total1 > total2) {
  println (firstName2 + " " + "won the Triathlon!")
}

println("Goodbye!")
