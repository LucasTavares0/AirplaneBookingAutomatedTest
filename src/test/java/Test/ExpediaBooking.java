package Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import Pages.ExpediaHomePage;
import Pages.ExpediaHotelDetailsPage;
import Pages.ExpediaHotelSearchpage;
import Pages.ReservationPaymentPage;
import Utilities.DriverFactory;

public class ExpediaBooking {
	
	//Input Variables
	public String childAge = "0";
	public String checkInDate = "11/22/2019";
	public String checkOutDate = "11/23/2019";
	public String hotelDestinationCity = "Washington, District of Columbia";
	public String browserType = "";
	
	//Assertion Variables
	public String selectedHotel = "";
	
	WebDriver driver;
	DriverFactory factory = new DriverFactory();
	ArrayList<String> windows = new ArrayList<String>();
	
	@Test
	public void hotelReservation() {
		
		//1. Search
		ExpediaHomePage homepage = new ExpediaHomePage(driver);
		System.out.println("#### WORKING ON WINDOW = " + driver.getTitle());
		
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
		System.out.println("#### WORKING ON WINDOW = " + driver.getTitle());
		
		System.out.println("Destination City = " + hotelpage.getTextFromDestinationTitle());
//		hotelpage.selectFourStarCriteria();		
		
		//3. Analize the result and make our selection
		hotelpage.clickOnThirdResult();
		
		// Switch driver to new browser window
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		System.out.println("#### WORKING ON WINDOW = " + driver.getTitle());
		
		//Getting confimation data from Hotel Details
		ExpediaHotelDetailsPage hoteldetails = new ExpediaHotelDetailsPage(driver);
		System.out.println("Hotel Name = "+ hoteldetails.getHotelName());
		selectedHotel = hoteldetails.getHotelName();
		
		//4. Booking reservation
		hoteldetails.clickOnReserveFirstRoom();
		
		//5. Fill our contact / billing
		//[TO BE IMPLEMENTED]
		
		//6. Get confirmation
		System.out.println("#### WORKING ON WINDOW = " + driver.getTitle());
		ReservationPaymentPage payment = new ReservationPaymentPage(driver);
		
		System.out.println("Hotel Name = "+ payment.getHotelName());
		System.out.println("Total payment price = " + payment.getTotalPrice());
		
		//Test Assertions
		String paymentHotel = payment.getHotelName();
		//String paymentPrice = payment.getTotalPrice();
		Assert.assertTrue(paymentHotel.contains(selectedHotel));
		//if(paymentPrice == null) {Assert.assertTrue(true);}else {Assert.fail();}
	}
	
	@Before
	public void setUp() {
		System.out.println("**** STARTING TEST AND OPENNING BROWSER... ****");
		
		driver = factory.openBrowser(browserType);
		driver.get("http://www.expedia.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);	
	}
	
	@After
	public void tearDown() {
		System.out.println("**** FINISHING TEST AND CLOSING BROWSER... ****");
		
		driver.quit();
	}
}
