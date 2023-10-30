package firstTest;

import io.appium.java_client.*;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import java.util.List;


public class Xiaomi11Lite {
    private DesiredCapabilities capabilitiesap;
    private AndroidDriver driver;
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

        driver = new AndroidDriver(new URL("http://localhost:4723/"), capabilitiesap);
        AppiumDriver driver;
    }


    @AfterMethod
    void afterMethod() {
        driver.quit();
    }


    @Test
    void LongPress() throws InterruptedException {
        Thread.sleep(5000);

        //переход в мой профиль в тап баре

        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[5]"))
                .click();
        Thread.sleep(2000);

        if (!driver.findElements(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[5]")).isEmpty()) {
            System.out.println("подсказка в моем профиле не найдена");
        } else {
            driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[5]"))
                    .click();
        }

        Thread.sleep(1000);





        WebElement firstPost = driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]"));

        int centerX = firstPost.getRect().x + (firstPost.getSize().width/2);

        double startY = firstPost.getRect().y + (firstPost.getSize().height * 0.9);

        double endY = firstPost.getRect().y + (firstPost.getSize().height * 0.1);

        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH,"finger");

        Sequence swipe = new Sequence(finger, 1);

        swipe.addAction(finger.createPointerMove(Duration.ofSeconds(4000),PointerInput.Origin.viewport(),centerX,(int)startY));

        swipe.addAction(finger.createPointerDown(0));

        swipe.addAction(finger.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),centerX,(int) endY));

        swipe.addAction(finger.createPointerUp(0));

        Thread.sleep(5000);

        // сам свайп вниз

        driver.perform(List.of(swipe));

        // Close the driver when done
        driver.quit();




        // long tap

        // Замените на ваш локатор элемента, на который нужно выполнить долгий тап

        WebElement element = driver.findElement(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView"));

        // Создать TouchAction для долгого тапа с указанием длительности
        TouchAction touchAction = new TouchAction(driver)
                .longPress(LongPressOptions.longPressOptions()
                        .withElement(ElementOption.element(element))
                        .withDuration(Duration.ofSeconds(2)) // Пример: долгий тап в течение 2 секунд
                );

        // Выполнить долгий тап
        touchAction.perform();

        Thread.sleep(5000);





        Thread.sleep(5000);


    }



}










//        WebElement HelpClose = driver.findElement(new By.ById("00000000-0000-003d-ffff-ffff00000396"));
//
//        try {
//            if ((HelpClose).isDisplayed()){
//                HelpClose.click();
//            } else {
//                System.out.println("подсказка в моем профиле не найдена");
//            }
//        }catch (Exception e) {
//            throw new RuntimeException(e);
//        }





// 00000000-0000-0021-ffff-ffff000001fa




//capabilitiesap.setCapability("appPackage", "com.looky.app");
//capabilitiesap.setCapability("appActivity", "com.looky.app.MainActivity");
//capabilitiesap.setCapability("noReset", "true");
