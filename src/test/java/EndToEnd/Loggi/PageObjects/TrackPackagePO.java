package EndToEnd.Loggi.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.Utils.*;

public class TrackPackagePO {
    WebDriver driver;

    public TrackPackagePO(WebDriver driver) {
        this.driver = driver;
    }

    public void validateTrackingPage() {
        WebElement element = getElement(driver, By.cssSelector("#root > div > div > div.no-gutter.col-xs-11 > div.gutter-xs-bottom-normal > h1"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "element not found");
    }

    public void sendTrackingCode(String code) {
        elementSendKeys(driver, By.cssSelector("#root > div > div > div.no-gutter.display-flex.flex-direction-xs-column.align-items-xs-center > div.col-xs-12.gutter-xs-bottom-onehalf > div > div > div.no-gutter.col-xs-12._2ZHa1CY6QxOiqQXxhVecU1 > input"), code);

    }

    public void clickTrackingOrder() {
        elementClick(driver, By.cssSelector("#root > div > div > div.no-gutter.display-flex.flex-direction-xs-column.align-items-xs-center > div.no-gutter.col-xs-12.col-md-7.col-lg-6.col-xl-6.col-xxl-6 > button"));

    }

    public void validateTextInvalidCode() {
        WebElement element = getElement(driver, By.cssSelector("#root > div > div > div.no-gutter.display-flex.flex-direction-xs-column.align-items-xs-center > div.col-xs-12.gutter-xs-bottom-onehalf > div > div > div.no-gutter.col-xs-12.n0v0JyoYkOdiQu-pfwgw7 > div > div > div:nth-child(2) > div"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "text not found");
    }
}
