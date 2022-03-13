package SelDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\J yomitha\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		WebElement name = driver.findElement(By.id("username"));
		name.sendKeys("yomitha17");
		WebElement Password = driver.findElement(By.id("password"));
	     Password.sendKeys("171717");
	    WebElement log  = driver.findElement(By.id("login"));
          log.click();
          WebElement loc = driver.findElement(By.id("location"));
          Select select = new Select(loc);
          select.selectByIndex(5);
          
          WebElement hot = driver.findElement(By.id("hotels"));
          Select select1 = new Select(hot);
          select1.selectByIndex(2);
        
          WebElement room = driver.findElement(By.id("room_type"));
          room.sendKeys("Double");
          
          WebElement seach = driver.findElement(By.id("Submit"));
          seach.click();
          
          WebElement radio = driver.findElement(By.id("radiobutton_0"));
          radio.click();
          
          WebElement btn = driver.findElement(By.id("continue"));
          btn.click();
          
          WebElement fs = driver.findElement(By.id("first_name"));
          fs.sendKeys("jnjvjjbvkv");
          
          WebElement  la = driver.findElement(By.id("last_name"));
          la.sendKeys("jjbvkv");
          
          WebElement add = driver.findElement(By.id("address"));
          add.sendKeys("njdgjfhjglkhmfglklkdf");
          
          WebElement num= driver.findElement(By.id("cc_num"));
          num.sendKeys("355667876753423232335");
          
          WebElement cc = driver.findElement(By.id("cc_type"));
          cc.sendKeys("VISA");
          
          WebElement exp = driver.findElement(By.id("cc_exp_month"));
          exp.sendKeys("March");
          
          WebElement  yr = driver.findElement(By.id("cc_exp_year"));
          yr.sendKeys("2022");
          
          WebElement vv = driver.findElement(By.id("cc_cvv"));
          vv.sendKeys("4654");
          
          WebElement btn1 = driver.findElement(By.id("book_now"));
          btn1.click();
         
          Thread.sleep(5000);
          
          WebElement numr = driver.findElement(By.id("order_no"));
          String att = numr.getAttribute("value");
          System.out.println(att);
}
}