package BIDV.testcases;

import BIDV.common.BaseTest;
import BIDV.pages.LoginPage;
import BIDV.pages.QuyTrinhMuaSamPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;
    QuyTrinhMuaSamPage quyTrinhMuaSamPage;

    @Test
    public void testLogin() {

        loginPage = new LoginPage(driver);
        quyTrinhMuaSamPage = loginPage.login("Nvien1","VTlamson123!@#");

        quyTrinhMuaSamPage.clickQuyTrinhMuaSam();

    }

}
