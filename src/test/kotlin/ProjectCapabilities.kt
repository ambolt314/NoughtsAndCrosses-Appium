import org.openqa.selenium.remote.DesiredCapabilities

class ProjectCapabilities {

    companion object {
        fun iOSBaseCapabilities(): DesiredCapabilities {
            val caps = DesiredCapabilities()
            caps.setCapability("app", "Coderus.NoughtsAndCrosses")
            caps.setCapability("autoAcceptAlerts", true)
            caps.setCapability("platform", "iOS")
            caps.setCapability("platformVersion", "10.3.4")
            caps.setCapability("automationName", "XCUITest")
            caps.setCapability("deviceName", "iPhone 5")
            caps.setCapability("simpleIsVisibleCheck", true)
            caps.setCapability("udid", "abd84f5143e51ce5b3d6d00cd8ac8cf8033cc451")
            //caps.setCapability("appPackage", "Coderus.NoughtsAndCrosses") //find app package
            return caps
        }
    }
}