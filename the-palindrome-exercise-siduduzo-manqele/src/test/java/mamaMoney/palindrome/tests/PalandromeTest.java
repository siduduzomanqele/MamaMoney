package mamaMoney.palindrome.tests;

import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import mamaMoney.palindrome.pages.CsvDataProviders;

public class PalandromeTest extends BaseTest {
	@Test(priority = 1, dataProvider = "csvReader", dataProviderClass = CsvDataProviders.class)
	public void allPalindromeTests(Map<String, String> testData) throws IOException {

		// we are reading these from the csv file -
		// testID,testDescription,text,palidromeExpectedMessage
		String testID = testData.get("testID");
		String testDescription = testData.get("testDescription");
		String text = testData.get("text");
		String palidromeExpectedMessage = testData.get("palidromeExpectedMessage");

		System.out.println("Starting Test Case ID " + testID + ", " + testDescription);
		homePage.openHomePage().verifyPalindrome(text, palidromeExpectedMessage);
	}

}
