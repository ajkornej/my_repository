package firstTest;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.appmanagement.AndroidTerminateApplicationOptions;
//import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;



import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.sql.DriverManager;
import java.time.Duration;
import java.util.Arrays;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static org.openqa.selenium.interactions.PointerInput.Kind.TOUCH;
import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;
import static org.openqa.selenium.interactions.PointerInput.Origin.viewport;


public class FirstTestDeviceAndroid {
    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;
//    UiAutomator2Options options = null;





    @BeforeMethod
    void beforeMethod() throws MalformedURLException {

        capabilitiesap = new DesiredCapabilities();
        capabilitiesap.setCapability("platformName", "Android");
        capabilitiesap.setCapability("version", "13");
        capabilitiesap.setCapability("deviceName", "28161JEGR18946");
        capabilitiesap.setCapability("appPackage", "com.looky.app");
        capabilitiesap.setCapability("appActivity", "com.oneclick.looky_dev.MainActivity");
        capabilitiesap.setCapability("noReset", "true");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilitiesap);

    }


    @AfterMethod
    void afterMethod() {
        driver.quit();
    }

    @Test
    void firstTest() throws InterruptedException {
        Thread.sleep(2000);

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


        Thread.sleep(10000);


        // longtap




    }

// long tap
    @Test
    void story5() throws InterruptedException {



        Thread.sleep(2000);




        // открываем my profile
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view." +
                "View[5]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
        Thread.sleep(2000);



        WebElement ele01 = driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.widget.ImageView"));
        Point sourse = ele01.getLocation();



        doTap(driver, sourse, 10000);

        Thread.sleep(10000);



    }


    public final static PointerInput FINGER = new PointerInput(TOUCH, "finger");

    public static void doTap(AppiumDriver driver, Point point, int duration) {
        Sequence tap = new Sequence(FINGER, 1)
                .addAction(FINGER.createPointerMove(ofMillis(0), viewport(), point.getX(), point.getY()))
                .addAction(FINGER.createPointerDown(LEFT.asArg()))
                .addAction(new Pause(FINGER, ofMillis(duration)))
                .addAction(FINGER.createPointerUp(LEFT.asArg()));
        driver.perform(Arrays.asList(tap));





    }

}




//driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(100000)"));

