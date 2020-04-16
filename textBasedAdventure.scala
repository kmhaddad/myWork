import io.StdIn._

println("Welcome survivor! You were lucky enough to survive the zombie apocalypse. Your mother is on the brink of infection.")
println("Your objective is to find the antibiotics. You have three locations to choose from:")
println(" - Hospital")
println(" - Grocery Store")
println(" - Police Station")
var location = readLine.toUpperCase
var answercheck:Boolean = false


while ((location != "HOSPITAL") && (location != "GROCERY STORE") && (location != "POLICE STATION")) {
  answercheck = false
  println("Error: Please choose one of the following locations")
  println(" - Hospital")
  println(" - Grocery Store")
  println(" - Police Station")
  location = readLine.toUpperCase
}

if (location == "HOSPITAL") {
  println("You walk into the front door and find two ways to go. You either enter the basement or head to the blood bank.")
  println("Which route do you want to take?")
  println(" - Blood Bank")
  println(" - Basement")
  var firstPath = readLine.toUpperCase
  var pathCheck1:Boolean = false
  while ((firstPath != "BLOOD BANK") && (firstPath != "BASEMENT")) {
    println("Your only options are:")
    println(" - Blood Bank")
    println(" - Basement")
    firstPath = readLine.toUpperCase
  }

  if (firstPath == "BLOOD BANK") {
    println("...")
    println("You walk into the room the first thing you see is a locked closet with the label BLOOD OF THE HEALTHY on it")
    println("But then in the corner of your eye you see a familiar face...it is your sister!")
    println("You are about to rush to her aid but then see blood around her...")
    println("You must choose a path now, ")
    println(" - Go to closet")
    println(" - Run to sister")

    var bloodBank = readLine.toUpperCase
    while ((bloodBank != "GO TO CLOSET") && (bloodBank != "RUN TO SISTER")) {
      println("These are your only options:")
      println(" - Go to closet")
      println(" - Run to sister")
      bloodBank = readLine.toUpperCase
    }

    if (bloodBank == "GO TO CLOSET") {
      println ("...")
      println("You run to the closet to find that it is locked and need a key, you didn't think this through.")
      println("While you are trying to pry open the closet you get bit in the neck by your sister, she was infected.")
      println("You were too niave and didn't pay attention to detail, you slowly start to turn and your life flashes before your eyes.")
      println("Please restart.")
    }

    if (bloodBank == "RUN TO SISTER") {
      println("...")
      println("You run to your sister to find she is actually infected and is in the process of turning.")
      println("You are faced with two options here.")
      println("You either kill your sister and survive to find the cure.")
      println("Or you are fed up with looking to help your mom and just want to give up and die with your sister.")
      println("Choose wisely, either enter")
      println(" - Kill sister")
      println(" - End it all")
    }

    var runSister = readLine.toUpperCase
    while ((runSister != "KILL SISTER") && (runSister != "END IT ALL")) {
      println("These are your only options:")
      println(" - Kill Sister")
      println(" - End it all")
      runSister = readLine.toUpperCase
    }

    if (runSister == "KILL SISTER") {
      println("...")
      println("You kill your sister and are horrified with what you did.")
      println("You are faced with two options here.")
      println("You must continue the search and keep looking but you are scared you don't know how long this will take")
      println("Or you run back to your mother and just give up and end her life to save yours.")
      println("Choose wisely, either enter")
      println(" - Keep Looking and die")
      println(" - Run back home")
    }

    if (runSister == "END IT ALL") {
      println("...")
      println("You look your sister in her eyes...")
      println("You take out your knife...")
      println("You cut off her head and are horried with your actions")
      println("You take the knife to your throat and pray to see your sister and mom in the afterlife. ")
    }

    var killSister = readLine.toUpperCase
    while ((killSister != "RUN BACK HOME") && (killSister != "KEEP LOOKING AND DIE")) {
      println("These are your only options:")
      println(" - Run back home")
      println(" - Keep looking and die")
      killSister = readLine.toUpperCase
    }


    if (killSister == "RUN BACK HOME") {
      println("...")
      println("You run back home and find your mother already turned.")
      println("Your search was unsuccessful, and have to now kill your mother")
      println("Congratulations, you murdered your own mother and sister")
      println("You must now live with these burden choices")
    }

    if (killSister == "KEEP LOOKING AND DIE") {
      println("...")
      println("You are starting to grow tired")
      println("You know you choose wrong and can not deal with your bad choices")
      println("You end up ending your own life tired of making all these wrong choices")
    }

  }


  if (firstPath == "BASEMENT") {
    println("...")
    println("You walk into the room the first thing you see is a box labeled ANTIBIOTICS")
    println("But then in the corner of your eye you a garage with a door entering it")
    println("You know your objective is to find those antibiotics but your curiosty also spikes your intrest")
    println("You must choose a path now, ")
    println(" - Get antibiotics")
    println(" - Go to garage")
  }

  var basement = readLine.toUpperCase
  while ((basement != "GET ANTIBIOTICS") && (basement != "GO TO GARAGE")) {
    println("These are your only options:")
    println(" - Get antibiotics")
    println(" - Go to garage")
    basement = readLine.toUpperCase
}

if (basement == "GET ANTIBIOTICS") {
  println("...")
  println("You open the box and pray to find what you are looking for...")
  println("It's the correct antibiotics!")
  println("Congratulations, you have found the antibiotics! You run back to your mother just in time.")
  println("You both live for another day.")
}

if (basement == "GO TO GARAGE") {
  println("...")
  println("You open the door for the garage and find something very surprising...")
  println("There is a car with supplies and weapons that can last you at tops 2 months.")
  println("You are stuck with a very difficult decisons,")
  println("Do you,")
  println(" - Take car and run")
  println(" - Stay with mom")
}

var carOrstay = readLine.toUpperCase
while ((carOrstay != "TAKE CAR AND RUN") && (carOrstay != "STAY WITH MOM")) {
  println("These are your only options:")
  println(" - Take car and run")
  println(" - Stay with mom")
  carOrstay = readLine.toUpperCase
}

if (carOrstay == "TAKE CAR AND RUN"){
  println("...")
  println("You find the keys and start the engine")
  println("Something you forgot about is when you started the engine it made a loud noise")
  println("Zombies started to rush from everywhere and manage to get in the car before you can even shift it to drive")
  println("You end up dying,")
  println("Please restart")
}

if (carOrstay == "STAY WITH MOM") {
  println("...")
  println("You make it back home dissapointed to not find the cure")
  println("Your mother has turned and your only option is to kill her")
  println("Unfortunelty you did not find the cure, please restart")
}

if (location == "POLICE STATION") {
  println("You find two other police officers who are trying to remain safe. They allow you to grab a weapon.")
  println("Which weapon do you want to take?")
  println(" - Baton")
  println(" - Handgun")
  println(" - Rifle")
  var policeWeapon = readLine.toUpperCase
  var weaponcheck:Boolean = false
  while ((policeWeapon != "BATON") && (policeWeapon != "HANDGUN") && (policeWeapon != "RIFLE")) {
    println("Your only options are:")
    println(" - Baton")
    println(" - Handgun")
    println(" - Rifle")
    policeWeapon = readLine.toUpperCase
  }
  policeWeapon = policeWeapon.toLowerCase
  println(s"One officer tells you the $policeWeapon was a good pick.")
  println("You thank the officers and continue searching for the desired antibiotics.")
  println(" ")
  println("...")
  println(" ")
  println("You find a medical center within the building, but an infected medic is guarding it.")
  println("What option do you want to do?")
  println(" - Fight")
  println(" - Avoid")
  var policeDecision = readLine.toUpperCase
  while ((policeDecision != "FIGHT") && (policeDecision != "AVOID")) {
    println("These are your only options:")
    println(" - Fight")
    println(" - Avoid")
    policeDecision = readLine.toUpperCase
  }
  if (policeDecision == "FIGHT") {
    println("You slayed the zombie! You grow weary.")
    println("You go inside the medical center and find a bag that says UNTESTED CURE WITH 50% SUCCESS RATE.")
  }
  if (policeDecision == "AVOID") {
    println("You open a window and hop into the medical center.")
    println("You do not have much time to search, so you grab a bag that says UNTESTED CURE WITH 25% SUCCESS RATE.")
  }
  println("You run back to your house to find your mother.")
  println(" ")
  println(" ... ")
  println(" ")
  println("You open your door only to find your mother completely infected. You took too long!")
  println("Do you fight or run from your mom?")
  println(" - Fight")
  println(" - Run")
  var policeDecision2 = readLine.toUpperCase
  while ((policeDecision2 != "FIGHT") && (policeDecision2 != "RUN")) {
    println("You can only fight or run!")
    println(" - Fight")
    println(" - Run")
  }
  println(" ")
  println(" ... ")
  println(" ")
  if (policeDecision2 == "FIGHT") {
    println("You try to kill your mom, but she is too strong!")
    println("You died.")
    println("Why did you think killing your mom was smart?")
  }
  if (policeDecision2 == "RUN") {
    println("You try and run from your mom, but she is too fast!")
    println("You died.")
    println("Why did you think running from your mom was smart?")
  }
}
}
