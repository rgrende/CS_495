//Kotlin Console Program:
//This program is simple and sort but demonstrates how a Kotlin console-based program operates.
//I used the "Random" import in various parts of my code.
//The bot will choose phrases and facts randomly each time the code is executed.

//Imports for Kotlin
import kotlin.random.Random


//main function
fun main(args: Array<String>) {
    //set of possible responses that the user is allowed to enter. Contents of the following
    //lists cannot be changed.
    val responses = setOf(
        "yes",
        "Yes",
        "yEs",
        "y",
        "Y",
        "Sure",
        "sure",
        "yeah",
        "yea"
    )
    //list of exit phrases
    val exits = listOf(
        "You had your chance!",
        "Have it your way! - Burger King",
        "You miss 100% of the shots you don't take...",
    )
    //list of random facts
    val factList = listOf(
        "The King of Hearts is the only king in a deck of cards without a mustache.",
        "It's possible to turn peanut butter into diamonds.",
        "Alaska is the only state whose name is on one row on a keyboard.",
        "Dr. Seuss invented the word 'nerd.'",
        "The first Nerf ball package claimed the toy 'can't hurt babies or old people.'",
        "There are around 16 million people alive today that are direct descendants of Genghis Khan.",
        "Most car horns are in the key of F.",
        "No number from one to 999 includes the letter “a” in its word form.",
        "A snail can sleep for three years.",
        "No word in the English language rhymes with month.",
        "A snail can sleep for more than three years at a time.",
        "Sony’s first product was the electrical rice cooker.",
        "The Japanese word 'Kuchi zamishi' is the act of eating when you are not hungry because your mouth is lonely.",
    )
    //list of responses that the user receives upon exiting the code.
    val responseList = listOf(
        "Please redeem fact coins to receive more facts. Adios!",
        "Sorry. Facts don't grow on trees!",
    )
    println("Hello World.")
    print("What are you called? ")
    val name = readLine()
    println("Hello $name, I'm Fun-Fact Frank.")
    println("I am a bot that spews random facts about nothing.")
    print("Would you like to know a useless fact? (Press -1 to be done) ")
    val enteredString = readLine()
    if (enteredString in responses) {
        val index: Int = Random.nextInt(factList.size)
        println(factList.get(index))
        println("Another fact? Due to a random fact shortage, I can only spew one more fact. ")
        val another = readLine()
        if (another in responses) {
            val index: Int = Random.nextInt(factList.size)
            println(factList.get(index))
            val response: Int = Random.nextInt(responseList.size)
            println(responseList.get(response))
        }
    }
    if (enteredString == "-1") {
        print("Goodbye.")
    }
    if (enteredString !in responses) {
        val exit: Int = Random.nextInt(exits.size)
        println(exits.get(exit))
    }
}

