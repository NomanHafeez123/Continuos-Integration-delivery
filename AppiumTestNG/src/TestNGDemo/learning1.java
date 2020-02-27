package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class learning1 {
	
	@Test(groups={"Smoke"})
	public void Second()
	{
	System.out.println("learning1class");
	Assert.assertTrue(false);
	}
	@Test(groups={"Smoke"})
	public void third()
	{
	System.out.println("learning1classthird");	
	}
	@BeforeTest
	public void logIn()
	{
	System.out.println("Logged In");	
	}
	@BeforeMethod
	public void beforelearning1()
	{
	System.out.println("beforelearning1");	
	}
}
