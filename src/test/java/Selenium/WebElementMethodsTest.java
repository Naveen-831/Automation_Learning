package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        //manage the window size
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='text']")).sendKeys("9705578972");
        Thread.sleep(2000);
        //clear the data entered on the mobile number field
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='text']")).clear();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='text']")).sendKeys("9705578972");
        driver.findElement(By.xpath("//span[text()='Login']//following::input[@type='password']")).sendKeys("naveen123");
        driver.findElement(By.xpath("//span[text()='Login']//following::button[@type='submit']")).submit();
        Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.xpath("//input[@type='text']"));
        //get the placeholder attribute value of search field
        String getAttributeValue = searchField.getAttribute("placeholder");
        System.out.println("placeholder attribute values of search field: "+getAttributeValue);
        //get the css font-family value of the search field
        String getCssValue = searchField.getCssValue("font-family");
        System.out.println("CSS values of search field: "+getCssValue);
        //get the location x co-ordinates of the search field
        int getXCoordinate = searchField.getLocation().getX();
        System.out.println("X coordinate location of search field: "+getXCoordinate);
        //get the rectangular dimensions of the search field
        int getYAxiesUsingRect = searchField.getRect().getY();
        System.out.println("Y coordinate location of search field: "+getYAxiesUsingRect);
        //get the height of the search field
        int getSize = searchField.getSize().getHeight();
        System.out.println("Height of search field: "+getSize);
        //get the tag name of the search field
        String tagName = searchField.getTagName();
        System.out.println("Tag name of search field: "+tagName);
        //get the text present in the search field element
        String getText = searchField.getText();
        System.out.println("Search field text is: "+getText);
        //returns true if the element is displayed
        System.out.println(searchField.isDisplayed());
        ////returns true if the element is enabled
        System.out.println(searchField.isEnabled());
        //returns true if the element is selected
        System.out.println(searchField.isSelected());
        driver.close();
    }
}
