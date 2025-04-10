//package mobile_Automation_First;
//
//import java.net.MalformedURLException;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.android.AndroidDriver;
//
//public class first_mobile_automation {
//
//	@Test
//	public void testGeneralStore() throws MalformedURLException, InterruptedException {
//		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("platformName", "android");
//		cap.setCapability("udid", "emulator-5554");
//		cap.setCapability("deviceName", " Pie");
//		cap.setCapability("appPackages", "com.google.android.dialer");
//		cap.setCapability("appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
//		
//		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URl ("http://127.0.0.1:4723/wd/hub"),cap);
//		
//		Thread.sleep(5000);
//
//	}
//
//}

package mobile_Automation_First;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL; // Import the URL class
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement; // Import MobileElement if you're going to interact with elements

public class FirstMobileAutomation {

	@Test
    public void testGeneralStore() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceName", "Pie"); // Consider changing to a more specific device name
        cap.setCapability("appPackage", "com.google.android.dialer"); // Correct the capability key
        cap.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity"); // Ensure this is the correct activity

        // Initialize the driver
//        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        
        Thread.sleep(5000);
        
        // Additional test code here

        // Quit the driver
        driver.quit(); // Make sure to quit the driver at the end
    }

}
