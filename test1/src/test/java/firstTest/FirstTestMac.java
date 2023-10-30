package firstTest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstTestMac {
    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;

    @BeforeMethod
    void beforeMethod() throws MalformedURLException {

        capabilitiesap = new DesiredCapabilities();
        capabilitiesap.setCapability("platformName", "Android");
        capabilitiesap.setCapability("version","13");
        capabilitiesap.setCapability("deviceName","28161JEGR18946");
        capabilitiesap.setCapability("app", "/Users/korneevaleksandr/Downloads/app-release.apk");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesap);

    }

    @AfterMethod
    void afterMethod(){
        driver.quit();
    }

    @Test
    void firstTest() throws InterruptedException {
        Thread.sleep(5000);




    }
}

