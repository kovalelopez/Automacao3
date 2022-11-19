package EndToEnd.Amazon.PageObjects.Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.Utils.*;

public class LoginPO {

    WebDriver driver;

    public LoginPO(WebDriver driver) {
        this.driver = driver;
    }

    public void validateLoginPage() {
        WebElement element = getElement(driver, By.cssSelector("#nav-logobar > div.nav-left"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Image not found");
    }

    public void sendValidEmail() {
        elementSendKeys(driver, By.cssSelector("#ap_email_login"), "alejandrokovaltchuk@gmail.com");
    }

    public void clickContinueBtn() {
        elementClick(driver, By.xpath("/html/body/div[1]/div[2]/div[3]/div[2]/div/div[2]/div/div[2]/form/div[3]/div/span/span/input"));
    }

    public void sendValidPassword() {
        elementSendKeys(driver, By.cssSelector("#ap_password"), "alejandrok90");
    }

    public void clickLoginBtn() {
        elementClick(driver, By.cssSelector("#signInSubmit"));
    }

    public void validateHomeProfile() {
        WebElement element = getElement(driver, By.cssSelector("#nav-logobar > div.nav-left"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Image not found");
    }


}
