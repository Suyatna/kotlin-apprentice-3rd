package pet

import capable.Feedable
import capable.Tankable

class Fish: Feedable, Tankable {
    override fun tank() {
        println("Fish has been tanked")
    }

    override fun clean() {
        println("Fish tank has been cleaned")
    }

    override fun feed() {
        println("Fish goes blob")
    }
}