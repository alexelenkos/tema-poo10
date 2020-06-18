import processing.core.PApplet

class Canvas : PApplet() {
    val punct = Punct(50 to 50, this)
    val segOrizontal = SegOrizontal(25, 25 to 75, this)
    val segVertical = SegVertical(150, 25 to 75, this)
    val dreptunghi = Dreptunghi(Punct(50 to 200, this), 125, 75, this)

    val dreptunghi2 = dreptunghi + (20 to 20)
    val segVertical2 = segVertical + (50 to 0)

    override fun settings() {
        size(500, 500)
    }

    override fun draw() {
        line(250F, 0F, 250F, 500F)
        line(0F, 250F, 500F, 250F)
        punct.afiseaza()
        segOrizontal.afiseaza()
        segVertical.afiseaza()
        segVertical2.afiseaza()
        dreptunghi.afiseaza()
        dreptunghi2.afiseaza()
    }
}

fun main(args: Array<String>) {
    val processingArgs: Array<String> = arrayOf("Canvas")
    val canvas: Canvas = Canvas()
    PApplet.runSketch(processingArgs, canvas)
}