package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAlertPopUpTest {
    //public static void main(String[] args) throws InterruptedException {

    @Test
    public void alertPopUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        // maximize the browser window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Naveen");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.dismiss();
        driver.close();
    }
}
