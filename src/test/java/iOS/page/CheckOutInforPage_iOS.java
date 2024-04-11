package iOS.page;

import org.openqa.selenium.By;

public class CheckOutInforPage_iOS extends BasePage_iOS{
    By firstName=By.xpath("//XCUIElementTypeTextField[@name=\"test-First Name\"]");
    By lastName=By.xpath("//XCUIElementTypeTextField[@name=\"test-Last Name\"]");
    By zipCode=By.xpath("//XCUIElementTypeTextField[@name=\"test-Zip/Postal Code\"]");
    By btnContinue=By.xpath("//XCUIElementTypeOther[@name=\"test-CONTINUE\"]");

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
