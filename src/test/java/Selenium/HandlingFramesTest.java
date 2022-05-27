package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingFramesTest {
    //public static void main(String[] args) throws InterruptedException {

    @Test
    public void frames() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\HQQ053\\Desktop\\HTML Files\\page2.html");
        // maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //get the locator of the inside frame text field
        WebElement textField = driver.findElement(By.id("f1"));
        Thread.sleep(2000);
        //navigate to the inside frame using index as argument
        driver.switchTo().frame(0);
        //enter text to the inside frame text field
        driver.findElement(By.id("t1")).sendKeys("Hello");
        Thread.sleep(2000);
        //navigate to the parent frame
        driver.switchTo().parentFrame();
        //enter text to the parent frame text field
        driver.findElement(By.id("t2")).sendKeys("Naveen");
        Thread.sleep(2000);
        //clear the entered text in the parent frame text field
        driver.findElement(By.id("t2")).clear();
        //navigate to the inside frame using id as argument
        driver.switchTo().frame("f1");
        //enter text to the inside frame text field
        driver.findElement(By.id("t1")).sendKeys("Hi");
        Thread.sleep(2000);
        //navigate to the main frame using default content method
        driver.switchTo().defaultContent();
        //enter text to the main frame text field
        driver.findElement(By.id("t2")).sendKeys("Qapitol");
        Thread.sleep(2000);
        //navigate to the inside frame using web element
        driver.switchTo().frame(textField);
        //clear the text in the inside frame text field
        driver.findElement(By.id("t1")).clear();
        Thread.sleep(2000);
        driver.close();
    }
}
