package EndToEnd.Loggi.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static Utils.Utils.*;

public class PackageStatusPO {
    WebDriver driver;

    public PackageStatusPO(WebDriver driver) {
        this.driver = driver;
    }

    public void validateStatusPage() {
        WebElement element = getElement(driver, By.cssSelector("#root > div > div > div > div > div:nth-child(1) > div > div.no-gutter.display-flex.flex-direction-xs-column > span.text-base"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "text not found");
    }
    public void insertCPF(String cpf) {
        elementSendKeys(driver, By.cssSelector("#root > div > div > div > div > div:nth-child(4) > div > div > div > div > div > div > div > div.no-gutter.col-xs-12._2ZHa1CY6QxOiqQXxhVecU1 > input"),cpf);

    }
    public void sendCPF() {
        insertCPF("057.195.813-32");
    }
    public void clickBlueBtn() {
        elementClick(driver, By.cssSelector("#root > div > div > div > div > div:nth-child(4) > div > div > div > button"));
    }

    public void validateDateAndReceiver() {
        WebElement element = getElement(driver, By.cssSelector("#root > div > div.no-gutter.menu-view > div > div:nth-child(2) > div.eta-message.gutter-xs-top-onehalf.gutter-xs-bottom-onehalf"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "text not found");
    }
}

