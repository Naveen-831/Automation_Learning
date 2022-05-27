package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollTheWebPageTest {
    //public static void main(String[] args) throws InterruptedException {

    @Test
    public void scrolling() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        // maximize the browser window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='text']")).sendKeys("9705578972");
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='password']")).sendKeys("naveen123");
        driver.findElement(By.xpath("//span[text()='Login']//following::button[@type='submit']")).submit();
        //type cast the wedriver object to javascriptexceutor interface
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //scroll down the page to 9 scrolls
        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(2000);
        }
        //scroll up the page to 9 scrolls
        for(int i=0; i<10; i++){
            js.executeScript("window.scrollBy(0,-1000)");
            Thread.sleep(2000);
        }
        //scroll to the specific web element in the page
        WebElement text = driver.findElement(By.xpath("//h2[text()='Flipkart Plus']"));
        // get the x and y coordinate locations of the element
        int x = text.getLocation().getX();
        int y = text.getLocation().getY();
        //scroll to the specific web element
        js.executeScript("window.scrollBy("+x+" , "+y+")");
        Thread.sleep(2000);
        driver.close();
    }
}
