	//import java.io.File;
	import java.net.MalformedURLException;
	import java.net.URL;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.MobileCapabilityType;

	import org.openqa.selenium.remote.DesiredCapabilities;


	public class CapabilitiesFactory {
		
		public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
			
			/*File f = new File("src");
			File path = new File(f,"ApiDemos-debug.apk");*/ //For installation of app
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.FULL_RESET, false);
			cap.setCapability("appPackage","io.appium.android.apis");
			cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AppiumDevice");
			/*cap.setCapability(MobileCapabilityType.APP,path.getAbsolutePath());*/ //for installation of app
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
			
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			return driver;
		}
	}
