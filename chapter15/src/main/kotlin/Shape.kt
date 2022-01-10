open class Shape {
    constructor(size: Int) {
        // ...
    }

    constructor(size: Int, color: String) : this(size) {
        // ...
    }
}

class Circle : Shape {
    constructor(size: Int) : super(size) {
        // ...
    }

    constructor(size: Int, color: String) : super(size, color) {
        // ...
    }
}
