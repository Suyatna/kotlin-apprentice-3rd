package pet

import capable.Feedable
import capable.Walkable

class Cat: Feedable, Walkable {
    override fun feed() {
        println("Yummy.. meow")
    }

    override fun walk() {
        println("Walk the cat")
    }
}