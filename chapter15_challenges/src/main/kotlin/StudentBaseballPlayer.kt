class StudentBaseballPlayer(
    firstName: String,
    lastName: String,
    val position: String,
    val number: String,
    val battingAthlete: Double
) : StudentAthlete(firstName, lastName) {
    /*
    Benefits:
    - Automatically get properties all student athletes will have - grades and names
    - Type relationship with superclasses. StudentBaseballPlayer _is_ a Student
    - Baseball players have same rules of eligibility
    */

    /*
    Drawbacks:
    - Primary constructor is getting bloated
    - `sports` is a bit awkward to a baseball player object
    - Deep class hierarchy would make similar classes difficult.
      For instance, an almost identical class would need to be made for a
      `SoftballPlayer` who joined a league after graduating.
      They would no longer be a `Student`, only a `Person`!
    */
}