package pageclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageDemo {

	public static WebDriver driver;
	
	By emaiid = By.id("_R_1h6kqsqppb6amH1_");
	
	By pass = By.id("_R_1hmkqsqppb6amH1_");
	
	public PageDemo(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void loginid () {
		driver.findElement(emaiid).sendKeys("Sachin");
		
	}
	public  void password () {
		driver.findElement(pass).sendKeys("1234");
		
	}
}
