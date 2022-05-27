package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class GoogleSearchAutoSuggestionsTest {
    //public static void main(String[] args) throws InterruptedException {
    @Test
    public void AutoSuggestions() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // maximize the browser window
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
        Thread.sleep(2000);
        List<WebElement> autoSuggestions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
        int count = autoSuggestions.size();
        System.out.println("Total number of auto suggestions in dropdown list are" + count);
        String ExpectedValue = "selenium webdriver";
        for (WebElement suggestions : autoSuggestions){
            String text = suggestions.getText();
            System.out.println(text);
        }
        for (WebElement suggestion : autoSuggestions){
            String text = suggestion.getText();
            if (text.equalsIgnoreCase(ExpectedValue)){
                suggestion.click();
                break;
            }
        }
        driver.close();
    }
    @Test
    public void UploadPopUp() throws InterruptedException {
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
