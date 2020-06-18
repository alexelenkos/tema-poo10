abstract class Figura {
    abstract val tip: Int

    abstract fun afiseaza()

    abstract operator fun plus(y: Pair<Int, Int>): Figura

    abstract operator fun times(y: Pair<Int, Int>): Figura
}