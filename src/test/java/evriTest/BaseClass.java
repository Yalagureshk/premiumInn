package evriTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepo.HomePage;
import objectRepo.basket;
import objectRepo.deliveryOptions;
import objectRepo.loginPage;
import objectRepo.parcelDetails;
import utilities.Utils;

public class BaseClass {

	public loginPage loginpg;
	public HomePage homepg;
	public deliveryOptions delievryOptionspg;
	public parcelDetails parcelDetailspg;
	public basket basketpg;
	String baseurl;
	public static WebDriver driver;

	@BeforeMethod
	public void launchBrowser() throws IOException {

		try {
			// WebDriverManager.chromedriver().setup();

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\0024Y7744\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			baseurl = Utils.getproperty("url");
			driver.navigate().to(baseurl);
			driver.manage().window().maximize();
			driver.findElement(By.id("accept-all-cookies-button")).click();

			loginpg = new loginPage(driver);
			//homepg = new HomePage(driver);
			//delievryOptionspg = new deliveryOptions(driver);
			//parcelDetailspg = new parcelDetails(driver);
			//basketpg = new basket(driver);
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//button[contains(.,'Accept all cookies')]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@AfterMethod
	public void closeBrowser() {

		driver.quit();
	}

}
