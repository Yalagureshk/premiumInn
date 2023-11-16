package evriTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EnviTests extends BaseClass {

	@Test(priority = 0, description = "click Login button without entering credential", enabled = true)
	public void Invalidlogin() {

		try {
			loginpg.city.sendKeys("Manchester");
			Thread.sleep(1000);
			loginpg.city.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			// Select Date

			loginpg.date.click();
			Thread.sleep(1000);
			//TODO: driver.findElement(By.id("search-date-picker-day-17112023")).click();
			Thread.sleep(1000);

						
			loginpg.searchBtn.click();
			
			Select s1= new Select(loginpg.searchBtn);
			
			s1.selectByVisibleText("Price");


			//Click on 2nd Hotel
			loginpg.hotelList.get(1).click();
			
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
