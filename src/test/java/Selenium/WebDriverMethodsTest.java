package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodsTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        // manage the browser window size using manage method
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//button[text()='✕']")).click();

        //get the title of the page and print in the console in upper case
        String pageTitle = driver.getTitle().toUpperCase();
        System.out.println("Title of the page in uppercase is:" + pageTitle);

        //get the page source and print in the console
        String pageSource = driver.getPageSource();
        System.out.println("Source code of current page:" + pageSource);

        //get the current url of the page and print in the console
        String currentPageURL = driver.getCurrentUrl();
        System.out.println("URL of the current page:" + currentPageURL);

        //browser navigation method
        driver.navigate().to("https://udaan.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.close();
    }
}
