package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;

public class LoginPage extends WebTestBase {

	@FindBy(xpath ="//input[@id='login_mobile']")
    WebElement Mobno;

    @FindBy(xpath = "//input[@id='login_password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[@id='btnLoginSubmit']")
    WebElement loginbtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void login(String mobileno, String password){
    	 Mobno.sendKeys(mobileno);
    	 passwordTextBox.sendKeys(password);
        loginbtn.click();
    }
}
