package Android.pages;

import com.aventstack.extentreports.model.Media;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class BasePage_Android {
    public static AndroidDriver driver;

    public AndroidDriver setup_driver(String deviceName, String udid, String platformName, String platformVersion
            , String app, String appPackage, String appActivity) throws Exception {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", deviceName);
        cap.setCapability("udid", udid);
        cap.setCapability("platformName", platformName);
        cap.setCapability("platformVersion", platformVersion);
        cap.setCapability("app", app);
        cap.setCapability("appPackage", appPackage);
        cap.setCapability("appActivity", appActivity);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        System.out.println("Application stated...");
        return driver;
    }

    public void tearDown() {
        driver.quit();
    }
    public void takeScreenShot(String picName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Android.Picture/";
        FileUtils.copyFile(screenshot, new File(screenshotPath+picName));

    }
}

//cap.setCapability("deviceName","sdk_gphone64_arm64");
//        cap.setCapability("udid", "emulator-5554");
//        cap.setCapability("platformName", "Android");
//        cap.setCapability("platformVersion","14");
//        cap.setCapability("app","/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/resources/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
//        cap.setCapability("appPackage", "com.swaglabsmobileapp");
//        cap.setCapability("appActivity", "com.swaglabsmobileapp.MainActivity");
//}
