package iOS.tests;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import iOS.page.ProductPage_iOS;
import org.testng.annotations.Test;
import utils.JSONfilereader;

import java.io.IOException;

public class ProductTest_iOS extends BaseTest_iOS {
    ProductPage_iOS productsPage = new ProductPage_iOS();
//    String TCIDaddProduct="PP001";
//    String TCIDremoveProduct="PP003";
//    String TCIDsoftAtoZ="PP004";

    String pathJsonFile="/Users/duongduong/IdeaProjects/MOBILE_TEST/src/test/java/Testcase/TestcaseForProductPage.json";
    @Test(priority = 1)
    public void AddSomeProductToCart() throws IOException {
        String testcaseID="PP001";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcaseID()+"_"+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        productsPage.addProductToCart();
        basePage_iOS.takeScreenShot(testcaseID+".png");

    }
    @Test(priority = 2)
    public void RemoveSomeProduct() throws IOException {
        String testcaseID="PP003";
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcaseID()+"_"+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        test.fail(MediaEntityBuilder.createScreenCaptureFromPath("img.png").build());
        productsPage.removeProductToCart();
        basePage_iOS.takeScreenShot(testcaseID+".png");

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
        ExtentTest test=extent.createTest(JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcaseID()+"_"+JSONfilereader.getTestcase(testcaseID,pathJsonFile).getScenario());
        test.log(Status.INFO, JSONfilereader.getTestcase(testcaseID,pathJsonFile).getTestcasename());
        productsPage.clickBtnSort();
        productsPage.sortByNameAtoZ();
        productsPage.verifySortTrue();
        basePage_iOS.takeScreenShot(testcaseID+".png");

    }
}
