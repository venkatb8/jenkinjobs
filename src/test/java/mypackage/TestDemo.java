package mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo {
//	WebDriver driver;
//	String browserName = "chrome";
//	
//	@Parameters("browser")
//	@BeforeMethod
//	public void navigation(String browserName) throws InterruptedException {
//
//		if (browserName.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
//		} else if (browserName.equalsIgnoreCase("firefox")) {
//			driver = new FirefoxDriver();
//		} else if (browserName.equalsIgnoreCase("IE")) {
//			driver = new InternetExplorerDriver();
//		}
//	}

	
	@Test
	public void google() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void bing() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void flipkart() throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.quit();
	}
}
