package iOS.tests;

import Android.pages.BasePage_Android;
import Android.pages.YourCartPage_Android;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import iOS.page.BasePage_iOS;
import iOS.page.YourCartPage_iOS;
import org.testng.annotations.Test;
import utils.JSONfilereader;

import java.io.IOException;

public class YourCartTest_iOS extends  BaseTest_iOS{
    YourCartPage_iOS cart=new YourCartPage_iOS();
    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForCartPage.json";

    BasePage_iOS base=new BasePage_iOS();

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
