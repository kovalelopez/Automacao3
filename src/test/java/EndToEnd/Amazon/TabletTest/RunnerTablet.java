package EndToEnd.Amazon.TabletTest;

import EndToEnd.Amazon.PageObjects.Mobile.HomePOMobile;
import EndToEnd.Amazon.PageObjects.Mobile.LoginPO;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static Utils.Utils.responsive;

public class RunnerTablet {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(responsive(768, 800));
        driver.get("https://www.amazon.com.br/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(testName = "Realizar Login - Tablet")
    public void test_mobile_add_item() {
        HomePOMobile homePOMobile = new HomePOMobile(driver);
        homePOMobile.validateHome();
        homePOMobile.clickMenuBtn();
        homePOMobile.clickLoginBtn();
        LoginPO loginPO = new LoginPO(driver);
        loginPO.validateLoginPage();
        loginPO.sendValidEmail();
        loginPO.clickContinueBtn();
        loginPO.sendValidPassword();
        loginPO.clickLoginBtn();
        loginPO.validateHomeProfile();
    }
}
