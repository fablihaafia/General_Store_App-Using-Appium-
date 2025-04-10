
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import java.util.List;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AutoGeneralStoreAPK {

    @Test
    public void testGeneral() throws MalformedURLException, InterruptedException {
        // Set up desired capabilities

    	File f = new File("C:\\");
    	File fs = new File(f,"General-Store.apk");
    	
    	 System.out.println("APK path: " + fs.getAbsolutePath());
    	 
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("udid", "emulator-5554"); // Ensure the emulator's UDID is correct
        cap.setCapability("deviceName", "Pixel"); // You can change this to a more specific device name if needed
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage"," com.androidsample.generalstore"); // Correct app package name
        cap.setCapability("appActivity","com.androidsample.generalstore.SplashActivity"); // Ensure correct activity
      
        cap.setCapability("app",fs.getAbsolutePath());
        // Initialize AndroidDriver
        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1'][3]")).click();
        Thread.sleep(2000); 
        driver.findElement(By.className("android.widget.EditText")).sendKeys("afia");
     
       
        Thread.sleep(2000); 
        driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
     
        
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
       
        Thread.sleep(2000);
        List<MobileElement> addToCartButtons = driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart"));
        addToCartButtons.get(1).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("android.widget.CheckBox")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
        Thread.sleep(2000);

        driver.quit();
    }
}
