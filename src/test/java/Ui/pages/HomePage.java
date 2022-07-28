package Ui.pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
@Log4j2
public class HomePage {
    ElementsCollection elements;

    @Step("list items APPS on the Номе page")
    public void appNavBar() {
        log.info("search for all elements on the page APPS");
        elements = $$(By.xpath("//div[@class='al-menu-dropdown-list']/one-app-launcher-menu-item"));
    }

    @Step("go to software package Sales")
    public HomePage appNavBar(By locator) {
        log.info("go to software package Sale");
                elements.get(1).click();
        return new HomePage();
    }
}