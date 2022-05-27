package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WndowHandleMethodTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        // manage the browser window size using manage method
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='✕']")).click();
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);
        driver.close();
    }
}
