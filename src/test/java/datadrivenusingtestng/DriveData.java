package datadrivenusingtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriveData {

	@Test
	@Parameters({"keyword","two"})
	public void testcase2(String name,String url) {
		System.out.println(name);
		//System.out.println(value);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
	}
	
}
