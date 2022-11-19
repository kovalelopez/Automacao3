package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Utils {

    public static WebElement getElement(WebDriver driver, By by) {
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(by));
        return element;
    }

    public static void elementClick(WebDriver driver, By by) {
        WebElement element = getElement(driver, by);
        element.click();

    }

    public static void elementSendKeys(WebDriver driver, By by, String text) {
        WebElement element = getElement(driver, by);
        element.click();
        element.sendKeys(text);
    }

    public static void refreshPage(WebDriver driver) {
        driver.navigate().refresh();

    }

    public static ChromeOptions responsive(int width, int heigth) {
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", width);
        deviceMetrics.put("height", heigth);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 8.0.0;" +
                "Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML, like Gecko) " +
                "Chrome/67.0.3396.99 Mobile Safari/537.36");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        return chromeOptions;
    }


}
