package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHotelDetailsPage {
	
	WebDriver driver;
	
	//WebElements Declaration
	@FindBy(css = "h1[data-stid='content-hotel-title']")
	WebElement HotelTitleName;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[1]/main/div[1]/section/ul/li[1]/div/section/div/div[2]/div/section/div/div[2]/div[2]/div/form/button")
	WebElement FirstHotelReserveButton;
	
	//Action Methods
	public String getHotelName() {
		return HotelTitleName.getText();
	}
	public void clickOnReserveFirstRoom() {
		FirstHotelReserveButton.click();
	}
	
	//Constructor
	public ExpediaHotelDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
