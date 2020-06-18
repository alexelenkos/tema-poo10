import processing.core.PApplet

class SegOrizontal(private val ordonata: Int,
                   private val abscise: Pair<Int, Int>,
                   private val canvas: PApplet) : Figura() {

    override val tip: Int = 1

    override fun afiseaza() {
        val x1 = abscise.first.toFloat()
        val x2 = abscise.second.toFloat()
        val y = ordonata.toFloat()
        canvas.line(x1+250, 250-y, x2+250, 250-y)
    }

    override operator fun plus(v: Pair<Int, Int>): SegOrizontal {
        val x1 = abscise.first
        val x2 = abscise.second
        val y = ordonata
        val dx = v.first
        val dy = v.second
        return SegOrizontal(y+dy, x1+dx to x2+dx, canvas)
    }

    override operator fun times(y: Pair<Int, Int>): SegOrizontal {
        TODO("Not yet implemented")
    }
}