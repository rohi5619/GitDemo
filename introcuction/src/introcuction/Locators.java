package introcuction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
	//	driver.findElement(By.xpath("//form/input[1]")).sendKeys("Rohit");
		WebElement name = driver.findElement(By.xpath("//form/input[1]"));
		name.sendKeys("Rohit");
		
		driver.findElement(By.cssSelector("form input:nth-child(3)")).sendKeys("rohit@mail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9876543210");
		driver.findElement(By.className("reset-pwd-btn")).click();
		

	}

}
