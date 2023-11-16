package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

	public static void selectValFromDropdown() throws InterruptedException, AWTException {

		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}

	public static void handleFeedbackPopup(WebDriver driver) throws InterruptedException {
		List<WebElement> popup = driver.findElements(By.xpath("//button[@value='No thanks']"));
		if (popup.size() > 0) {
			popup.get(0).click();
			Thread.sleep(1000);
		}
	}
	
	
	public static String getproperty(String key) throws IOException {
		
		String baseurl = System.getProperty("user.dir");
		String filepath ="\\src\\test\\resources\\propertiesFiles\\prod.properties";
		  FileReader reader=new FileReader(baseurl+filepath);  
	      
		    Properties p=new Properties();  
		    p.load(reader);  
		      
		    return p.getProperty(key);
 
	}

}
