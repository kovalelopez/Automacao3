package EndToEnd.Amazon.PageObjects.Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.Utils.elementClick;
import static Utils.Utils.getElement;

public class HomePOMobile {

    WebDriver driver;

    public HomePOMobile(WebDriver driver) {
        this.driver = driver;
    }

    public void validateHome() {
        WebElement element = getElement(driver, By.cssSelector("#nav-logo-sprites"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Image not found");
    }

    public void clickMenuBtn() {
        elementClick(driver, By.cssSelector("#nav-hamburger-menu > i"));
    }

    public void clickLoginBtn() {
        elementClick(driver, By.cssSelector("#hmenu-header-account-text"));
    }

}
