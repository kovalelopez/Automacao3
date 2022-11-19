package EndToEnd.Amazon.PageObjects.Desktop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;

import static Utils.Utils.elementClick;
import static Utils.Utils.getElement;

public class HomePO {

    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void validateHome() {
        WebElement element = getElement(driver, By.cssSelector("#nav-logo-sprites"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Image not found");

    }

    public void clickLoginBtn() {
        elementClick(driver, By.cssSelector("#nav-link-accountList"));
    }
}
