//
//import java.net.MalformedURLException;
//import java.net.URL;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;
//
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
////import io.appium.java_client.MobileElement;
//
//public class automation_mobile {
//
//	@Test
//	public void testGenerated () throws MalformedURLException, InterruptedException {
//		DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("udid", "emulator-5554");
//        cap.setCapability("deviceName", "Pie"); // Consider changing to a more specific device name
//        cap.setCapability("appPackage", "com.google.android.dialer"); // Correct the capability key
//        cap.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity"); // Ensure this is the correct activity
//        URL serverUrl;
//         try {
//        serverUrl= new URL("http://localhost:4723/wd/hub");
//         }catch (MalformedURLException ex){
//        throw new RuntimeException(ex);
//        }
//        // Initialize the driver
//        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(serverUrl, desiredCapabilities);
//        
////        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
//        
//        Thread.sleep(5000);
//        
//        // Additional test code here
//
//        // Quit the driver
//        
//	}
//}


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class automation_mobile {

   @Test
public void testGenerated() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("deviceName", "Pie"); // Consider changing to a more specific device name
        cap.setCapability("appPackage", "com.google.android.dialer"); // Correct the capability key
        cap.setCapability("appActivity", "com.google.android.dialer.extensions.GoogleDialtactsActivity"); // Ensure this is the correct activity
        
//        URL serverUrl;
//        try {
//            serverUrl = new URL("http://localhost:4723/wd/hub");
//        } catch (MalformedURLException ex) {
//            throw new RuntimeException(ex);
//        }

        // Initialize the driver
//        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(serverUrl, cap);
        URL serverUrl = new URL("http://localhost:4723/wd/hub");

        // Initialize the driver
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(serverUrl, cap);

        Thread.sleep(5000);
        
        // Additional test code here

        // Quit the driver
        // Make sure to quit the driver to clean up resources
    }
}
