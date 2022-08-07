package Ui.pages.accountsPage.elements.tablePage;

import Ui.pages.accountsPage.AccountsPage;
import Ui.wrapers.Button;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * account options
 */
public class AccountActions {
    private SelenideElement edit;
    private SelenideElement delete;
    private SelenideElement changeOwner;

    public AccountActions() {
        edit = $(By.xpath("//div[contains(@class,'branding-actions actionMenu popupTargetContainer') and contains(@class, 'visible positioned')]//li[@class='uiMenuItem']/a[@title='Edit']"));
        delete = $(By.xpath("//div[contains(@class,'branding-actions actionMenu popupTargetContainer') and contains(@class, 'visible positioned')]//li[@class='uiMenuItem']/a[@title='Delete']"));
        changeOwner = $(By.xpath("//div[contains(@class,'branding-actions actionMenu popupTargetContainer') and contains(@class, 'visible positioned')]//li[@class='uiMenuItem']/a[@title='Change owner']"));
    }

    @Step("account deleting")
    public AccountsPage delete() {
        delete.shouldBe(Condition.visible).click();
        Button confirmDelete = new Button(By.xpath("//span[text()='Delete']"));
        confirmDelete.click();
        return new AccountsPage();
    }

}
