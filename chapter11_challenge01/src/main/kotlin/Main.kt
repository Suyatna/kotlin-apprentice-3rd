fun main() {
    // challenge 1: movie lists
    // give Jane and John "action" list
    val jane = User()
    val john = User()
    val actionList = MovieList(name = "action")

    jane.addList(actionList)
    john.addList(actionList)

    // add Jane's favorite
    jane.movieList["action"]?.titles?.add("rambo")
    jane.movieList["action"]?.titles?.add("terminator")

    // add John's favorite
    john.movieList["action"]?.titles?.add("die hard")

    // see John's list:
    john.movieList["action"]?.print()
    println()

    // see Jane's list:
    jane.movieList["action"]?.print()
}