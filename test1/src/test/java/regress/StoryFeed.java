package regress;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.options.UiAutomator2Options;


import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.time.Duration;
import java.util.Random;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class StoryFeed {

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
    public void a_StoryFeed() throws InterruptedException, MalformedURLException {

        // Просмотр историй

        driver.closeApp();
        driver.launchApp();

        Thread.sleep(5000);



    }
}
