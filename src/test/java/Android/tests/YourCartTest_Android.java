package Android.tests;

import Android.pages.BasePage_Android;
import Android.pages.YourCartPage_Android;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import utils.JSONfilereader;

import java.io.IOException;

public class YourCartTest_Android extends BaseTest_Android{

    YourCartPage_Android cart=new YourCartPage_Android();
    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForCartPage.json";

    BasePage_Android base=new BasePage_Android();

    @Test
    public void MoveonToCheckOutPage() throws InterruptedException, IOException {
        String testcaseID="YC003";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile)
                .getTestcaseID()+" "+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        cart.ClickIconCart();
        cart.CheckAnyProductOnCart();
        cart.ClickBtnCheckOut();
        base.takeScreenShot(testcaseID+".png");
    }
}
