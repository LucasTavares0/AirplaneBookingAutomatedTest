package Test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.ExpediaHomePage;
import Pages.ExpediaHotelSearchpage;
import Utilities.DriverFactory;

public class ExpediaBooking {
	
	public String childAge = "0";
	public String checkInDate = "11/22/2019";
	public String checkOutDate = "11/23/2019";
	public String hotelDestinationCity = "New York, New York";
	public String browserType = "";
	
	WebDriver driver;
	DriverFactory factory = new DriverFactory();
	
	@Test
	public void hotelReservation() {
		
		//1. Search
		ExpediaHomePage homepage = new ExpediaHomePage(driver);
		
		homepage.clickOnHotelButton();
		homepage.clearDestinationTextBox(); 
		homepage.sendKeysDestinationTextBox(hotelDestinationCity);
		homepage.clearCheckInTextBox(); 
		homepage.sendKeysCheckInTextBox(checkInDate);
		homepage.clearCheckOutTextBox(); 
		homepage.sendKeysCheckOutTextBox(checkOutDate);
		homepage.clickOnTravelersButton();
		homepage.clickOnLessAdult();
//		homepage.clickOnPlusChild();
//		homepage.selectChild1Age(childAge);
		homepage.clickOnSearchButton();
		
		//2. Modify the search results page, give criteria
		ExpediaHotelSearchpage hotelpage = new ExpediaHotelSearchpage(driver);
		
		hotelpage.selectFourStarCriteria();
		
		//3. Analize the result and make our selection
		
		
		//4. Booking reservation
		
		
		//5. Fill our contact / billing
		
		
		//6. Get confirmation
	}
	
	@Before
	public void setUp() {
		driver = factory.openBrowser(browserType);
		driver.get("http://www.expedia.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {		
//   	driver.quit();
	}
}
