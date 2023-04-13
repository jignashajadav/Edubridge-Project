package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class HomePage extends WebTestBase {

	@FindBy(linkText = "Log In")
    WebElement usersearch;

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void userSearchClick(){
        usersearch.click();
    }
	}
	

