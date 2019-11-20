package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ExpediaHomePage {
	
	WebDriver driver;
	
	
	//WebElements Declaration
	@FindBy(id = "tab-hotel-tab-hp")
	WebElement HotelButton;
	
	@FindBy(id = "hotel-destination-hp-hotel")
	WebElement DestinationTextBox;
	
	@FindBy(id = "hotel-checkin-hp-hotel")
	WebElement CheckInTextBox;
	
	@FindBy(id = "hotel-checkout-hp-hotel")
	WebElement CheckOutTextBox;
	
	@FindBy(css = "button[type='button'][class='trigger-utility menu-trigger btn-utility btn-secondary dropdown-toggle theme-standard pin-left menu-arrow gcw-component gcw-traveler-amount-select gcw-component-initialized']")
	WebElement TravelersButton;
	
	@FindBy(xpath = "/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[5]/div[3]/div/ul/li/div/div/div[1]/div[2]/div[2]/button")
	WebElement TravelerAdultLessButton;
	
	@FindBy(xpath = "/html/body/meso-native-marquee/section/div/div/div[1]/section/div/div[2]/div[2]/section[2]/form/div[5]/div[3]/div/ul/li/div/div/div[1]/div[3]/div[1]/div[4]/button")
	WebElement TravelerChildPlusButton;
	
	@FindBy(css = "select[type='select'][data-gcw-storeable-name='gcw-child-age-1-1']")
	Select Child1AgeSelect;
	
	@FindBy(css = "select[type='select'][data-gcw-storeable-name='gcw-child-age-1-2']")
	Select Child2AgeSelect;
	
	@FindBy(css = "button[type='submit'][data-gcw-change-submit-text='Search']")
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

	
	
	//Constructor
	public ExpediaHomePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
