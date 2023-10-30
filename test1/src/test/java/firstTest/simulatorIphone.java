package firstTest;

import io.appium.java_client.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

public class simulatorIphone {

    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;

    @BeforeMethod
    void beforeMethod() throws MalformedURLException {

        capabilitiesap = new DesiredCapabilities();
        capabilitiesap.setCapability("platformName", "iOS");
        capabilitiesap.setCapability("version", "16.1");
        capabilitiesap.setCapability("deviceName", "iPhone 11");
        capabilitiesap.setCapability("udid", "1D3151B0-53EC-4539-910F-594D3CCE4DBB");
        capabilitiesap.setCapability("bundleId", "com.looky");
        capabilitiesap.setCapability("automationName", "XCUITest");

        driver = new AppiumDriver(new URL("http://localhost:4723/"), capabilitiesap);

    }


    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    void PostPhoto1() throws InterruptedException {
        Thread.sleep(10000);

//  scrollDown
        WebElement ele01 = driver.findElement(new AppiumBy.ByAccessibilityId("LOOKY"));

        int centerX = ele01.getRect().x + (ele01.getSize().width / 2);

        double startY = ele01.getRect().y + (ele01.getSize().height * 0.9);

        double endY = ele01.getRect().y + (ele01.getSize().height * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int) startY));

        swipe.addAction(finger.createPointerDown(0));

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int) endY));

        swipe.addAction(finger.createPointerUp(0));

// сам свайп вниз

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));

        driver.perform(Arrays.asList(swipe));


        Thread.sleep(10000);


    }
}
