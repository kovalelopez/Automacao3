package EndToEnd.Amazon.PageObjects.Desktop;

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

    public void validateLoginPO() {
        WebElement element = getElement(driver, By.cssSelector("#a-page > div.a-section.a-padding-medium.auth-workflow > div.a-section.a-spacing-none.auth-navbar > div"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Image not found");
    }

    public void sendValidEmail() {
        elementSendKeys(driver, By.cssSelector("#ap_email"), "alejandrokovaltchuk@gmail.com");
    }

    public void clickContinueBtn() {
        elementClick(driver, By.cssSelector("#continue"));
    }

    public void sendValidPassword() {
        elementSendKeys(driver, By.cssSelector("#ap_password"), "alejandrok90");
    }

    public void clickSignInBtn() {
        elementClick(driver, By.cssSelector("#signInSubmit"));
    }

    public void validateHomeProfile() {
        WebElement element = getElement(driver, By.cssSelector("#nav-logo-sprites"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Image not found");
    }
}
