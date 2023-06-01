package BIDV.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuyTrinhMuaSamPage {

    private By buttonQuyTrinhMuaSam = By.xpath("//span[contains(text(),'Quy trình mua sắm')]");



    private WebDriver driver;
    public QuyTrinhMuaSamPage(WebDriver _driver) {
        driver = _driver;
    }

    public void clickQuyTrinhMuaSam() {
        driver.findElement(buttonQuyTrinhMuaSam).click();
    }






}
