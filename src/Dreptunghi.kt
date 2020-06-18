import processing.core.PApplet

class Dreptunghi (private val punct: Punct,
                  private val lungime: Int,
                  private val inaltime: Int,
                  private val canvas: PApplet) : Figura() {

    override val tip: Int = 3

    override fun afiseaza() {
        val x = punct.getCoordonate().first.toFloat()
        val y = punct.getCoordonate().second.toFloat()
        val width = lungime.toFloat()
        val height = inaltime.toFloat()

        canvas.rect(x+250, 250-y, width, height)
    }

    override operator fun plus(v: Pair<Int, Int>): Dreptunghi {
        val x = punct.getCoordonate().first
        val y = punct.getCoordonate().second
        val dx = v.first
        val dy = v.second
        return Dreptunghi(Punct(x+dx to y+dy, canvas), lungime, inaltime, canvas)
    }

    override operator fun times(y: Pair<Int, Int>): Dreptunghi {
        TODO("Not yet implemented")
    }
}