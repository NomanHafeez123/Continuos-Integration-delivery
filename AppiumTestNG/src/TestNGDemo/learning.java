package TestNGDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class learning {

	@AfterTest	
	public void logOut()
	{System.out.println("Logged out");}
	@Parameters({"URL"})
@Test(groups={"Smoke"})
public void Demo(String urlName)
{System.out.println("hello" + urlName);}

@BeforeSuite	
public void before()
{System.out.println("Number1");}
}