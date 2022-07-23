package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.SelenideConfiguration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        SelenideConfiguration.Configure();
        open("");
    }

    @AfterMethod
    public void close(){
        closeWebDriver();
    }
}
