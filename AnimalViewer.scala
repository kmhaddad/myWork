import scala.io.StdIn._

def getAnimalAsciiArt(animalName: String): String = {
  animalName match {
    case "dog" => "  .-\"-.\n /|6 6|\\\n{/(_0_)\\}\n _/ ^ \\_\n(/ /^\\ \\)-\'\n \"\"\' \'\"\""
    case "fish" => "      /\\\n    _/./\n ,-\'    `-:..-\'/\n: o )      _  (\n `-....,--; `-.\\\n    `\'"
    case "cat" => "   |\\---/|\n   | ,_, |\n    \\_`_/-..----.\n ___/ `   \' ,\"\"+ \\\n(__...\'   __\\    |`.___.\';\n  (_,...\'(_,.`__)/\'.....+"
  }
}

var keepLooping = true
while (keepLooping) {
  println("Hello! Which animal would you like to see?")
  val animal = readLine
  println(getAnimalAsciiArt(animal))
  println("Would you like to see another animal? Enter in 'yes' to repeat, or anything else to quit.")
  val shouldRepeat = readLine
  if (shouldRepeat != "yes") {
    var keepLooping = false
  }
}
