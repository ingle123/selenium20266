package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDemo {

	public  static WebDriver driver ;
	
	public WebDriver Open() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		return driver;
			
	}
	
	public WebDriver Close() {
		driver.close();
		return driver;
				
	}

}
