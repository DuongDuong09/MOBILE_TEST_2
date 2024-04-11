package Android.tests;

import Android.pages.BasePage_Android;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;
import Android.pages.ProductsPage_Android;
import utils.JSONfilereader;

import java.io.IOException;

public class ProductsTest_Android extends BaseTest_Android {
    BasePage_Android base=new BasePage_Android();
    ProductsPage_Android productsPage=new ProductsPage_Android();
String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForProductPage.json";
    @Test
public void VerifyProductPage(){
        productsPage.getProductPageTitle();
    }

@Test(priority = 1)
    public void AddSomeProductToCart() throws IOException {
        String testcaseID="PP001";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile)
                .getTestcaseID()+" "+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        productsPage.addProductToCart();
        base.takeScreenShot(testcaseID+".png");

    }
    @Test(priority = 2)
    public void RemoveSomeProduct() throws IOException {
        String testcaseID="PP003";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile)
                .getTestcaseID()+" "+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
//        test.fail(base.takeScreenShot(testcaseID));
                test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
        test.fail("details").addScreenCaptureFromPath("screenshot.png");
//        test.log(Status.INFO, (Markup) base.takeScreenShot(testcaseID+".png"));

        productsPage.removeProductToCart();
        base.takeScreenShot(testcaseID+".png");

    }
//    @Test(priority = 3)
//    public void SeeInforProduct(){
////       test=extent.createTest("confirm test");
////        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
//        test.fail("details").addScreenCaptureFromPath("screenshot.png");
//
//        productsPage.seeDetailProduct();
//    }
    @Test
    public void sortProduct() throws InterruptedException, IOException {
        String testcaseID="PP004";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile)
                .getTestcaseID()+" "+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        productsPage.clickBtnSort();
        productsPage.sortByNameAtoZ();
        productsPage.verifySortTrue();
        base.takeScreenShot(testcaseID+".png");

    }
}
