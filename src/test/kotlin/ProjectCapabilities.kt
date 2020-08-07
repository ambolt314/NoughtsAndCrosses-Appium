import org.openqa.selenium.remote.DesiredCapabilities

class ProjectCapabilities {

    companion object {
        fun IOSBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("autoAcceptAlerts", true)
            caps.setCapability("platform", "iOS")
            caps.setCapability("automationName", "UiAutomator2")
            caps.setCapability("deviceName", "iPhone 5")
            caps.setCapability("udid", "DNPJR9G6DTWD")
            caps.setCapability("appPackage", "Coderus.NoughtsAndCrosses") //find app package




            return caps
        }
    }
}