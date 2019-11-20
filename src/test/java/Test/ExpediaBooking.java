package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import Pages.ExpediaHomePage;
import Utilities.DriverFactory;

public class ExpediaBooking {
	
	public String childAge = "10";
	public String checkInDate = "11/22/2019";
	public String checkOutDate = "11/23/2019";
	public String hotelDestinationCity = "New York, New York";
	public String browserType = "";
	
	WebDriver driver;
	DriverFactory factory = new DriverFactory();
	
	@Test
	public void hotelReservation() {
		
		ExpediaHomePage homepage = new ExpediaHomePage(driver);
		
		//1. Search
		homepage.clickOnHotelButton();
		homepage.clearDestinationTextBox(); 
		homepage.sendKeysDestinationTextBox(hotelDestinationCity);
		homepage.clearCheckInTextBox(); 
		homepage.sendKeysCheckInTextBox(checkInDate);
		homepage.clearCheckOutTextBox(); 
		homepage.sendKeysCheckOutTextBox(checkOutDate);
//		homepage.clickOnTravelersButton();
//		homepage.clickOnLessAdult();
//		homepage.clickOnPlusChild();
//		homepage.selectChild1Age(childAge);
		homepage.clickOnSearchButton();
		
		//2. Modify the search results page, give criteria
		
		
		//3. Analize the result and make our selection
		
		
		//4. Booking reservation
		
		
		//5. Fill our contact / billing
		
		
		//6. Get confirmation
	}
	
	@Before
	public void setUp() {
		
		driver = factory.openBrowser(browserType);
		driver.get("http://www.expedia.com/");
	}
	
	@After
	public void tearDown() {
		
		driver.close();
	}
}
