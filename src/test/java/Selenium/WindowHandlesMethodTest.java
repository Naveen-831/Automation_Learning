package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlesMethodTest {
    //public static void main(String[] args) throws InterruptedException {

    @Test
    public void windowHandle() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apptim.com/");

        // manage the browser window size using manage method
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()='SIGN IN']")).click();

        //get the total number of windows opened in the browser
        Set<String> allWindowHandles = driver.getWindowHandles();
        int count = allWindowHandles.size();
        System.out.println("Total no.of windows are:"+count);

        //navigate to every window and get the title and window handle id of the window
        for(String windowHandle:allWindowHandles){
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();
            System.out.println("Window handle id of page" + title + "is" + windowHandle);
            driver.close();
        }
    }
}
