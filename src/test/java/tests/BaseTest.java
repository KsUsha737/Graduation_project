package tests;

import lombok.extern.log4j.Log4j2;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import utils.SelenideConfiguration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
@Log4j2
@Listeners(TestListener.class)
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
