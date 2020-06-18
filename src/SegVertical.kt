import processing.core.PApplet

class SegVertical (private val abscisa: Int,
                   private val ordonate: Pair<Int, Int>,
                   private val canvas: PApplet) : Figura() {

    override val tip: Int = 2

    override fun afiseaza() {
        val x = abscisa.toFloat()
        val y1 = ordonate.first.toFloat()
        val y2 = ordonate.second.toFloat()
        canvas.line(x+250, 250-y1, x + 250, 250-y2)
    }

    override operator fun plus(v: Pair<Int, Int>): SegVertical {
        val x = abscisa
        val y1 = ordonate.first
        val y2 = ordonate.second
        val dx = v.first
        val dy = v.second
        return SegVertical(x+dx, y1+dy to y2+dy, canvas)
    }

    override operator fun times(y: Pair<Int, Int>): SegVertical {
        TODO("Not yet implemented")
    }
}