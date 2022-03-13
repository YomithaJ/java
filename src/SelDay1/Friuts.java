package SelDay1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Friuts {
	
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\J yomitha\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fn = driver.findElement(By.id("fruits"));
		Select select = new Select(fn);
		boolean multiple = select.isMultiple();
	if (multiple==true) {
		List<WebElement> allSelectedOptions = select.getOptions();
			for (int i = 0; i < allSelectedOptions.size(); i++) {
				select.selectByIndex(i);
				
				
				
				
				
			}
			}
	}
	}


			
		
			
		
		
		

