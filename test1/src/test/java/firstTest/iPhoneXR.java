package firstTest;

import io.appium.java_client.*;
import io.appium.java_client.touch.offset.PointOption;
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

public class iPhoneXR {
    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;


    @BeforeMethod
    void beforeMethod() throws MalformedURLException {

        capabilitiesap = new DesiredCapabilities();
        capabilitiesap.setCapability("platformName", "iOS");
        capabilitiesap.setCapability("version", "15.3.1");
        capabilitiesap.setCapability("deviceName", "iPhone Kornej");
        capabilitiesap.setCapability("udid", "00008020-000A38580A69002E");
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
        Thread.sleep(5000);

        driver.findElement(new AppiumBy.ByAccessibilityId("ProfileTabScreen, tab, 5 of 5")).click();
        Thread.sleep(2000);












//
////тап на "создать пост"
//        driver.findElement(new AppiumBy.ByAccessibilityId("CreativityTab, tab, 3 of 5")).click();
//        Thread.sleep(200000);
//
////тап на "открыть камеру"
//        driver.findElement(new By.ByXPath("//XCUIElementTypeOther[@name=\"00:13 00:13 00:19 01:01 00:01 00:07 00:05 00:04 01:16 00:10 00:32 00:21 00:15 00:46 00:05 00:05 00:09 00:06\"]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[1]")).click();
//        Thread.sleep(10000);
//
////тап на "создать фото"
//        driver.findElement(new By.ByXPath("(//XCUIElementTypeOther[@name=\"9x16 1x1 4x5 16x9 9x16 1x1 4x5 16x9 Недавние 00:13 00:13 00:19 01:01 00:01 00:07 00:05 00:04 01:16 00:10 00:32 00:21 00:15 00:46 00:05 00:05 00:09 00:06 Горизонтальная полоса прокрутки, 1 страница Вертикальная полоса прокрутки, 12 страниц 00:13 00:13 00:19 01:01 00:01 00:07 00:05 00:04 01:16 00:10 Горизонтальная полоса прокрутки, 1 страница Вертикальная полоса прокрутки, 8 страниц Горизонтальная полоса прокрутки, 2 страницы Вертикальная полоса прокрутки, 2 страницы ПОСТ СТОРИС Продолжить Новый пост\"])[5]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]")).click();
//        Thread.sleep(2000);
//
////тап на "далее"
//        driver.findElement(new AppiumBy.ByAccessibilityId("Далее") ).click();
//        Thread.sleep(10000);



//  scrollDown
        WebElement ele01 = driver.findElement(new AppiumBy.ByAccessibilityId("LOOKY"));

        int centerX = ele01.getRect().x + (ele01.getSize().width/2);

        double startY = ele01.getRect().y + (ele01.getSize().height * 0.9);

        double endY = ele01.getRect().y + (ele01.getSize().height * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");

        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerX,(int)startY));

        swipe.addAction(finger.createPointerDown(0));

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),centerX,(int) endY));

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

/*
        //  scrollDown
        WebElement ele01 = driver.findElement(By.id("android:id/content"));
        int centerX = ele01.getRect().x + (ele01.getSize().width/2);
        double startY = ele01.getRect().y + (ele01.getSize().height * 0.9);
        double endY = ele01.getRect().y + (ele01.getSize().height * 0.1);
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerX,(int)startY));
        swipe.addAction(finger.createPointerDown(0));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),centerX,(int) endY));
        swipe.addAction(finger.createPointerUp(0));
        driver.perform(Arrays.asList(swipe));

        Thread.sleep(2000);



*/


    }
}