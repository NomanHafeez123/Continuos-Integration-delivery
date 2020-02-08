package automation;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;


public class ViewElements {
	public static AndroidElement view(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//android.widget.TextView[@text='Views']");
	}
	public static TouchAction touch(AndroidDriver<AndroidElement> driver) throws MalformedURLException 
	{
		TouchAction t =new TouchAction(driver);
		WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		return t.tap(tapOptions().withElement(element(expandList)));	
	}
	public static AndroidElement customAdapter(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
	}
	public static TouchAction longPress(AndroidDriver<AndroidElement> driver) throws MalformedURLException 
	{
		TouchAction t =new TouchAction(driver);
		WebElement peopleNames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		return t.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release();
			}
	public static AndroidElement dateWidgets(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
	}
	public static AndroidElement inLine(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByAndroidUIAutomator("text(\"2. Inline\")");
	}
	public static AndroidElement timeChange(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//*[@content-desc='9']");
	}
	public static TouchAction swiping(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		TouchAction t = new TouchAction(driver);
		WebElement timer = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement timer1 = driver.findElementByXPath("//*[@content-desc='45']");
		return t.longPress(longPressOptions().withElement(element(timer)).withDuration(ofSeconds(1))).moveTo(element(timer1)).release();
	}
	public static AndroidElement scrolling(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"ImageView\"))");
	}
	public static AndroidElement dragandDrop(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		return driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']");
	}
	public static TouchAction performdragandDrop(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		TouchAction t = new TouchAction(driver);
		WebElement drag = driver.findElementsByClassName("android.view.View").get(0);
		WebElement drop = driver.findElementsByClassName("android.view.View").get(1);
		//return t.longPress(longPressOptions().withElement(element(drag))).moveTo(element(drop)).release();
		return t.longPress(element(drag)).moveTo(element(drop)).release();
	}
	public static void backKey(AndroidDriver<AndroidElement> driver) throws MalformedURLException {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	}

