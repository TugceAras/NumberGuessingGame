import kotlin.random.Random

fun main(){
    val targetNumber = Random.nextInt(0,101)
    var guessingNumber = 3

    println()
    println("*** WELCOME TO THE NUMBER GUESSING GAME ***")
    println()
    while(guessingNumber > 0){
        print("Enter your guess number: ")
        val userGuessNumber = readLine()?.toIntOrNull()

        if (userGuessNumber == null){
            println("Enter a number!")
            continue
        }
        if (userGuessNumber == targetNumber){
            println("Congratulations! You guessed the number correctly!")
            return
        }
        else if (userGuessNumber < targetNumber) println("Please enter larger number!")
        else println("Please enter smaller number!")

        guessingNumber--
        if (guessingNumber > 0) println("Your remaining guess is $guessingNumber")
        println("--------------------------------------")
    }

    println("Your guess is over. Correct number is $targetNumber")
}