package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class parcelDetails {

	public WebDriver driver;
	
	
	 @FindBy(xpath="//span[contains(.,'Parcel contents')]/parent::label//input")
	 public WebElement parcelCobntent;
	 
	 
	 @FindBy(xpath="//span[contains(.,'How much is it worth')]/parent::label//input")
	 public WebElement parcelWorth;
	 
	 @FindBy(xpath="//span[contains(.,'Continue')]/parent::button")
	 public WebElement btnContinue;
	 
	 
	 @FindBy(xpath="//span[contains(.,'Recipient first name')]/parent::label//input")
	 public WebElement firstName;
	 
	 @FindBy(xpath="//span[contains(.,'Recipient last name')]/parent::label//input")
	 public WebElement lastName;
	 
	 @FindBy(xpath="//div[contains(.,'Select an address')]/parent::div[@data-test-id='dropdown-container']")
	 public WebElement receptAddress;
	 
	 @FindBy(xpath="//span[contains(.,'Postcode')]/parent::label//input")
	 public WebElement receitPostCode;
	 
	 @FindBy(xpath="//span[contains(.,'Your phone number')]/parent::label//input")
	 public WebElement phoneNumber;
	 
	 @FindBy(xpath="//button[contains(@aria-label,'Click here to continue with sending your parcel')]")
	 public WebElement btnaddTobasket;
	 
	//span[contains(.,'Continue')]/parent::button
	
	public parcelDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
