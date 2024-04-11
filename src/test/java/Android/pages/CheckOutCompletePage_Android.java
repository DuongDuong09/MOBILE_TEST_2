package Android.pages;

import org.openqa.selenium.By;

public class CheckOutCompletePage_Android extends BasePage_Android{
    By titleCheckOut=By.xpath("//*[contains(@text,'CHECKOUT: OVERVIEW')]");
    By BtnFinish=By.xpath("//android.view.ViewGroup[@content-desc=\"test-FINISH\"]/android.widget.TextView");
   By confirmCheckoutSuccess=By.xpath("//*[contains(@text,'THANK YOU FOR YOU ORDER')]");
    By btnBackHome=By.xpath("//android.view.ViewGroup[@content-desc=\"test-BACK HOME\"]/android.widget.TextView");
   public boolean isOnCheckOutCompletePage(){
      return   driver.findElement(titleCheckOut).isDisplayed();
    }
    public void ClickBtnFinishToCheckout(){
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"FINISH\").instance(0))").click(); //scroll down to the element and click

    }
    public void GetmsgWhenCheckoutSuccess(){
       driver.findElement(confirmCheckoutSuccess).isDisplayed();
        System.out.println(driver.findElement(confirmCheckoutSuccess).getText());
    }
    public void ClickBtnBackHome(){
       driver.findElement(btnBackHome).click();
    }
}
