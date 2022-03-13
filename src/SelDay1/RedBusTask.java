package SelDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTask {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\J yomitha\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/ "+ "");
		WebElement sr = driver.findElement(By.id("src"));
		sr.sendKeys("velachery,Chennai");
		
		WebElement ds = driver.findElement(By.id("dest"));
		ds.sendKeys("katpadi,vellore");
		
		WebElement fn = driver.findElement(By.id("onward_cal"));
		fn.click();
		
		WebElement fn1 = driver.findElement(By.xpath("//td[text()='24']"));
		fn1.click();
		
	}

}
