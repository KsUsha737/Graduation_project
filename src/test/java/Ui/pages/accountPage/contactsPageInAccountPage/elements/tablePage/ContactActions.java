package Ui.pages.accountPage.contactsPageInAccountPage.elements.tablePage;

import Ui.pages.accountPage.contactsPageInAccountPage.ContactsPageInAccountPage;
import Ui.wrapers.Button;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * contact options
 */
public class ContactActions {
    private SelenideElement edit;
    private SelenideElement delete;
    private SelenideElement addToCampaign;

    public ContactActions() {
        edit = $(By.xpath("//div[contains(@class,'branding-actions actionMenu popupTargetContainer') and contains(@class, 'visible positioned')]//li[@class='uiMenuItem']/a[@title='Edit']"));
        delete = $(By.xpath("//div[contains(@class,'branding-actions actionMenu popupTargetContainer') and contains(@class, 'visible positioned')]//li[@class='uiMenuItem']/a[@title='Delete']"));
        addToCampaign = $(By.xpath("//div[contains(@class,'branding-actions actionMenu popupTargetContainer') and contains(@class, 'visible positioned')]//li[@class='uiMenuItem']/a[@title='Change owner']"));
    }

    @Step("delete contact")
    public ContactsPageInAccountPage delete() {
        delete.shouldBe(Condition.visible).click();
        Button confirmDelete = new Button(By.xpath("//span[text()='Delete']"));
        confirmDelete.click();
        return new ContactsPageInAccountPage();
    }

}
