package pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login 
{
	@Test
	public void login2() 
	{
		String DirPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", DirPath+"/src/test/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	
		
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus India", title);
	}
	
	
}
