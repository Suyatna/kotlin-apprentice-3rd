fun main() {
    val participants = arrayListOf(
        Robot("Extra-Terrestrial Neutralization Bot"),
        Robot("Generic Evasion Droid"),
        Robot("Self-Reliant War Management Device"),
        Robot("Advanced Nullification Android"),
        Robot("Rational Network Defense Droid"),
        Robot("Motorized Shepherd Cyborg"),
        Robot("Reactive Algorithm Entity"),
        Robot("Ultimate Safety Guard Gollum"),
        Robot("Nuclear Processor Machine"),
        Robot("Preliminary Space Navigation Machine")
    )
    println()

    /*
    Challenge 1

    Using the list of robot participants in the "Collections standard library" section,
    arrange a series of fights for the intermediate category of robots (i.e. their strength is around
    40-80 points) between four participants. For example, you have the following list of robots: A, B, C, D.
    Therefore, you start from two battles A-B and C-D. The last fight will be conducted between
    the winners of those first two fight. Note: if you use random initial strength, you may need to
    run the battle a few times to make sure you have enough intermediate participants.
     */

    val intermediateCategory = participants
        .filter { it.strength in 40..80 }
        .take(4)

    if (intermediateCategory.size < 4) throw java.lang.IllegalArgumentException("Invalid number of participants. Try again")

    Battlefield.beginBattle(intermediateCategory[0], intermediateCategory[1]) { firstFinalList ->
        firstFinalList.report("Passed to the final")

        Battlefield.beginBattle(intermediateCategory[2], intermediateCategory[3]) { secondFinalList ->
            secondFinalList.report("Passed to the final")

            Battlefield.beginBattle(firstFinalList, secondFinalList) { winner ->
                winner.report("Win!")
            }
        }
    }
    println()

    /*
    Challenge 2

    Write a function to evaluate the first N elements of the `Fibonacci sequence` using memorization.
    Each of the elements of the Fibonacci is equal to the sum of the two previous ones.
    Start from 1, 1, 2, 3, ...
     */

    getNElementsOfFibonacci(15).forEach {
        println(it)
    }
}

fun getNElementsOfFibonacci(n: Int): Sequence<Int> {
    val sequence = generateSequence(1 to 1) {
        it.second to it.first + it.second
    }.map { it.first }

    return sequence.take(n)
}