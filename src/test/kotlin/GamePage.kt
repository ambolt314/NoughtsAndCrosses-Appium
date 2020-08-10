//Page object pattern for the Noughts and Crosses game. Fetches the respective elements
class GamePage: BaseTest() {

    private var buttons: Array<String>? = null
    private lateinit var currentPlayerLabel: String
    private lateinit var playAgainLabel: String
    private lateinit var winnerLabel: String

    fun onLoad() {
        buttons = Array(4){i -> i.toString()} //TODO: populate array from app page
    }

    fun tapButton(buttonNumber: Int): Piece? {
        return if(buttonNumber in 0..8) {
            buttons?.get(buttonNumber + 1)?.let { getPieceFromButton(it) }
        }
        else return null
    }
}