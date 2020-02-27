package TestNGDemo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class learning {

	@AfterTest
	public void logOut()
	{}
	@Parameters({"URL"})
@Test(groups={"Smoke"})
public void Demo(String urlName)
{System.out.println("hello" + urlName);}

@BeforeTest
public void before()
{
}
}