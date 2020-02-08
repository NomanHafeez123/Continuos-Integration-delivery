package automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilitiesFactory {
	public static AndroidDriver<AndroidElement> capabilities(String device) throws MalformedURLException 
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		/*if (device == "new")
		{
			File f = new File("src");
			File path = new File (f,"General-Store.apk");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		cap.setCapability(MobileCapabilityType.APP, path.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		}
		else if (device == "already installed")
		{
		cap.setCapability(MobileCapabilityType.FULL_RESET, false);
		cap.setCapability("appPackage", "com.sec.android.app.launcher");
		cap.setCapability("appActivity", "com.sec.android.app.launcher.activities.LauncherActivity");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		}*/
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		AndroidDriver <AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}
	}
