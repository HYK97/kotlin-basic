package kotlin_basic_syntax.oop.extend

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int,
) {
    abstract fun move()
}