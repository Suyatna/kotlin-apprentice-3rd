package pet

import capable.Cageable
import capable.Feedable

class Bird: Feedable, Cageable {
    override fun cage() {
        println("Bird has been caged")
    }

    override fun clean() {
        println("Bird cage has been cleaned")
    }

    override fun feed() {
        println("Tweet! what happened!")
    }
}