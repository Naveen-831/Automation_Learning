package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BrowserlaunchTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='text']")).sendKeys("9705578972");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='password']")).sendKeys("naveen123");
        driver.findElement(By.xpath("//span[text()='Login']//following::button[@type='submit']")).submit();
        driver.close();
    }
}
