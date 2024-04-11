package Android.pages;

import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import utils.MobileAction_Android;

import java.util.List;

public class ProductsPage_Android extends BasePage_Android {
    MobileAction_Android mobileAction=new MobileAction_Android();
    By productPageTitle = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView");
    By btnAddToCart = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView");
    By btnAddToCart2= By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])");

    By btnRemove = By.xpath("//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]/android.widget.TextView");
    By btnDetailProduct = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-Item\"])[1]/android.view.ViewGroup/android.widget.ImageView");
    By getInforProduct = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Description\"]/android.widget.TextView[1]");
    By btnFilter = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By sortByNameAtoZ = By.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.TextView");
    By sortByNameZtoA = By.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
    By sortByPriceLtoH = By.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");
    By sortByPriceHtoL = By.xpath("//android.widget.ScrollView[@content-desc=\"Selector container\"]/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup/android.widget.TextView");
    By titleOfProduct = By.xpath("(//android.widget.TextView[@content-desc=\"test-Item title\"])");

    public void getProductPageTitle() {
        driver.findElement(productPageTitle).isDisplayed();
        System.out.println(driver.findElement(productPageTitle) + " - navigate page success");
        mobileAction.verticalSwipeByPercentages(438,2000,700);
        List<AndroidElement> listOfElements = driver.findElements(titleOfProduct);
        for(AndroidElement element: listOfElements){
            System.out.println(element.getText());
        }
    }

    public void addProductToCart() {
        driver.findElement(btnAddToCart).click();
        driver.findElement(btnAddToCart2).click();
    }

    public void removeProductToCart() {
        driver.findElement(btnRemove).click();
    }

    public void seeDetailProduct() {
        driver.findElement(btnDetailProduct).click();
        System.out.println(driver.findElement(getInforProduct));
    }

    public void clickBtnSort() throws InterruptedException {
        driver.findElement(btnFilter).click();
        Thread.sleep(5000);
    }

    public void sortByNameAtoZ() {
        driver.findElement(sortByNameAtoZ).click();
    }

    public void sortByNameZtoA() {
        driver.findElement(sortByNameZtoA).click();
    }

    public void sortByPriceLtoH() {
        driver.findElement(sortByPriceLtoH).click();
    }

    public void sortByPriceHtoL() {
        driver.findElement(sortByPriceHtoL).click();
    }

    public void verifySortTrue() {
        System.out.println(driver.findElement(titleOfProduct).getText());
    }
}
