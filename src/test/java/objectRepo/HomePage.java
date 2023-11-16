package objectRepo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


	public WebDriver driver;
	
	
	 @FindBy(xpath="//div[@class='e-dropdown__input']")
	 public WebElement weight;
	 
	 @FindBy(xpath="//button[contains(.,'Get a price')]")
	 public WebElement btnGetAPrice;
	 
	 @FindBy(xpath="//input[@class='e-input__field e-input__input']")
	 public List<WebElement> passcodes;
	 
	 @FindBy(xpath="//div[@class='tabs-card__tab tabs-card__tab--active']")
	 public WebElement sendTab;
	 
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
