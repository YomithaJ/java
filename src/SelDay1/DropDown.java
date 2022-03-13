package SelDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\J yomitha\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.google.com/");
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath("//a[@class='gb_d'])[1]"));
				
		findElement.click();
	}	

}
