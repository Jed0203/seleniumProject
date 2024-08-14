package seleniumProject_1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
 * Test Case
 * ------
 * 1) Launch browser(chrome)
 * 2) Open URL https://demo.opencart.com/
 * 3) Validate title should be "Your Store"
 * 4) Close browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		// 1) Launch browser(chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// 2)Open URL https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		// 3) Validate title should be "Your Store"
		
		//id
		//	driver.findElement(By.name("search")).sendKeys("Mac");
		//name 
		//boolean logoDisplaystatus = driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplaystatus);
		
		//linktext & partialLinkText
		//driver.findElement(By.linkText("Tablets")).click();
		
		
		// classname
		//List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
		//System.out.println("total number of header links:"+headerLinks.size());
		
		//tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total number of links:"+links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("total number of images:"+images.size());
		
		// 4) Close browser
		//driver.close();
	}

}
