package EndToEnd.Loggi.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePO {

    WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
    }

    public void validateHome() {
        WebElement element = driver.findElement(By.cssSelector("#__next > header > div.style__Container-sc-14ctwde-0.ATVwc > div.style__TopBar-sc-14ctwde-1.gQvJtx > div.style__ImageWrapper-sc-14ctwde-2.dDAkmR > a > svg"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "Imagem não encontrada");
    }
}
