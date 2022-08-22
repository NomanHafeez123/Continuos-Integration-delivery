package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriversFactory {
    public static WebDriver open(String browsertype)
    {
        if (browsertype.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "..\\Tamanna\\Drivers\\chromedriver.exe");
            return new ChromeDriver();
        }
        else if(browsertype.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "..\\Tamanna\\Drivers\\geckodriver.exe");
            return new FirefoxDriver();
        }
        else
        {
            System.setProperty("webdriver.ie.driver","..\\Tamanna\\Drivers\\IEDriverServer.exe");
            return new InternetExplorerDriver();
        }
    }
}

