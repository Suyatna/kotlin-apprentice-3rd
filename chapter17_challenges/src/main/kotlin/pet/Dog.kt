package pet

import capable.Feedable
import capable.Walkable

class Dog: Feedable, Walkable {
    override fun feed() {
        println("Woof.. thanks!")
    }

    override fun walk() {
        println("Walk the dog")
    }
}