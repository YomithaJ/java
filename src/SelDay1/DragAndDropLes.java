package SelDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropLes {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\J yomitha\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement scr = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dis = driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
		 
		WebElement scr1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dis1 = driver.findElement(By.id("amt7"));
		
		 WebElement scr2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		 WebElement dis2 = driver.findElement(By.id("loan"));
		 
		 WebElement scr3 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		 WebElement dis3 = driver.findElement(By.id("amt8"));
		 
		
		 
		 Actions actions = new Actions(driver);
		
		actions.dragAndDrop(scr, dis).perform();
		
		actions.dragAndDrop(scr1, dis1).perform();
		
		actions.dragAndDrop(scr2, dis2).perform();
		
		actions.dragAndDrop(scr3, dis3).perform();
		
		 WebElement scr4 = driver.findElement(By.xpath("//a[text()='Perfect!']"));
		 String text = scr4.getText();
		 System.out.println(text);
	
		
		
	}

}
