package person

import `interface`.PersonWithName

class Classmate(
    override val firstName: String,
    override val lastName: String
) : PersonWithName