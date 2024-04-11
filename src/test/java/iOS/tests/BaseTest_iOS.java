package iOS.tests;

import EventListener.TestListener;
import Recordings.ScreenRecording;
import iOS.page.BasePage_iOS;
import iOS.page.LoginPage_iOS;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import report.ExtentReport;
import utils.ExcelFileReader;
import utils.PropertiesFile;

@Listeners({TestListener.class})
public class BaseTest_iOS extends ExtentReport {
    LoginPage_iOS loginPage_iOS = new LoginPage_iOS();
    BasePage_iOS basePage_iOS = new BasePage_iOS();

    ScreenRecording screenRecording=new ScreenRecording();

    ExcelFileReader excel;
    @BeforeTest
    @Parameters({"deviceName", "udid", "platformName", "platformVersion", "app"})
    public void setupDriver(String deviceName, String udid, String platformName, String platformVersion
            , String app) throws Exception {
        PropertiesFile.setPropertiesFile();
        basePage_iOS.setup_driver(deviceName, udid, platformName, platformVersion, app);
//        ScreenRecordingService.startRecording();
        screenRecording.startRecording("iOS_Device");

        reportSetup("target/iOS_report.html");
        Thread.sleep(10000);
    }

    @AfterTest
    public void tearDown() throws Exception {
        screenRecording.stopRecording();;
        reportTeardown();
        basePage_iOS.tearDown();
    }
}
