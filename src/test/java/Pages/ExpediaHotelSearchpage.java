package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExpediaHotelSearchpage {
	
	WebDriver driver;
	
	//WebElements declaration
	@FindBy(id = "star-3")
	WebElement FourStarCriteriaButton;
	
	
	//Action Methods
	public void selectFourStarCriteria() {
		FourStarCriteriaButton.click();
	}
	
	//Contructor
	public ExpediaHotelSearchpage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
