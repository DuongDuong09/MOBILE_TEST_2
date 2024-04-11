package Android.tests;

import Android.pages.BasePage_Android;
import Android.pages.CheckOutInforPage_Android;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import utils.JSONfilereader;

import java.io.IOException;

public class CheckOutInforTest_Android extends BaseTest_Android{
    CheckOutInforPage_Android infor=new CheckOutInforPage_Android();
    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForCheckOutInforPage.json";

    BasePage_Android base=new BasePage_Android();
    @Test
    public void EnterAllInformValid() throws InterruptedException, IOException {
        String testcaseID="CI001";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile)
                .getTestcaseID()+" "+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        infor.isOnCheckOutInforPage();
        infor.enterFirstName();
        infor.enterLastName();
        infor.enterZipCode();
        base.takeScreenShot(testcaseID+".png");
        infor.ClickBtnContinue();
        Thread.sleep(3000);
    }
}
