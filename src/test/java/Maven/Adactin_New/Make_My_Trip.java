package Maven.Adactin_New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Make_My_Trip{
	
	@Test
			public void browser_launch() {


		System.setProperty("webdrver.gecko.driver", "C:\\Users\\Javed\\eclipse-workspace\\Adactin_New\\Driver_Firefox\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		 
	}
		
		
	

		

}
