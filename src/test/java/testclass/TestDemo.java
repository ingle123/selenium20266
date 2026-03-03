package testclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseclass.BaseDemo;
import pageclass.PageDemo;

public class TestDemo extends BaseDemo {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void open() throws InterruptedException {
		driver = Open();
		Thread.sleep(5000);
	}
	 
	@Test	public void test() {
		
		PageDemo obj = new  PageDemo(driver);
		obj.loginid();
		obj.password();
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException {
		driver =Close();  
		Thread.sleep(5000);
	}
	}

