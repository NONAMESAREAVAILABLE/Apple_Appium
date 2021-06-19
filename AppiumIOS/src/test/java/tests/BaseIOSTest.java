package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseIOSTest {
	
	//public static IOSDriver<IOSElement> driver;


		// TODO Auto-generated method stub
		
	public static IOSDriver<IOSElement> driver;
		
		public static IOSDriver<IOSElement> Desired() throws MalformedURLException {
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.3");
		    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8");  //Device name should be clear and case sensitive
		    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);   //	Very Important	
		    //IOS_XCUI_TEST  - Framework provided by Apple to test their app
		    cap.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000); //Amount of time in ms to wait for instruments before assuming it hung and failing the session
		    cap.setCapability("commandTimeout", 12000); //Time waited by appium to execute the next command after a command has been executed. Appium guys have suggested the time as 12 seconds
		    
		    cap.setCapability(MobileCapabilityType.APP, "/Users/admin/Desktop/UIKitCatalog.app");  //MANDATORY
		    
		    
		    URL url = new URL("http://127.0.0.1:4723/wd/hub");
		    
		    driver = new IOSDriver<IOSElement>(url, cap);
		    
		    return driver;
	    
	}

}
