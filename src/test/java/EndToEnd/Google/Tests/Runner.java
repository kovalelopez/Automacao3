package EndToEnd.Google.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver\\", "C:\\Users\\Carol\\Desktop\\Ale\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com.br/");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();

    }

    @Test (testName = "Efetuar busca digitando Selenium WebDriver usando o botão \"ENTER\"")
    public void test_01() {

    }

    @Test(testName = "Efetuar busca digitando Selenium WebDriver usando o botão de busca")
    public void test_02() {

    }

    @Test(testName = "Efetuar busca digitando Selenium WebDriver usando o botão \"estou com sorte\"")
    public void test_03() {

    }

    @Test(testName = "Efetuar busca sem inserir valor usando o botão de busca")
    public void test_04() {

    }

    @Test(testName = "Efetuar busca sem inserir valor usando o botão \"ENTER\"")
    public void test_05() {

    }

    @Test(testName = "Efetuar busca sem inserir valor usando o botão \"estou com sorte\"")
    public void test_06() {

    }
}
