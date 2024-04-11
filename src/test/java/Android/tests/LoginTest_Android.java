package Android.tests;


import Android.pages.BasePage_Android;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.JSONfilereader;
import utils.PropertiesFile;

import java.io.IOException;

public class LoginTest_Android extends BaseTest_Android {
    BasePage_Android base=new BasePage_Android();
    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForLoginPage.json";
    @Test
    @Parameters({"username","password"})
    public void loginSuccess(String username,String password) throws InterruptedException, IOException {
        String testcaseID="LS001";
      ExtentTest   test=extent.createTest((JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcaseID()+"_"+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario()));
       test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        loginPage.isOnSignInPage();
        loginPage.inputUserName(PropertiesFile.getPropValue(username));
        loginPage.inputPassword(PropertiesFile.getPropValue(password));
        loginPage.clickLoginBtn();
        base.takeScreenShot(testcaseID+".png");

    }
}
