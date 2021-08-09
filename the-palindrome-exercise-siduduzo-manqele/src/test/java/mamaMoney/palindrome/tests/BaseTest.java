package mamaMoney.palindrome.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

import mamaMoney.palindrome.pages.HomePage;

public class BaseTest {

	
	    WebDriver driver;
	    HomePage homePage;

	    @BeforeClass
	    public void classLevelSetup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	    }
	 
	    @BeforeMethod
	    public void methodLevelSetup() {
	        homePage = new HomePage(driver);
	    }
	 
	    @AfterClass
	    public void teardown() {
	        driver.quit();
	    }

	

}
