import io.StdIn._

//Header Comment
//Kris Haddad
//This program is a small charcter selection for the game Dungeons and Dragons. You can create a powerful charcter to your like hood.

//Below are all the inputs the user puts in for the character
println ("Please type a name for your character")

var name = readLine

println ("Now please select a class for your character. Examples include Fighter, Rogue, Wizard")

var className = readLine

println ("Now please select a background for your character. Examples include Mercenary, Thief, Scholar")

var back = readLine

println ("What level would you like your charcacter to be. Levels must be in between 1-20")

var level = readInt

println ("Now please type in for ability level. Must be between (1-18). Order goes strength, dexterity, Intelligence")

var str = readInt

var dex = readInt

var int = readInt

println ("BEGIN CHARACTER SHEET")
//below are all the formuals needed to calculate the correct ability mods
var strMo = ((str/2) - 5) //camelcase
var dexMo = ((dex/2) - 5)
var proBo = (1 + math.ceil(level/4.0).toInt)
var intMo = ((int/2) - 5)

//this is for fighter
var fHit = (level * (10 + strMo))
var fArmor = (15 + math.min(dexMo, 2)) //min out of 2
var fSword = (proBo + strMo)
var fBow = (proBo + dexMo)
//this is for rogue
var rHit = (level * (8 + strMo))
var rArmor = (13 + dexMo)
var rDagger = (proBo + dexMo)
var rCrossbow = (proBo + dexMo)
//this is for wizard
var wHit = (level * (6 + strMo))
var wArmor = (10 + dexMo)
var wStaff = (proBo + strMo)
var wMagic = (proBo + intMo)
//these are for mercenary
var mAthletics = (proBo + strMo)
var mPerception = (proBo + intMo)
//these are for thief
var tStealth = (proBo + dexMo)
var tDeception = (proBo + intMo)
//these are for scholar
var sArcana = (proBo + intMo)
var sInves = (proBo + intMo)

println (name + ", " + "Level " + level + " " + className)
//below is the correct formatting of each charcter printed out with the correct formulas in place
if (className == "Fighter") {
  println (s"Hit Points: $fHit")
  println ("Armor Class: " + fArmor)
  println (f"Proficiency Bonus: $proBo%+2.0f")
  println ("Ability Scores:")
  print ("  Str " + str)
  println (" " + f"($strMo%+2.0f" + ")")
  print ("  Dex " + dex)
  println (" " + f"($dexMo%+2.0f" + ")")
  print ("  Int " + int)
  println (" " + f"($intMo%+2.0f" + ")")
  println ("Attacks:")
  println (f"   Sword: $fSword%+2.0f")
  println (f"   Bow: $fBow%+2.0f")
}


if (className == "Rogue") {
  println (s"Hit Points: $rHit")
  println ("Armor Class: " + rArmor)
  println (f"Proficiency Bonus: $proBo%+2.0f")
  println ("Ability Scores:")
  print ("  Str " + str)
  println (" " + f"($strMo%+2.0f" + ")")
  print ("  Dex " + dex)
  println (" " + f"($dexMo%+2.0f" + ")")
  print ("  Int " + int)
  println (" " + f"($intMo%+2.0f" + ")")
  println ("Attacks:")
  println (f"   Dagger: $rDagger%+2.0f")
  println (f"   Crossbow: $rCrossbow%+2.0f")
}

if (className == "Wizard") {
  println (s"Hit Points: $wHit")
  println ("Armor Class: " + wArmor)
  println (f"Proficiency Bonus: $proBo%+2.0f")
  println ("Ability Scores:")
  print ("  Str " + str)
  println (" " + f"($strMo%+2.0f" + ")")
  print ("  Dex " + dex)
  println (" " + f"($dexMo%+2.0f" + ")")
  print ("  Int " + int)
  println (" " + f"($intMo%+2.0f" + ")")
  println ("Attacks:")
  println (f"   Staff: $wStaff%+2.0f")
  println (f"   Magic Missile: $wMagic%+2.0f")
}

if (back == "Mercenary") {
  println ("Skills: ")
  println (f"   Athletics: $mAthletics%+2.0f")
  println (f"   Perception: $mPerception%+2.0f")
}

if (back == "Thief") {
  println ("Skills: ")
  println (f"   Stealth: $tStealth%+2.0f")
  println (f"   Deception: $tDeception%+2.0f")
}

if (back == "Scholar") {
  println ("Skills: ")
  println (f"   Arcana: $sArcana%+2.0f")
  println (f"   Investigation: $sInves%+2.0f")
}

println ("END CHARACTER SHEET")
