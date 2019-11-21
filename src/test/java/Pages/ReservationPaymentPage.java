package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservationPaymentPage {
	
	WebDriver driver;
	
	//WebElements Declaration
	@FindBy(className = "hotel-summary-name")
	WebElement HotelSummaryName;
	
	@FindBy(css = "span[class='summary-total amount-value'][data-price-update='total']")
	WebElement TripTotalPrice;
	
	//Action Methods
	public String getHotelName() {
		return HotelSummaryName.getText();
	}
	public String getTotalPrice() {
		return TripTotalPrice.getText();
	}
	
	//Constructor
	public ReservationPaymentPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
