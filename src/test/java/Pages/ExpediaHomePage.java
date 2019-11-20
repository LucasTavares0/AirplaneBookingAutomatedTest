package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExpediaHomePage {
	
	//WebElements declaration
	WebDriver driver;
	WebElement HotelButton;
	WebElement DestinationTextBox;
	WebElement CheckInTextBox;
	WebElement CheckOutTextBox;
	WebElement TravelersButton;
	WebElement TravelerAdultLessButton;
	WebElement TravelerChildPlusButton;
	Select Child1AgeSelect;
	Select Child2AgeSelect;
	WebElement SearchButton;
	
	//Action Methods
	public void clickOnHotelButton() {
		HotelButton.click();
	}
	public void clearDestinationTextBox() {
		DestinationTextBox.clear();
	}
	public void clearCheckInTextBox() {
		CheckInTextBox.clear();
	}
	public void clearCheckOutTextBox() {
		CheckOutTextBox.clear();
	}
	public void sendKeysDestinationTextBox(String destination){
		DestinationTextBox.sendKeys(destination);
	}
	public void sendKeysCheckInTextBox(String checkInDate) {
		CheckInTextBox.sendKeys(checkInDate);
	}
	public void sendKeysCheckOutTextBox(String checkOutDate) {
		CheckOutTextBox.sendKeys(checkOutDate);
	}
	public void clickOnTravelersButton() {
		TravelersButton.click();
		findTravelersElements();
	}
	public void clickOnLessAdult() {
		TravelerAdultLessButton.click();
	}
	public void clickOnPlusChild() {
		TravelerChildPlusButton.click();
	}
	public void selectChild1Age(String childAge) {
		Child1AgeSelect.selectByValue(childAge);
	}
	public void selectChild2Age(String childAge) {
		Child2AgeSelect.selectByValue(childAge);
	}
	public void clickOnSearchButton() {
		SearchButton.click();
	}
	
	//WebElements INIT
	public void findInitialElementsLocation() {
		
		this.HotelButton = driver.findElement(By.id("tab-hotel-tab-hp"));
		this.DestinationTextBox = driver.findElement(By.id("hotel-destination-hp-hotel"));
		this.CheckInTextBox = driver.findElement(By.id("hotel-checkin-hp-hotel"));
		this.CheckOutTextBox = driver.findElement(By.id("hotel-checkout-hp-hotel"));
		this.TravelersButton = driver.findElement(By.cssSelector("button[type='button'][class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']"));

		this.SearchButton = driver.findElement(By.cssSelector("button[type='submit'][data-gcw-change-submit-text='Search']"));
	}
	public void findTravelersElements() {
		this.TravelerAdultLessButton = driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[5]/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/button"));
		this.TravelerChildPlusButton = driver.findElement(By.xpath("/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[5]/div[3]/div/ul/li/div/div/div[1]/div[3]/div[1]/div[4]/button"));
		this.Child1AgeSelect = new Select(driver.findElement(By.cssSelector("select[type='select'][data-gcw-storeable-name='gcw-child-age-1-1']")));
		this.Child2AgeSelect = new Select(driver.findElement(By.cssSelector("select[type='select'][data-gcw-storeable-name='gcw-child-age-1-2']")));
	}
	
	//Constructor
	public ExpediaHomePage(WebDriver driver) {
		
		this.driver = driver;
		findInitialElementsLocation();
	}
}
