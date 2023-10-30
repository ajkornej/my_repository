package monitoring;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckErrorActivity {


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
    public void ErrorActivity() throws InterruptedException, MalformedURLException {


        driver.closeApp();
        driver.launchApp();

        Thread.sleep(5000);

        // Переходим в Activity
        driver.findElement(new By.ByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[4]"))
                .click();
        Thread.sleep(5000);

        if (driver.findElements(new By.ByXPath("//*[contains(@text, 'LOOKY')]"))
                .isEmpty()){
            driver.findElement(new By.ByXPath(""))
                    .click();
        }
    }
}


