package Ui.pages.accountsPage.elements.pageTools;

import Ui.conctants.enums.accountsPage.PageToolEnum;
import Ui.pages.newAccountPage.NewAccountPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$$;

/**
 * инструменты правого меню страницы
 * создан лист кнопок правого меню ("New" и "Import" и др.)
 * действителен для исех страниц AppNavBar
 */
public class PageTools {
    private List<PageTool> pageTools;

    public PageTools() {
        ElementsCollection rightMenuButtons = $$(By.xpath("//div[contains(@class,'slds-page-header--object-home')]//div[contains(@class,'slds-col')]//li[@class='slds-button slds-button--neutral']"));
        for (SelenideElement el : rightMenuButtons) {
            if (Objects.isNull(pageTools)) {
                pageTools = new ArrayList<>();
            }
            pageTools.add(new PageTool(el));
        }
    }

    @Step("Переход на форму для создания нового аккаунта")
    public NewAccountPage goToNewAccountPage() {
        NewAccountPage newAccountsPage = null;
        for (PageTool el : pageTools) {
            if (el.getText().equals(PageToolEnum.NEW.getText())) {
                el.click();
                newAccountsPage = new NewAccountPage();
            }
        }
        return newAccountsPage;
    }

}