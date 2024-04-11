package Android.pages;

import org.openqa.selenium.By;

public class YourCartPage_Android extends BasePage_Android{
    By ProductInCart=By.xpath("//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]");
    By CartIcon=By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
    By BtnCheckOut=By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView");
    public void ClickIconCart(){
        driver.findElement(CartIcon).click();
    }
    public boolean CheckAnyProductOnCart(){
        return driver.findElement(ProductInCart).isDisplayed();
    }
    public void ClickBtnCheckOut() throws InterruptedException {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"CHECKOUT\").instance(0))").click(); //scroll down to the element and click
        Thread.sleep(3000);
    }


}
