class PrivilegeUser(
    username: String,
    id: String,
    age: Int
) : User(username, id, age) {
    private val privileges = mutableListOf<Privilege>()

    fun addPrivilege(privilege: Privilege) {
        privileges.add(privilege)
    }

    fun hasPrivilege(id: Int): Boolean {
        return privileges.map { it.id }.contains(id)
    }

    fun about(): String {
        // return "$username. $id" // error: id is private
        return "$username, $age" // ok: age is protected
    }
}