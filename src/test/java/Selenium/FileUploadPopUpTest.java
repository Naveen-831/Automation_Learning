package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadPopUpTest {
    //public static void main(String[] args) throws InterruptedException, AWTException {
    @Test
    public void upload() throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://imgbb.com");
        // maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // file path passed as parameter to StringSelection
        StringSelection s = new StringSelection("C:\\Users\\HQQ053\\Documents\\504 error.png");
        // copy file path to the clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
        driver.findElement(By.xpath("//a[text()='Start uploading']")).click();
        Thread.sleep(2000);
        // Robot object creation
        Robot r = new Robot();
        // pressing clt
        r.keyPress(KeyEvent.VK_CONTROL);
        //pressing v
        r.keyPress(KeyEvent.VK_V);
        //releasing clt
        r.keyRelease(KeyEvent.VK_CONTROL);
        //releasing v
        r.keyRelease(KeyEvent.VK_V);
        //pressing enter
        r.keyPress(KeyEvent.VK_ENTER);
        //releasing enter
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Upload']")).click();
        Thread.sleep(2000);
        driver.close();
    }
}
