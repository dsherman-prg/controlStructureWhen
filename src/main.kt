fun main() {
    // Initialize variables
    var number = 1
    var foreignString = "x"

    // Get user input
    println("Please enter a number from 1 to 10.")
    number = readLine()!!.toInt()

    // Set foreignString to answer based on user input
    when (number){
        1 -> foreignString = "ichi"
        2 -> foreignString = "ni"
        3 -> foreignString = "san"
        4 -> foreignString = "shi"
        5 -> foreignString = "go"
        6 -> foreignString = "roku"
        7 -> foreignString = "shichi"
        8 -> foreignString = "hachi"
        9 -> foreignString = "ku"
        10 -> foreignString = "juu"
        !in 1..10 -> foreignString = "unknown"
    }
    
    // Print the result out for the user
    println("The number $number in Japanese is $foreignString.")
}