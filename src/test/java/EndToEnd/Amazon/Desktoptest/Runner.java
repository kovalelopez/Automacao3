package EndToEnd.Amazon.Desktoptest;

import EndToEnd.Amazon.PageObjects.Desktop.HomePO;
import EndToEnd.Amazon.PageObjects.Desktop.LoginPO;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1280, 800));
        driver.get("https://www.amazon.com.br/ref=ap_frn_logo");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(testName = "Realizar login Desktop")
    public void test_desktop_add_item() {
        HomePO homePO = new HomePO(driver);
        homePO.validateHome();
        homePO.clickLoginBtn();
        LoginPO loginPO = new LoginPO(driver);
        loginPO.validateLoginPO();
        loginPO.sendValidEmail();
        loginPO.clickContinueBtn();
        loginPO.sendValidPassword();
        loginPO.clickSignInBtn();
        loginPO.validateHomeProfile();

    }



    @Test(testName = "Validar adição de item em carrinho - tablet")
    public void test_tablet_add_item() {
        driver.manage().window().setSize(new Dimension(768, 800));
    }

}
