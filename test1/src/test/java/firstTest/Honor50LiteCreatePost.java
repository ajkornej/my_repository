package firstTest;


import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Point;
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

public class Honor50LiteCreatePost {
    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;
    private Object addAction;


    @BeforeMethod
    void beforeMethod() throws MalformedURLException {

        capabilitiesap = new DesiredCapabilities();
        capabilitiesap.setCapability("platformName", "Android");
        capabilitiesap.setCapability("version", "11");
        capabilitiesap.setCapability("deviceName", "A4LYUT2107002740");
        capabilitiesap.setCapability("appPackage", "com.looky.app");
        capabilitiesap.setCapability("appActivity", "com.looky.app.MainActivity");
        capabilitiesap.setCapability("noReset", "true");
        capabilitiesap.setCapability("automationName","UIAutomator2");

        driver = new AppiumDriver(new URL("http://localhost:4723/"), capabilitiesap);

    }


    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
        void LongPress () throws InterruptedException {

        WebElement ele01 = driver.findElement(By.id("android:id/content"));

        TouchAction action = new TouchAction((PerformsTouchActions) driver);
        action.longPress((PointOption) ele01).release().perform();










    }
}




//    void Scroll () throws InterruptedException {
//        Thread.sleep(10000);
//
////  scrollDown
//        WebElement ele01 = driver.findElement(By.id("android:id/content"));
//
//        int centerX = ele01.getRect().x + (ele01.getSize().width/2);
//
//        double startY = ele01.getRect().y + (ele01.getSize().height * 0.9);
//
//        double endY = ele01.getRect().y + (ele01.getSize().height * 0.1);
//
//        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");
//
//        Sequence swipe = new Sequence(finger, 1);
//
//        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0),PointerInput.Origin.viewport(),centerX,(int)startY));
//
//        swipe.addAction(finger.createPointerDown(0));
//
//        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),centerX,(int) endY));
//
//        swipe.addAction(finger.createPointerUp(0));
//
//        driver.perform(Arrays.asList(swipe));
//
//        driver.perform(Arrays.asList(swipe));
//
//        driver.perform(Arrays.asList(swipe));
//
//        driver.perform(Arrays.asList(swipe));
//
//        driver.perform(Arrays.asList(swipe));
//
//        driver.perform(Arrays.asList(swipe));
//
//        Thread.sleep(1000);
//
//
//
//    }
//
//}




/*

//тап на "создать пост"
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]")).click();
                Thread.sleep(5000);

//тап на "открыть камеру"
                driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.HorizontalScrollView/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
                Thread.sleep(3000);

//тап на "сделать фото"
                driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup[3]")).click();
                Thread.sleep(3000);

//тап на "далее"
                driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
                Thread.sleep(2000);

//тап на "поделиться"
                driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
                Thread.sleep(10000);

*/
