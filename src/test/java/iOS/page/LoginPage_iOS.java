package iOS.page;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class LoginPage_iOS extends BasePage_iOS{
    By usrname=By.xpath("//XCUIElementTypeTextField[@name=\"test-Username\"]");
    By passw=By.xpath("//XCUIElementTypeSecureTextField[@name=\"test-Password\"]");
    By btnlogin=By.xpath("//XCUIElementTypeOther[@name=\"test-LOGIN\"]");
    By errorMsgText=By.xpath("//XCUIElementTypeStaticText[@name=\"Username and password do not match any user in this service.\"]");
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
    public void clickLoginBtn() throws  InterruptedException {
        driver.findElement(btnlogin).click();
        Thread.sleep(10000);
    }
    public String getTextWhenLoginFail(){
     //   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        return driver.findElement(errorMsgText).getText();

    }
}
