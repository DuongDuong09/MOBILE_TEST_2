package iOS.tests;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import iOS.page.BasePage_iOS;
import iOS.page.CheckOutCompletePage_iOS;
import org.testng.annotations.Test;
import utils.JSONfilereader;

import java.io.IOException;

public class CheckOutCompleteTest_iOS extends BaseTest_iOS{
    CheckOutCompletePage_iOS complete=new CheckOutCompletePage_iOS();
    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForCheckOutCompletePage.json";

    BasePage_iOS base=new BasePage_iOS();
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
