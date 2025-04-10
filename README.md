# **Mobile Automation with Appium - General Store APK**

This project demonstrates mobile automation using **Appium** for testing the **General Store APK** on an **Android Emulator**. The automation script is written in **Java** and uses **TestNG** as the test framework.

---

## **Prerequisites**

Before running the tests, ensure you have the following installed and configured:

- **Java** (version 8 or later)  
  Download and install Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).<br>

- **Appium**  
  Install Appium via npm:
  ```bash
  npm install -g appium
  ```<br>

- **Android Studio** (or any Android emulator)  
  Download and install Android Studio from [here](https://developer.android.com/studio). Ensure you have an emulator set up and running.<br>

- **Appium Java Client**  
  Add the Appium Java client dependency in your project. If you're using Maven, add the following to your `pom.xml`:
  ```xml
  <dependency>
      <groupId>io.appium</groupId>
      <artifactId>java-client</artifactId>
      <version>8.0.0</version>
  </dependency>
  ```<br>

- **TestNG**  
  Add TestNG dependency in your `pom.xml` (if using Maven):
  ```xml
  <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>7.4.0</version>
      <scope>test</scope>
  </dependency>
  ```<br>

- **Android SDK**  
  Ensure that the Android SDK is properly set up and the environment variable `ANDROID_HOME` is configured.<br>

---

## **Setting Up the Project**

1. **Clone the repository**:  
   Clone the project repository to your local machine by running the following command:
   ```
    git clone <a href="https://github.com/fablihaafia/General_Store_App-Using-Appium-.git">https://github.com/fablihaafia/General_Store_App-Using-Appium-.git</a>
   ```<br>

2. **Ensure the General Store APK is available**:  
   Download the **General Store APK** or place your APK in the root folder of the project. The script expects the APK to be located at `C:/General-Store.apk`.<br>

3. **Emulator Setup**:  
   Ensure you have an Android Emulator running. The script is configured to run on `emulator-5554`, so make sure that matches the emulator's identifier. You can verify this with:
   ```bash
   adb devices
   ```<br>

---

## **Running the Tests**

1. **Start the Appium Server**:  
   Open a terminal and start the Appium server by running:
  
   appium
   <br>

2. **Run the TestNG Tests**:  
   After the Appium server is running, you can run the tests using your IDE or by running the Maven command:
   ```
   mvn test
   ```<br>

   This will execute the automation script and perform the following actions on the General Store APK:
   - Select a country from the dropdown.
   - Enter a name.
   - Select gender.
   - Add an item to the cart.
   - Proceed to checkout.

---

## **Code Breakdown**

### **Test Steps**
The test script performs the following steps:

- **Launch the App**:  
   The APK file is launched on the emulator with the following capabilities:
   - `platformName`: Android
   - `deviceName`: Pixel (can be changed as per the device you are using)
   - `udid`: emulator-5554
   - `app`: Path to the APK file.<br>

- **Interacting with UI Elements**:  
   The script uses the following actions:
   - Click on the country spinner and select a country.
   - Enter text in the name field.
   - Select the gender radio button.
   - Click on the "Lets Shop" button.
   - Add items to the cart.
   - Navigate to the cart.
   - Click checkbox.
   - Click button to visit the website.

---

### **Key Capabilities**:
- **platformName**: Specifies the mobile platform (Android).
- **automationName**: Defines the automation engine to be used, which is `UiAutomator2` in this case.
- **deviceName**: The name of the emulator or device (Pixel).
- **appPackage**: The package name of the app (`com.androidsample.generalstore`).
- **appActivity**: The starting activity of the app (`com.androidsample.generalstore.SplashActivity`).

---

### **Conclusion**:

This test script automates basic interactions with the General Store APK. The script demonstrates how to interact with UI elements, select items, and complete a checkout flow using Appium and Java. By following this approach, you can easily test any mobile application by modifying the elements and actions as needed.
### **Sample Code**:

```java
// Desired Capabilities Setup
DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability("platformName", "Android");
cap.setCapability("udid", "emulator-5554");
cap.setCapability("deviceName", "Pixel");
cap.setCapability("automationName", "UiAutomator2");
cap.setCapability("appPackage","com.androidsample.generalstore");
cap.setCapability("appActivity","com.androidsample.generalstore.SplashActivity");

// Launching the app
AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723"), cap);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Selecting country
driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
Thread.sleep(2000); 
driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1'][3]")).click();
Thread.sleep(2000);

// Entering name and selecting gender
driver.findElement(By.className("android.widget.EditText")).sendKeys("afia");
driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
Thread.sleep(2000);

// Clicking Lets Shop button
driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
Thread.sleep(2000);

// Adding items to cart
List<MobileElement> addToCartButtons = driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart"));
addToCartButtons.get(1).click();
Thread.sleep(2000);

// Navigating to cart and checking out
driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
Thread.sleep(2000);
driver.findElement(By.className("android.widget.CheckBox")).click();
driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
Thread.sleep(2000);

// Quit the driver
driver.quit();



