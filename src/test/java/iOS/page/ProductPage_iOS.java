package iOS.page;

import org.openqa.selenium.By;

public class ProductPage_iOS extends BasePage_iOS {
    By productPageTitle = By.xpath("//XCUIElementTypeStaticText[@name=\"PRODUCTS\"]");
    By btnAddToCart = By.xpath("(//XCUIElementTypeOther[@name=\"test-ADD TO CART\"])[1]");
    By btnRemove = By.xpath("//XCUIElementTypeOther[@name=\"test-REMOVE\"]");
    By btnDetailProduct = By.xpath("(//XCUIElementTypeOther[@name=\"\uDB81\uDF41\"])[1]/XCUIElementTypeOther/XCUIElementTypeImage");
    By getInforProduct = By.xpath("//XCUIElementTypeStaticText[@name=\"carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.\"]");
    By btnFilter = By.xpath("//XCUIElementTypeOther[@name=\"test-Modal Selector Button\"]/XCUIElementTypeOther/XCUIElementTypeOther");
    By sortByNameAtoZ = By.xpath("//XCUIElementTypeOther[@name=\"Name (A to Z)\"]");
    By sortByNameZtoA = By.xpath("//XCUIElementTypeOther[@name=\"Name (Z to A)\"]");
    By sortByPriceLtoH = By.xpath("//XCUIElementTypeOther[@name=\"Price (low to high)\"]");
    By sortByPriceHtoL = By.xpath("(//XCUIElementTypeOther[@name=\"Horizontal scroll bar, 1 page\"])[2]");
    By titleOfProduct = By.xpath("(//XCUIElementTypeStaticText[@name=\"test-Item title\"])[1]");

    public void getProductPageTitle() {
        driver.findElement(productPageTitle).isDisplayed();
        System.out.println(driver.findElement(productPageTitle) + " - navigate page success");
    }

    public void addProductToCart() {
        driver.findElement(btnAddToCart).click();
        driver.findElement(btnAddToCart).click();
        driver.findElement(btnAddToCart).click();

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
