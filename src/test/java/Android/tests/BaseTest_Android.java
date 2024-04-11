package Android.tests;

import Android.pages.BasePage_Android;
import Android.pages.LoginPage_Android;
import Recordings.ScreenRecording;
import report.ExtentReport;
import org.testng.annotations.*;
import utils.PropertiesFile;

public class BaseTest_Android extends ExtentReport {
    LoginPage_Android loginPage=new LoginPage_Android();
    BasePage_Android basePage=new BasePage_Android();
 //   ExtentTest test;
ScreenRecording screenRecording=new ScreenRecording();

    @BeforeTest
    @Parameters({"deviceName","udid","platformName","platformVersion","app","appPackage","appActivity"})
    public void setupDriver(String deviceName, String udid, String platformName, String platformVersion
            , String app, String appPackage, String appActivity) throws Exception {
        PropertiesFile.setPropertiesFile();
        basePage.setup_driver(deviceName,udid,platformName,platformVersion,app,appPackage,appActivity);
//        ScreenRecordingService.startRecording();
screenRecording.startRecording("Android_Device");
        reportSetup("target/Android_Report.html");
        Thread.sleep(10000);
    }
    @AfterTest
    public void tearDown() throws Exception {
//        ScreenRecordingService.stopRecording("RECORDING");
        screenRecording.stopRecording();
        reportTeardown();
        basePage.tearDown();
    }
}
