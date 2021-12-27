class MovieList(val name: String, val titles: MutableList<String> = mutableListOf()) {
    fun print() {
        println("movie list: $name")
        titles.forEach {
            println(it)
        }
    }
}