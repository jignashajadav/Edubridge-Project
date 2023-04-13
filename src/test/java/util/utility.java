package util;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



import testBase.WebTestBase;

public class utility extends WebTestBase {

	public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITLY_WAIT = 20;
    
    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void selectValue(WebElement element, String term, String value){
        Select dropDown = new Select(element);
        if(term.equalsIgnoreCase("byValue")){
            dropDown.selectByValue(value);
        }else if(term.equalsIgnoreCase("byIndex")){
            dropDown.selectByIndex(Integer.parseInt(value));
        }else if(term.equalsIgnoreCase("byVisibleText")){
            dropDown.selectByVisibleText(value);
        }else{
            System.out.println("Please select the correct value");
        }
    }

    public static void mouseHover(WebDriver driver, WebElement element){
        Actions action=new Actions(driver);
        action.moveToElement(element)
                .build()
                .perform();
    }

    public static void switchToWindows(WebDriver driver) {
        String parentWindows = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentWindows.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
            driver.switchTo().window(parentWindows);
        }
    }

    public static void scrollDownByElement(WebDriver driver, WebElement element){
       JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void scrollUp(WebDriver driver){
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
        javascriptExecutor.executeScript("window.scrollBy(0,800)");
       javascriptExecutor.executeScript("window.scrollBy(0,-800)");
    }

    public static void getCookies(){
        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie c : cookies){
            System.out.println(c);
        } 
    }
      
    public static void ScrollDown(WebDriver driver) {
            JavascriptExecutor je = (JavascriptExecutor) driver;
            je.executeScript("window.scrollBy(0,900)");
          
    }
        

public static void iFameHandle(List<WebElement> element)throws InterruptedException{
System.out.println(element.size());
for (WebElement e : element) {
    System.out.println(e);
}

Thread.sleep(4000);
}
}