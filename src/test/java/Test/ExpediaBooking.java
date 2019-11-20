package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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
		
		//1. Search
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).clear();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(hotelDestinationCity);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(checkInDate);
		driver.findElement(By.id("hotel-checkout-hp-hotel")).clear();
		driver.findElement(By.id("hotel-checkout-hp-hotel")).sendKeys(checkOutDate);
		driver.findElement(By.cssSelector("button[type='button'][class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")).click();
		driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[5]/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[5]/div[3]/div/ul/li/div/div/div[1]/div[3]/div[1]/div[4]/button")).click();
		new Select(driver.findElement(By.cssSelector("select[type='select'][class='gcw-storeable gcw-toggles-field-by-value gcw-child-age-select']"))).selectByValue(childAge);
		driver.findElement(By.cssSelector("button[type='submit'][data-gcw-change-submit-text='Search']")).click();
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
