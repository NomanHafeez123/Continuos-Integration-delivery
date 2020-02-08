package automation;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;




import java.net.MalformedURLException;
import java.util.Set;


public class base {

	public static void main(String[] args) throws MalformedURLException {
	
		String device;
		device = "new";
		//AndroidDriver<AndroidElement> driver = CapabilitiesFactory.capabilities(device);*/
		//for normal flow
		/*String button = "Cancel";
		PreferenceElements.preference(driver).click();
		PreferenceElements.preferenceDependencies(driver).click();
		PreferenceElements.wifi(driver).click();
		PreferenceElements.wifiSettings(driver).click();
		PreferenceElements.wifiCredentials(driver).sendKeys("password");
		PreferenceElements.wifiKeys(driver,button).click();*/
		
		//ViewElements.view(driver).click();
		//for tapandLongpress
		/*ViewElements.touch(driver).perform();
		ViewElements.customAdapter(driver).click();
		ViewElements.longPress(driver).perform();*/
		
		//for Swiping
		/*ViewElements.dateWidgets(driver).click();
		ViewElements.inLine(driver).click();
		ViewElements.timeChange(driver).click();
		ViewElements.swiping(driver).perform();*/
		
		//for Scrolling
		//ViewElements.scrolling(driver);
		
		//for DragandDrop
		/*ViewElements.dragandDrop(driver).click();
		ViewElements.performdragandDrop(driver).perform();*/
		//ViewElements.backKey(driver);
		
		//for web and hybrid applications
		AndroidDriver<AndroidElement> driver = CapabilitiesFactory.capabilities(device);
		//driver.get("http://www.google.com");
		Set<String> contexts = driver.getContextHandles();
		for (String contextNames : contexts)
		{
			System.out.println(contextNames);
		}
		driver.context("NATIVE_APP");
	}

}
