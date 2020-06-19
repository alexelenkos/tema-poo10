import processing.core.PApplet

class Punct(private val coordonate: Pair<Int, Int>,
            private val canvas: PApplet) : Figura() {

    override val tip: Int = 0

    override fun afiseaza() {
        val x = coordonate.first.toFloat()
        val y = coordonate.second.toFloat()
        canvas.point(x+250, 250-y)
    }

    override operator fun plus(v: Pair<Int, Int>): Punct {
        val x = coordonate.first
        val y = coordonate.second
        val dx = v.first
        val dy = v.second
        return Punct(x+dx to y+dy, canvas)
    }

    override operator fun times(v: Pair<Int, Int>): Punct {
        val x = coordonate.first
        val y = coordonate.second
        val dx = v.first
        val dy = v.second
        return Punct(x*dx to y*dy, canvas)
    }

    fun getCoordonate(): Pair<Int, Int> {
        return coordonate
    }
}