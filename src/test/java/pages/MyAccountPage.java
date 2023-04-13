package pages;

import testBase.WebTestBase;

import java.util.List;

import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import util.utility;

	public class MyAccountPage extends WebTestBase {

		@FindBy(xpath = "//div[@class='form-heading text-center']")
	    WebElement accountTitle;

	    @FindBy(xpath = "//input[@id='searchText1']")
	    WebElement searchTextBox;

	    @FindBy(xpath = "//div[@class='search-summary search-heading']")
	    WebElement searchTitle;


	    @FindBy(xpath = "//span[@class='usernametext']")
	    WebElement hover;

	    @FindBy(xpath="//div[@class='w-100 card bg-white border-0 text-center active']")
	    WebElement youtubeOption; //explore
	    
	    @FindBy(linkText =("Job Guarantee"))
	    WebElement job; // window handle
	    
	    @FindBy(tagName ="iframe")
	    List<WebElement> iframe;
	    
	    @FindBy(xpath = "//a[@class='text-nowrap btn new-singup text-center w-100 cursor']")
	    WebElement logintab;
	    
	    
	    
	    
		public MyAccountPage()
		{
			PageFactory.initElements(driver, this);
		}
		public String getTextOFMYAccountPage(){
	        return accountTitle.getText();
	    }
		public void search(){
	        searchTextBox.click();
	        searchTextBox.sendKeys("Banking");
	        searchTextBox.sendKeys(Keys.ENTER);
	       
	    }
		

	    public void mouseHover(){
	       utility.mouseHover(driver,hover);
	    }


	    public void scrollDownMethod() {
	        utility.scrollDownByElement(driver, youtubeOption);
	        youtubeOption.click();

	    }

	   public void windowHandle(){
	        utility.scrollDownByElement(driver,job);
	        job.click();
	       utility.switchToWindows(driver);
	    }
	    
	    public void isSelectMethod(){
	        utility.ScrollDown(driver);
	        job.click();
	       // utility.ScrollDown(driver);
	    }

	    public void iFrame() throws InterruptedException {
	        utility.iFameHandle(iframe);
	    }
	
	    public void getCookiesHandle(){
	        utility.getCookies();
	    }
	    public String getTextOfSearch(){
	        return searchTitle.getText();
	    }
	    
	    public void isDisplayed(){
		       System.out.println(logintab.isDisplayed());
		    }
		
	}
