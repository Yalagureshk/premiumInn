package objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class deliveryOptions {

	public WebDriver driver;
	
	
	 @FindBy(xpath="//div[@data-test-id='e-button-select']")
	 public WebElement postbaleSize;
	 
	 @FindBy(xpath="//div[@data-test-id='e-button-select']")
	 public List<WebElement> standDeliverySpeed;
	 
	 @FindBy(xpath="//input[@value='Parcelshop drop off']/parent::div[@data-test-id='e-button-select']")
	 public WebElement dropOffOrCollection;
	 
	 @FindBy(xpath="//button[@aria-label='Click here to continue with sending your parcel']")
	 public WebElement btnContinue;
	 

	 
	
	public deliveryOptions(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
