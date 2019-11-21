package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpediaHotelSearchpage {
	
	WebDriver driver;
	
	//WebElements declaration
	@FindBy(xpath = "//*[@id=\"star-3\"]")
	WebElement FourStarCriteriaButton;
	
	@FindBy(css = "button[type='button'][data-stid='hotels-destination-dialog-trigger']")
	WebElement DestinationTitleLabel;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div/div/div/div/div[1]/main/div/div/div[2]/section[1]/ol/li[3]/div/div/a")
	WebElement ThirdResult;
	
	//Action Methods
	public void selectFourStarCriteria() {
		FourStarCriteriaButton.click();
	}
	public String getTextFromDestinationTitle() {
		return DestinationTitleLabel.getText();
	}
	public void clickOnThirdResult() {
		ThirdResult.click();
	}
	
	//Contructor
	public ExpediaHotelSearchpage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
