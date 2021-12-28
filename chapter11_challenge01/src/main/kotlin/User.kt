class User(val movieList: MutableMap<String, MovieList> = mutableMapOf()) {
    fun addList(list: MovieList) {
        movieList[list.name] = list
    }
}