package firstTest;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class FirstTestDeviceIOS {
    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;


    @BeforeMethod
    void beforeMethod() throws MalformedURLException {

        capabilitiesap = new DesiredCapabilities();
        capabilitiesap.setCapability("platformName", "IOS");
        capabilitiesap.setCapability("version","15.3.1");
        capabilitiesap.setCapability("deviceName","iPhone Kornej");
        capabilitiesap.setCapability("udid", "00008020-000A38580A69002E");
        capabilitiesap.setCapability("bundleId", "com.looky");
        capabilitiesap.setCapability("automationName", "XCUITest");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesap);

    }


    @AfterMethod
    void afterMethod(){
        driver.quit();
    }


    //   test create post

    @Test
    void firstTest() throws InterruptedException{
        Thread.sleep(1000);
        driver.findElement(new By.ByXPath("//XCUIElementTypeButton[@name=\"CreativityTab, tab, 3 of 5\"]")).click();



        Thread.sleep(10000);

    }
}