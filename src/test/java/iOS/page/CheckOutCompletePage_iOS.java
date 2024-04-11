package iOS.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class CheckOutCompletePage_iOS extends BasePage_iOS{
    By titleCheckOut=By.xpath("//XCUIElementTypeStaticText[@name=\"CHECKOUT: OVERVIEW\"]");
//    By BtnFinish=By.xpath("");
    By confirmCheckoutSuccess=By.xpath("//XCUIElementTypeStaticText[@name=\"THANK YOU FOR YOU ORDER\"]");
    By btnBackHome=By.xpath("//XCUIElementTypeOther[@name=\"test-BACK HOME\"]");
    public boolean isOnCheckOutCompletePage(){
        return   driver.findElement(titleCheckOut).isDisplayed();
    }
    public void ClickBtnFinishToCheckout(){
        String text="FINISH";
        String uiautoFind = "UIATarget.localTarget().frontMostApp().mainWindow()" +
                ".scrollViews()[0].cells().firstWithPredicate(\"label = '"+text+"'\")";
        ((IOSDriver<MobileElement>)driver).findElementByIosNsPredicate("label = '"+text+"'").click();
    }
    public void GetmsgWhenCheckoutSuccess(){
        driver.findElement(confirmCheckoutSuccess).isDisplayed();
        System.out.println(driver.findElement(confirmCheckoutSuccess).getText());
    }
    public void ClickBtnBackHome(){
        driver.findElement(btnBackHome).click();
    }
}
