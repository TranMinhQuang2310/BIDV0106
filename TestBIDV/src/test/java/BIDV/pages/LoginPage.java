package BIDV.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private String URL = "https://bidvdpmuat.vuthao.com";

    private By inputEmail = By.xpath("//input[@id='ctl00_PlaceHolderMain_signInControl_UserName']");
    private By inputPassword = By.xpath("//input[@id='ctl00_PlaceHolderMain_signInControl_password']");

    private By buttonLogin = By.xpath("//input[@id='ctl00_PlaceHolderMain_signInControl_login']");



    private WebDriver driver;
    public LoginPage(WebDriver _driver) {
        driver = _driver;
    }

    public void enterEmail(String email) {
        driver.findElement(inputEmail).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void enterLogin() {
        driver.findElement(buttonLogin).click();
    }

    public QuyTrinhMuaSamPage login(String email,String password) {
        driver.get(URL);
        enterEmail(email);
        enterPassword(password);
        enterLogin();

        return new QuyTrinhMuaSamPage(driver);
    }

}
