package tests;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ScrollTest extends BaseIOSTest{
	


	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		IOSDriver<IOSElement> drivers = Desired();
		
		HashMap<String, Object> scrollObject = new HashMap<>();
		scrollObject.put("direction", "down");
		scrollObject.put("label", "Web View");  //when name was used as argument then it was scrolling down endlessly.
		
		// executeScript is a method provided by the appium to execute the JavaScript command. It takes the Script and one argument of type HashMap..
		//mobile:scroll is a javascript function provided by apple to scroll items 
		//drivers.executeScript("mobile:scroll", scrollObject);
		System.out.println(drivers.executeScript("mobile:scroll", scrollObject));
		//Here direction of line 18 and label of line 19 are arguments.
		drivers.findElementByAccessibilityId("Web View").click();
      
		// PICKER WHEELS AUTOMATION CODE
		Thread.sleep(5000);
		drivers.findElement(By.xpath("//XCUIElementTypeButton[contains(@name, 'UIKitCatalog')]")).click();
        
		drivers.findElementByAccessibilityId("Picker View").click();
		Thread.sleep(5000);
		drivers.findElementByAccessibilityId("Red color component value").setValue("0");  // Take care of values of picker because this picker has values in the multiples of five.
		Thread.sleep(5000);
		drivers.findElementByAccessibilityId("Green color component value").sendKeys("10");
		Thread.sleep(5000);
		drivers.findElementByAccessibilityId("Blue color component value").sendKeys("20");
		
		System.out.println(drivers.findElementByAccessibilityId("Red color component value").getAttribute("value"));
		System.out.println(drivers.findElementByAccessibilityId("Green color component value").getAttribute("value"));
		System.out.println(drivers.findElementByAccessibilityId("Blue color component value").getAttribute("value"));
		//drivers.quit();
	}
}
