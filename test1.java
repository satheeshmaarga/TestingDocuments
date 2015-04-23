package test_Package;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {
	
	WebDriver driver = new FirefoxDriver ();
  
	@BeforeMethod
  public void setUp() throws IOException 
  
{
		//String uname = "Rajeshkumar_p";
		//String pwd = "password@#123";
		 //String TEST_ENVIRONMENT = "10.10.10.181/RSP/ACE.nsf/Home.xsp";
		//String url = "http:" + uname + ":" + pwd + "@" + TEST_ENVIRONMENT;
		//driver.get("http://kalaichelvan_s:9597333725@10.10.10.181/RSE/ACE.nsf/Home.xsp");
		//driver.get("http://10.10.10.181/RSP/ACE.nsf/Home.xsp");
		Runtime.getRuntime().exec("C:\\Documents and Settings\\satheesh_v\\Desktop\\script.exe");
		driver.get("http://10.10.10.181/RSE/ACE.nsf/Home.xsp");
		//Runtime.getRuntime().exec("C:\\Documents and Settings\\satheesh_v\\Desktop\\script.exe");
		//driver.get(url);
}
  
  
	@AfterMethod
  public void teardown()
	{
	  //driver.close();
  }
	@Test
	public void testmethod(){
		System.out.println("Test");
	}
}
