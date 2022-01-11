sealed class Resource {
    class Success(data: String) : Resource()
    object Loading : Resource() // `sealed` subclass has no state and no overridden `equal()`
    class Error(error: String) : Resource()
}

// challenge 4

/*
The `Resource` type would be useful for the return type of
long-running call that runs in the background, such as a network call.
You would return `Loading` while the call is running, `Success` with `data`
if it succeeds, and `Error` with `error` if it does not.
 */
