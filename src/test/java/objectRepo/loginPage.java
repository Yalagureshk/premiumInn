package objectRepo;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utils;

public class loginPage {

	public WebDriver driver;

	@FindBy(id = "1-email")
	public WebElement emailId;

	@FindBy(xpath = "//div[@class='css-1hi84fg']//a")
	public List<WebElement> hotelList;

	@FindBy(xpath = "//button[@name='submit']")
	public WebElement loginBtn;

	@FindBy(xpath = "//input[@placeholder='Enter place, postcode or hotel']")
	public WebElement city;

	@FindBy(xpath = "//input[@placeholder='Check in / Check out']")
	public WebElement date;

	@FindBy(id = "search-console__form-button")
	public WebElement searchBtn;

	@FindBy(id = "menu-button-13")
	public WebElement sortBtn;

		public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
