package firstTest;


import io.appium.java_client.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class TestImporn {


    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;
    private Object addAction;


    @BeforeMethod
    void beforeMethod() throws MalformedURLException {

        capabilitiesap = new DesiredCapabilities();
        capabilitiesap.setCapability("platformName", "Android");
        capabilitiesap.setCapability("version", "13 TKQ1.220829.002");
        capabilitiesap.setCapability("deviceName", "a010c185");
        capabilitiesap.setCapability("noReset", "true");
        capabilitiesap.setCapability("appPackage", "com.looky.app");
        capabilitiesap.setCapability("appActivity", "com.looky.app.MainActivity");
        capabilitiesap.setCapability("automationName", "UIAutomator2");

        driver = new AppiumDriver(new URL("http://localhost:4723/"), capabilitiesap);

    }


    @AfterMethod
    void afterMethod() {

        driver.quit();
    }

    @Test
    void CheckErrorEveryHourXiaomi() throws InterruptedException, MalformedURLException {


        CheckErrorEveryHourXiaomi leshaLox = new CheckErrorEveryHourXiaomi();




    }




}
