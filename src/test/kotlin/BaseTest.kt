import io.appium.java_client.MobileElement
import io.appium.java_client.ios.IOSDriver
import org.junit.After
import org.junit.Before
import org.openqa.selenium.WebDriverException
import java.net.URL
import java.util.concurrent.TimeUnit

open class BaseTest {
    private var driver: IOSDriver<MobileElement>? = null
    private var config = Config()

    fun getPieceFromButton(identifier: String): Piece? {
        val element = driver?.findElementByClassName(identifier)

        return when(element?.text) {
            "O" -> Piece.NOUGHT
            "X" -> Piece.CROSS
            else -> null
        }
    }

    @Before
    fun setUp() {
        val appiumUrl = "http://${config.appiumServerIP}:${config.appiumServerPort}/wd/hub"

        try {
            this.driver = IOSDriver(URL(appiumUrl), ProjectCapabilities.iOSBaseCapabilities())
        } catch (exception: WebDriverException) {
            print("Appium driver failed with exception '$exception'")
        }

        driver?.manage()?.timeouts()?.implicitlyWait(
            config.appiumImplicitTimeOut,
            TimeUnit.SECONDS
        )
    }
    @After
    fun tearDown() {
        println("CURRENT DRIVER: ${this.driver}")
        this.driver?.quit() ?: throw Exception("Unable to load web driver")
    }
}

class Config {
    val appiumServerIP = "0.0.0.0"
    val appiumServerPort = "4723"
    val appiumImplicitTimeOut: Long = 300
}

enum class Piece {
    NOUGHT, CROSS
}
