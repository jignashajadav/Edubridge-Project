package testCase;

import testBase.WebTestBase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;
import pages.MyAccountPage;
import pages.LoginPage;


public class tc01 extends WebTestBase {
	MyAccountPage myAccountPage;
	HomePage homePage;
	LoginPage loginPage;
	
	public tc01()  // create constructor
	{
		super();
	}
    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
   
    }
        @Test(priority = 3)
        public void verifyLoginWithValidCredential(){
            SoftAssert softAssert = new SoftAssert();
            homePage.userSearchClick();
            loginPage.login(prop.getProperty("mobileno"), prop.getProperty("password"));
            softAssert.assertEquals(myAccountPage.getTextOFMYAccountPage(), "Login",  "Login text should be match");
            softAssert.assertAll();
    
        }
            @Test(priority = 2)
            public void verifySearchBar(){
                SoftAssert softAssert = new SoftAssert();
         

                homePage.userSearchClick();
                loginPage.login(prop.getProperty("mobileno"), prop.getProperty("password"));
                myAccountPage.search();
                 softAssert.assertAll();
           }
           
            @Test(priority = 0)
            public void verifyScrollDown(){
                SoftAssert softAssert = new SoftAssert();
                myAccountPage.isSelectMethod();
               softAssert.assertAll();
            }
            
          
            @Test(priority = 1)
            public void verifyGetWindowHandle()throws InterruptedException{
               SoftAssert softAssert = new SoftAssert();
                myAccountPage.windowHandle();
                softAssert.assertAll();
            }
            

            @Test(priority = 4)
            public void verifyCookiesHandle(){
                SoftAssert softAssert = new SoftAssert();
                myAccountPage.getCookiesHandle();
                softAssert.assertAll();
            }
            
            @Test(priority = 5)
   	    public void veryfyIFrame()throws InterruptedException{
            	myAccountPage.iFrame();
            }
            
            @Test(priority = 6) 
    	    public void verifySelectInCheckBoxFunction(){
            	myAccountPage.isDisplayed();
    	    }

            @AfterMethod
            public void afterMethod(){
                driver.close();
            }
            
            
            
            
}
