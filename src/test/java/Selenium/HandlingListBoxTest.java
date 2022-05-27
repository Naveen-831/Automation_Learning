package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingListBoxTest {
    //public static void main(String[] args) throws InterruptedException {

    @Test
    public void listBox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/HQQ053/Desktop/HTML%20Files/listbox.html");
        // maximize the browser window
        driver.manage().window().maximize();
        WebElement list = driver.findElement(By.id("sft"));
        Select s = new Select(list);
        List<WebElement> options = s.getOptions();
        int count = options.size();
        System.out.println("Total options in the dropdown list is:" + count);
        for (WebElement option : options){
            String optnText = option.getText();
            System.out.println(optnText);
        }
        Thread.sleep(2000);
        s.selectByIndex(0);
        Thread.sleep(2000);
        s.selectByValue("cp");
        Thread.sleep(2000);
        s.selectByVisibleText("Python");
        Thread.sleep(2000);
        List<WebElement> selectedOptions = s.getAllSelectedOptions();
        int size = selectedOptions.size();
        System.out.println("Total selected options in dropdown are:" + size);
        for (WebElement selected : selectedOptions){
            System.out.println(selected.getText());
        }
        boolean multiple = s.isMultiple();
        System.out.println(multiple);
        if (multiple){
            WebElement firstSelected = s.getFirstSelectedOption();
            System.out.println("First selected option is:" + firstSelected.getText());
            s.deselectByIndex(0);
            WebElement firstSelected1 = s.getFirstSelectedOption();
            System.out.println("First selected option is:" + firstSelected1.getText());
            s.deselectByValue("cp");
            WebElement firstSelected2 = s.getFirstSelectedOption();
            System.out.println("First selected option is:" + firstSelected2.getText());
            s.deselectByVisibleText("Python");
        }
        driver.close();
    }
}
