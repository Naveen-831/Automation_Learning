package Selenium;

import com.google.common.io.Files;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotOfPageTest {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='text']")).sendKeys("9705578972");
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='password']")).sendKeys("naveen123");
        driver.findElement(By.xpath("//span[text()='Login']//following::button[@type='submit']")).click();
        Thread.sleep(2000);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File("./screenshot/Flipkart.png");
        Files.copy(srcFile,destFile);
        driver.close();
    }
}
