package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutorMethodTest {
    //public static void main(String[] args) throws InterruptedException {

    @Test
    public void JsExecutor() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\HQQ053\\Desktop\\HTML Files\\textbox.html");
        // maximize the browser window
        driver.manage().window().maximize();
        //type cast the webdriver object to javascriptexceutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        //change the text of the text field
        js.executeScript("document.getElementById('t1').value='Hi'");
        //clear the text of the disabled text field
        js.executeScript("document.getElementById('t2').value=''");
        //change the text of the disabled text field
        js.executeScript("document.getElementById('t2').value='Qapitol'");
        Thread.sleep(2000);
        //change the disabled text field to button
        js.executeScript("document.getElementById('t2').type='button'");
        Thread.sleep(2000);
        driver.close();
    }
}
