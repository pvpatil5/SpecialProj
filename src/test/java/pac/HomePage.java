package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage 
{
	@Test
	public void login1() 
	{
		System.setProperty("webdriver.chrome.driver", "../Selenium/src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		Assert.assertEquals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus Indi", title);
		
	}
	

}
