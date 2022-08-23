package tests.UI;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
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
        Configuration.screenshots = true;

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
                .includeSelenideSteps(false)
        );

        SelenideConfiguration.Configure();
        open("");
    }

    @AfterMethod
    public void close() {
        closeWebDriver();
    }
}
