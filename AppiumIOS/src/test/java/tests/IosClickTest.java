package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IosClickTest extends BaseIOSTest  {



	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		IOSDriver<IOSElement> drivero = Desired();

		drivero.findElementByAccessibilityId("Alert Views").click();
		drivero.findElementByAccessibilityId("Text Entry").click();
		System.out.println("Done1");
		drivero.findElement(By.xpath("//XCUIElementTypeTextField")).sendKeys("Hello World");  //In Xpath you can also use just the tag name
		// In the appium desktop inspector if you can send keys to any text box using Appium Desktop then that element is accessible using that tag name or that tag properties
		System.out.println("Done2");
		drivero.findElement(By.name("OK")).click();
		drivero.findElementByAccessibilityId("Confirm / Cancel").click();

		String text = drivero.findElement(By.xpath("//XCUIElementTypeStaticText[contains(@name, 'message')]")).getText(); //getText returns a string

		System.out.println(text);

		drivero.findElementByAccessibilityId("Confirm").click();
		System.out.println("Done till here");
		drivero.findElement(By.name("UIKitCatalog")).click();
		Thread.sleep(7000);





	}

}
