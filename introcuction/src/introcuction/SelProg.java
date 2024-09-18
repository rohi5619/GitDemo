package introcuction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SelProg {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	//	driver.close();
		
		driver.quit();

	}

}
