fun main() {
    val contact = Contact("Grace Murray", "grace@navy.mil")

    val name = contact.fullName
    val email = contact.emailAddress

    contact.fullName = "Grace Hopper"
    val grace = contact.fullName
}