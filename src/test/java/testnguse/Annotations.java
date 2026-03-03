package testnguse;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {
     
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}
	@BeforeSuite
	public void Beforesiut() {
		System.out.println("Before suit");
	}
	
	@BeforeClass
	public void Beforeclass() {
		System.out.println("Before class");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	@Test (groups= {"Sanity","Smoke"})
	public void testcase1() {
		System.out.println(" Testcase1");
	}
    @Test(priority=1)
    public void testcase2() {
	System.out.println("Testcase2");
}
    @Test(groups= {"Sanity"})
    public void testcase3() {
    	System.out.println("Testcase3");
     }

    @Test(priority=2)
    public void testcase4() {
    	System.out.println("Testcase4");
     }
}
