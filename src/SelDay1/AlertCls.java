package SelDay1;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCls {
	
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\J yomitha\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html\r\n" + "");
			//WebElement findElement = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
			//findElement.click();
			
			//WebElement findElement2 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			//findElement2.click();
			//Alert alert = driver.switchTo().alert();
			//alert.accept();
			
			//WebElement btn = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
			//btn.click();
			//WebElement findElement = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			//findElement.click();
			//Alert alert = driver.switchTo().alert();
			//alert.dismiss();
			
			WebElement btn1 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
			btn1.click();
			WebElement btn2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
			btn2.click();
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Deepack lal");
			alert.accept();
			
			WebElement yo = driver.findElement(By.id("demo1"));
			String text = yo.getText();
			System.out.println(text);
	}
}