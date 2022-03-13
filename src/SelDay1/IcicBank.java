package SelDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IcicBank {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\J yomitha\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://infinity.icicibank.com/corp/Login.jsp\r\n" + "");
       
		WebElement fe = driver.findElement(By.name("DUMMY1"));
		fe.click();
		
		WebElement f = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		f.sendKeys("yomi");
		
		WebElement f1 = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
		f1.sendKeys("3567778");
}
}