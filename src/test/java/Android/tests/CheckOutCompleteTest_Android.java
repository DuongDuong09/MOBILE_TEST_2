package Android.tests;

import Android.pages.BasePage_Android;
import Android.pages.CheckOutCompletePage_Android;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import utils.JSONfilereader;

import java.io.IOException;

public class CheckOutCompleteTest_Android extends BaseTest_Android{
    CheckOutCompletePage_Android complete=new CheckOutCompletePage_Android();
    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForCheckOutCompletePage.json";

    BasePage_Android base=new BasePage_Android();
    @Test
    public void CheckOutSuccess() throws InterruptedException, IOException {
        String testcaseID="CO001";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile)
                .getTestcaseID()+" "+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        complete.isOnCheckOutCompletePage();
        complete.ClickBtnFinishToCheckout();
        Thread.sleep(3000);
        complete.GetmsgWhenCheckoutSuccess();
        base.takeScreenShot(testcaseID+".png");
        complete.ClickBtnBackHome();
        Thread.sleep(3000);
    }
}
