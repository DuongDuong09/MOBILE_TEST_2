package Android.pages;

import org.openqa.selenium.By;

public class LoginPage_Android extends BasePage_Android {
    By usrname=By.xpath("//android.widget.EditText[@content-desc='test-Username']");
    By passw=By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]");
    By btnlogin=By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]");
    By errorMsgText=By.xpath("//android.view.ViewGroup[@content-desc=\"test-Error message\"]/android.widget.TextView");
    public void isOnSignInPage(){
    if( driver.findElement(usrname).isDisplayed())
        System.out.println("open app success");
}
public void inputUserName(String username){
    driver.findElement(usrname).sendKeys(username);
}
public void inputPassword(String password){
        driver.findElement(passw).sendKeys(password);
    }
    public void clickLoginBtn() throws InterruptedException {
        driver.findElement(btnlogin).click();
        Thread.sleep(10000);
    }
    public void getTextWhenLoginFail(){
        if (driver.findElement(errorMsgText).isDisplayed())
        System.out.println(driver.findElement(errorMsgText).getText());
        else System.out.println("Login successful");
    }

}
