package objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class basket {

	public WebDriver driver;

	@FindBy(xpath = "//div[@class='parcels-count']")
	public WebElement parcelCount;

	@FindBy(xpath = "//div[@class='e-button-icon__icon']")
	public List<WebElement> expandButton;

	@FindBy(xpath = "//h5[@class='header__item-title']")
	public WebElement header;

	@FindBy(xpath = "//h4[contains(.,'Parcel info:')]/parent::div//ul")
	public WebElement parcelInfo;

	@FindBy(xpath = "//h4[contains(.,'Deliver to:')]/parent::div//ul")
	public List<WebElement> deliverTo;

	@FindBy(xpath = "//h4[contains(.,'Return to:')]/parent::div//ul")
	public WebElement returnTo;

	public basket(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
