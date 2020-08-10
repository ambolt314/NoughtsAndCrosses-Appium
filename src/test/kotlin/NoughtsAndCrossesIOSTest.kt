import org.junit.Test
import org.junit.Assert

class NoughtsAndCrossesIOSTest: BaseTest() {

    private val gamePage = GamePage()

    @Test
    fun testTapMiddleButton() {
        val piece = gamePage.tapButton(5)
        Assert.assertEquals(piece, Piece.NOUGHT)
    }

    @Test
    fun testTrivial() {
        val greeting = "hello world"
        Assert.assertEquals(greeting, "hello world")
    }

}




