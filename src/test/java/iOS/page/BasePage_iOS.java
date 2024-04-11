package iOS.page;

import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BasePage_iOS {
    public static IOSDriver driver;
    public static final Logger logger= LogManager.getLogger(BasePage_iOS.class);
    public IOSDriver setup_driver(String deviceName,String udid, String platformName,String platformVersion,String app){
        System.out.println("start");
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("udid",udid);
        cap.setCapability("platformName",platformName);
        cap.setCapability("platformVersion",platformVersion);
        cap.setCapability("deviceName", deviceName);
        cap.setCapability("app",app
        );

        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver=new IOSDriver(url,cap);
        return driver;
    }
    public void tearDown(){
        driver.quit();
    }
    public void takeScreenShot(String picName) throws IOException {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/iOS/Picture";
        FileUtils.copyFile(screenshot, new File(screenshotPath+picName));

    }
}
