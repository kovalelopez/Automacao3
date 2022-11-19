package EndToEnd.Google.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import javax.swing.text.Element;

import static Utils.Utils.elementClick;
import static Utils.Utils.getElement;

public class HomePO {
    WebDriver driver;

    public HomePO(WebDriver driver) {

        this.driver = driver;
    }

    public void validateHome() {

        WebElement element = getElement(driver, By.cssSelector("#__next > section.style__Section-sc-mv9llo-0.lbzTtt > div.GridPattern-sc-x2w6i8-0.style__HeroGrid-sc-mv9llo-1.hTLRlO.hBLfvX > div.style__ButtonContainer-sc-mv9llo-4.dEJIfl.appear > a:nth-child(2) > button"));
        boolean validate = element.isDisplayed();
        Assert.assertTrue(validate, "imagem não encontrada");
    }

    public void closePopUpBtn() {
        elementClick(driver, By.cssSelector("#__next > div > a > div > div.style__CloseButton-sc-aoav66-5.dRPVET"));
    }
    public void clickTrackPackageBtn() {
        elementClick(driver, By.cssSelector("#__next > section.style__Section-sc-mv9llo-0.lbzTtt > div.GridPattern-sc-x2w6i8-0.style__HeroGrid-sc-mv9llo-1.hTLRlO.hBLfvX > div.style__ButtonContainer-sc-mv9llo-4.dEJIfl.appear > a:nth-child(2) > button"));


    }



}
