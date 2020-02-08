import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.List;


public class PreferenceElements {
	public static AndroidElement preference(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//android.widget.TextView[@text='Preference']");
	}
	public static AndroidElement preferenceDependencies(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']");
	}
	public static AndroidElement wifi(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//android.widget.CheckBox[@resource-id='android:id/checkbox']");
	}
	public static AndroidElement wifiSettings(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("(//android.widget.RelativeLayout)[2]");
	}
	public static AndroidElement wifiCredentials(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByClassName("android.widget.EditText");
	}
	public static AndroidElement wifiKeys(AndroidDriver<AndroidElement> driver,String button) throws MalformedURLException 
	{
		AndroidElement a = null;
		List<AndroidElement> element = driver.findElementsByClassName("android.widget.Button");
		if (button == "OK")
				{
			a = element.get(1);
			}
		else if (button == "Cancel")
		{
			a= element.get(0);
		}
		return a;
	}
	public static int checkProperty(AndroidDriver<AndroidElement> driver) throws MalformedURLException 
	{
   return driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
	}
	}


