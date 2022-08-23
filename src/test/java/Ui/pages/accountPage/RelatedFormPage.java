package Ui.pages.accountPage;

import Ui.pages.accountPage.contactsPageInAccountPage.ContactsPageInAccountPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RelatedFormPage {

    private final SelenideElement link;

    public RelatedFormPage() {

        link = $(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-main')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']//div[@class='listWrapper']//div[@class='slds-media slds-no-space slds-grow']//span[@title='Contacts']"));
    }

    public ContactsPageInAccountPage goToContacts() {
        link.click();
        return new ContactsPageInAccountPage();
    }
}
