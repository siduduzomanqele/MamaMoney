package mamaMoney.palindrome.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {
	String url = "https://xndev.com/palindrome";

	private By palindromeTextBox = By.id("originalWord");
	private By submitPalindrome = By.id("button1");
	private By palindromeResult = By.id("palindromeResult");

	public HomePage(WebDriver driver) {
		super(driver);

	}

	public HomePage openHomePage() {
		driver.get(url);
		return this;
	}
    private String getReverseText (String text) {
        StringBuilder word = new StringBuilder();
        word.append(text);

        return word.reverse().toString();
    }


	private Boolean isPalandrome(String text) {
	        String reversedText = getReverseText(text);

	        if (reversedText.equals(text))
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	public HomePage verifyPalindrome(String text, String message) {
	        typeText(palindromeTextBox, text);
	        click(submitPalindrome);
	        String palindromeText = readText(palindromeResult);
	        boolean palidromeCheck = isPalandrome(text);
	        
	        if(palidromeCheck == true)
	        {
	        	Assert.assertTrue(palindromeText.equals(message));
	        	
	        	
	        }else if(palidromeCheck == false)
	        {
	        	Assert.assertTrue(palindromeText.equals(message));
	        	 
	        	
	        }
	        return this;
	  
	      
	    }
	
	

}
