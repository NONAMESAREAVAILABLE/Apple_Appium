package tests;

import java.net.MalformedURLException;
import java.util.HashMap;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ScrollTest extends BaseIOSTest{
	


	public static void main(String args[]) throws MalformedURLException
	{
		IOSDriver<IOSElement> drivers = Desired();
		
		HashMap<String, Object> scrollObject = new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "Web View");
		
		// executeScript is a method provided by the appium to execute the JavaScript command. It takes the Script and one argument of type HashMap..
		//mobile:scroll is a javascript function provided by apple to scroll items 
		//drivers.executeScript("mobile:scroll", scrollObject);
		System.out.println(drivers.executeScript("mobile:scroll", scrollObject));
		//Here direction of line 18 and label of line 19 are arguments.
		drivers.findElementByAccessibilityId("Web View").click();
		
		//drivers.quit();
	}
}
