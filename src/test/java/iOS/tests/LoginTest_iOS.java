package iOS.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ExcelFileReader;
import utils.JSONfilereader;
import utils.PropertiesFile;

import java.io.IOException;

public class LoginTest_iOS extends BaseTest_iOS{
    ExcelFileReader excel=new ExcelFileReader();

    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForLoginPage.json";
    @Test
    @Parameters({"username","password"})
    public void loginSuccess(String username,String password) throws InterruptedException, IOException {
        String testcaseID="LS001";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcaseID()+"_"+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        loginPage_iOS.isOnSignInPage();
        loginPage_iOS.inputUserName(PropertiesFile.getPropValue(username));
        loginPage_iOS.inputPassword(PropertiesFile.getPropValue(password));
        basePage_iOS.takeScreenShot(testcaseID);
        loginPage_iOS.clickLoginBtn();


    }
    @Test
    @Parameters({"incorrectUsername","incorrectPassword"})
    public void loginFailed(String incorrectUsername,String incorrectPassword) throws InterruptedException, IOException {
        String testcaseID="LS002";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcaseID()+"_"+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        loginPage_iOS.isOnSignInPage();
        loginPage_iOS.inputUserName(PropertiesFile.getPropValue(incorrectUsername));
        loginPage_iOS.inputPassword(PropertiesFile.getPropValue(incorrectPassword));
        loginPage_iOS.clickLoginBtn();
        test.log(Status.WARNING,loginPage_iOS.getTextWhenLoginFail());
        basePage_iOS.takeScreenShot(testcaseID);
    }
}
