package Android.pages;

import org.openqa.selenium.By;

public class CheckOutInforPage_Android extends BasePage_Android{
    By firstName=By.xpath("//android.widget.EditText[@content-desc=\"test-First Name\"]");
    By lastName=By.xpath("//android.widget.EditText[@content-desc=\"test-Last Name\"]");
    By zipCode=By.xpath("//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]");
    By btnContinue=By.xpath("//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]/android.widget.TextView");

    public boolean isOnCheckOutInforPage(){
        return driver.findElement(firstName).isDisplayed();
    }
    public void enterFirstName(){
        driver.findElement(firstName).sendKeys("Duong");
    }
    public void enterLastName(){
        driver.findElement(lastName).sendKeys("Nguyen");
    }
    public void enterZipCode(){
        driver.findElement(zipCode).sendKeys("123456");
    }
    public void ClickBtnContinue(){
        driver.findElement(btnContinue).click();
    }
}
