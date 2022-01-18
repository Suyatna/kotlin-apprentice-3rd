package person

import `interface`.PersonWithName

class Relative(
    override val firstName: String,
    override val lastName: String,
    val relationship: String
) : PersonWithName