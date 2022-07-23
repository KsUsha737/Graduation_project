package Ui.pages;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class HomePage {
    ElementsCollection elements;

    @Step("элементы списка APPS")
    public void appNavBar() {
        elements = $$(By.xpath("//div[@class='al-menu-dropdown-list']/one-app-launcher-menu-item"));
    }

    @Step("переход на страницу из списка APPS")
    public HomePage appNavBar(By locator) {
                elements.get(1).click();
        return new HomePage();
    }
}









