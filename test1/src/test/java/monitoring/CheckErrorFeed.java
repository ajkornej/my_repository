package monitoring;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;


import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class CheckErrorFeed {

    private AndroidDriver driver;
    private Object addAction;

    @Before
    public void beforeMethod() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("a010c185")
                .setAppPackage("com.looky.app")
                .setAppActivity("com.looky.app.MainActivity")
                .setNoReset(true);

        driver = new AndroidDriver(new URL("http://localhost:4723/"), options.setAppPackage("com.looky.app"));

    }

    @After
    public void afterMethod() {

        driver.quit();
    }

    @Test
    public void a_PostFeed() throws InterruptedException, MalformedURLException {

        // Просмотр историй

        driver.closeApp();
        driver.launchApp();

        Thread.sleep(10000);

        // Закрыть шторку с программой лояльности
        if (!driver.findElements(new By.ByXPath("//*[contains(@text, 'Программа лояльности от LOOKY!')]"))
                .isEmpty()){
            driver.findElement(new By.ByXPath("//*[contains(@text, 'Сторис')]"))
                    .click();
            Thread.sleep(1000);
        }

        if (!driver.findElements(new By.ByXPath("//*[contains(@text, 'Создавай бесплатно контент в нашей нейросети')]"))
                .isEmpty()){
            driver.findElement(new By.ByXPath("//*[contains(@text, 'Обработать фото')]"))
                    .click();
            Thread.sleep(1000);
        }

        if (!driver.findElements(new By.ByXPath("//*[contains(@text, 'Подписывайся на интересных людей')]"))
                .isEmpty()){
            driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup"))
                    .click();
            Thread.sleep(1000);
        }

        if (driver.findElements(new By.ByXPath("//*[contains(@text, 'LOOKY_official')]"))
                .isEmpty()){
            driver.findElement(new By.ByXPath(""))
                    .click();
            Thread.sleep(1000);
        }
    }
}
