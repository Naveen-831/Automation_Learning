package Pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CricbuzzHomepage extends Capabilities  {
    public static void main(String args[]) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = DesiredCapability();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementById("com.cricbuzz.android:id/tvLogin").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementByClassName("android.widget.ImageButton").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementById("com.cricbuzz.android:id/tab_more").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Browse Team']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='India']").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElementByXPath("//android.widget.ImageButton[@content-desc='Navigate up']").click();
        driver.findElementByClassName("android.widget.ImageButton").click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByClassName("android.widget.ImageButton").click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElementById("com.cricbuzz.android:id/tab_home").click();
    }
}
