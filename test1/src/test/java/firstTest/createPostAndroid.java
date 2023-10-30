package firstTest;

import io.appium.java_client.*;
//import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.input.model.TouchPoint;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.time.Duration;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

public class createPostAndroid {
    private DesiredCapabilities capabilitiesap;
    private AppiumDriver driver;


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
    void photo() throws InterruptedException {
        Thread.sleep(5000);

//      создание поста c основной камеры c описанием, локацией, ссылкой, хештогом и меншеном.

//      тапаем на иконку создания
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[2]/android.view.View/android.view.View[3]")).click();
        Thread.sleep(2000);

// выбираем создание поста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]")).click();
        Thread.sleep(2000);


//      тапаем на кнопку камеры
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view." +
                "ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
        Thread.sleep(2000);

//      тапаем на иконку смены камеры
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android." +
                "view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view." +
                "ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2000);

//      тапаем на кнопку создания фото
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")).click();
        Thread.sleep(3000);

//      тапаем на галочку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget." +
                "FrameLayout/android.widget.RelativeLayout/android.widget." +
                "LinearLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(3000);

//      вводим описание поста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup[3]/android.widget.EditText")).sendKeys("тестовое описание к посту");
        Thread.sleep(2000);

//      выбираем категории поста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android." +
                "view.ViewGroup[1]/android.widget.TextView")).click();

//      тапаем на кнопку создания ссылки
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.V" +
                "iewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[7]/android.widget.TextView")).click();
        Thread.sleep(1000);

//      вводим ссылку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.widget.EditText")).sendKeys("www.google.com");

//      вводим title
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.widget.EditText[2]")).sendKeys("testlink");

//      жмем save
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]")).click();
        Thread.sleep(1000);

//      жмем add location
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[9]/android.widget.TextView")).click();
        Thread.sleep(1000);

//      вводим локацию
        driver.findElement(new By.ByXPath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
                "widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.widget.EditText")).sendKeys("цум");
        Thread.sleep(1000);

//      выбираем вариант
        driver.findElement(new By.ByXPath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget." +
                "ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")).click();
        Thread.sleep(3000);

//      жмем post
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(10000);
//
////      вводим хештег и меншен в описание
//        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
//                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
//                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android." +
//                "view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
//                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
//                "view.ViewGroup/android.view." +
//                "ViewGroup[3]/android.widget.EditText")).sendKeys("#testingAppium \n @grossmer");
//        Thread.sleep(1000);
//
////      тапаем на меншен из списка
//        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android." +
//                "widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android." +
//                "widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
//                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android." +
//                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
//                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget." +
//                "HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
//        Thread.sleep(2000);
//
//





//      проверка
//      открываем my profile
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view." +
                "View[5]/android.view.ViewGroup[2]/android.view.ViewGroup")).click();
        Thread.sleep(2000);

//      закрываем меню с подсказкой (если она есть)
        WebElement helpprofile = driver.findElement(new By.ByXPath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget." +
                "FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget." +
                "ScrollView/android.view.ViewGroup/android.view." +
                "ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[8]"));

            try {
            if ((helpprofile).isDisplayed()){
                helpprofile.click();
            } else {
                System.out.println("подсказка в моем профиле не найдена");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

//      открываем последний созданный пост
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android." +
                "widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget." +
                "FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android." +
                "view.ViewGroup/android.view.ViewGroup[3]")).click();

//      проверяем наличие у поста ссылки
        WebElement link = driver.findElement(new By.ByXPath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android." +
                "widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"));
        try {
            if ((link).isDisplayed()){
                System.out.println("ccылка отображается");
            }else {
                System.out.println("ошибка ссылки");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

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

//  проверяем наличие у поста категории
        WebElement category = driver.findElement(new By.ByXPath("/hierarchy/android." +
                "widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android." +
                "widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view." +
                "ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android." +
                "widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget." +
                "ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget." +
                "HorizontalScrollView/android.view.ViewGroup"));
        try {
            if ((category).isDisplayed()){
                System.out.println("категория отображается");
            }else {
                System.out.println("ошибка категории");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

//  проверяем наличие у поста описания
        WebElement description = driver.findElement(new By.ByXPath("/hierarchy/android.widget." +
                "FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android." +
                "view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android." +
                "view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));

        try {
            if ((description).isDisplayed()){
                System.out.println("описание отображается");
            }else {
                System.out.println("ошибка описания");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
        Thread.sleep(1000);


    }



    @Test
    void photo1() throws InterruptedException {
        Thread.sleep(5000);


//      создание поста с фото на фронтальную камеру

//      тапаем на иконку создания
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]")).click();
        Thread.sleep(2000);


//      выбираем создание поста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]")).click();
        Thread.sleep(2000);

//      тапаем на кнопку камеры
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
        Thread.sleep(2000);

//      тапаем на иконку смены камеры
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[9]/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(1000);

//      тапаем на кнопку создания фото
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")).click();
        Thread.sleep(2000);

//      тапаем на галочку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(4000);


//      жмем post
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(10000);
    }








    @Test
    void photo2() throws InterruptedException {

        // cоздание поста с несколькими фото

        Thread.sleep(1000);



//      тапаем на иконку создания
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]")).click();
        Thread.sleep(5000);


// выбираем создание поста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]")).click();
        Thread.sleep(50000);


//      тапаем на иконку мультиселекста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]")).click();
        Thread.sleep(1000);

//      выбираем 2-ую фотку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]")).click();
        Thread.sleep(1000);

//      выбирем 3-ю фотку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[2]")).click();
        Thread.sleep(1000);

//      тапаем на кнопку далее
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(1000);


//      тапаем на кнопку далее
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(1000);


//      жмем post
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(10000);
        Thread.sleep(5000);
    }







    @Test
    void photo3 () throws InterruptedException {

        // cоздание поста с фото c камеры с редактированим в imgli

        Thread.sleep(1000);


//      тапаем на иконку создания
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget." +
                "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
                "FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view." +
                "ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]")).click();
        Thread.sleep(5000);


// выбираем создание поста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]")).click();
        Thread.sleep(50000);


//      тапаем на кнопку камеры
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup")).click();
        Thread.sleep(2000);

//      тапаем на кнопку создания фото
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]")).click();
        Thread.sleep(2000);

//      тапаем на кнопку transform
        driver.findElement(new By.ByXPath("//android.widget.RelativeLayout[@content-desc=\"Transform\"]/android.widget.LinearLayout/android.widget.ImageView")).click();
        Thread.sleep(2000);

//      тапаем по 9*16
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.view.View")).click();
        Thread.sleep(2000);

//      тапаем на галочку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(3000);

//      тапаем на галочку 2 раз
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(3000);

//      жмем post
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(10000);
        Thread.sleep(5000);

    }







    @Test
    void photo4 () throws InterruptedException {

        // cоздание поста с добавлением хештега и меншена

        Thread.sleep(3000);

//      тапаем на иконку создания
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[3]")).click();
        Thread.sleep(5000);


// выбираем создание поста
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup[1]")).click();
        Thread.sleep(50000);



//      тапаем на кнопку далее
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(1000);

//      тапаем на галочку
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(3000);

//      тапаем на галочку 2 раз
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(3000);

//      вводим хештег и меншен в описание
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText")).sendKeys("#testingAppium \n @grossmer");
        Thread.sleep(1000);

//      тапаем на меншен из списка
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")).click();
        Thread.sleep(1000);


//      жмем post
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.widget.TextView")).click();
        Thread.sleep(10000);
        Thread.sleep(5000);
    }
}
