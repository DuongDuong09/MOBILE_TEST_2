package iOS.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

public class YourCartPage_iOS extends BasePage_iOS{
    By ProductInCart=By.name("REMOVE");
    By CartIcon=By.xpath("(//XCUIElementTypeOther[@name=\"3\"])[4]");
   // By BtnCheckOut=By.xpath("//android.view.ViewGroup[@content-desc=\"test-CHECKOUT\"]/android.widget.TextView");
    public void ClickIconCart(){
        driver.findElement(CartIcon).click();
    }
    public boolean CheckAnyProductOnCart(){
        return driver.findElement(ProductInCart).isDisplayed();
    }
    public void ClickBtnCheckOut() throws InterruptedException {
        String text="CHECKOUT";
        String uiautoFind = "UIATarget.localTarget().frontMostApp().mainWindow()" +
                ".scrollViews()[0].cells().firstWithPredicate(\"label = '"+text+"'\")";
        ((IOSDriver<MobileElement>)driver).findElementByIosNsPredicate("label = '"+text+"'").click();
//        ((IOSDriver<MobileElement>)driver).executeScript(uiautoFind + ".scrollToVisible();");
        Thread.sleep(3000);
    }
}
