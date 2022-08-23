package Ui.pages.accountPage.contactsPageInAccountPage.elements.tablePage;

import Ui.pages.accountPage.contactsPageInAccountPage.ContactsPageInAccountPage;
import Ui.wrapers.Button;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

/**
 * table of created contacts
 * contains the names of the columns
 */
public class TablePage {

    private Button contactName;
    private Button title;
    private Button email;
    private Button phone;

    private List<ContactTableItem> items;

    public TablePage() {
        this.contactName = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Contact Name']/ancestor::a[@class='toggle slds-th__action slds-text-link--reset ']"));
        this.title = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Title']/ancestor::a[@class='toggle slds-th__action slds-text-link--reset ']"));
        this.email = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Email']/ancestor::a[@class='toggle slds-th__action slds-text-link--reset ']"));
        this.phone = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Phone']/ancestor::a[@class='toggle slds-th__action slds-text-link--reset ']"));

        ElementsCollection rows = $$(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//table[@aria-label='Contacts']/tbody/tr"));
        items = new ArrayList<>();
        for (SelenideElement element : rows) {
            items.add(new ContactTableItem(rows.indexOf(element), element));
        }

    }

    public TablePage sortByContactName() {
        contactName.click();
        return this;
    }

    public TablePage sortByTitle() {
        title.click();
        return this;
    }

    public TablePage sortByEmail() {
        email.click();
        return this;
    }

    public TablePage sortByPhone() {
        phone.click();
        return this;
    }

    public ContactTableItem findByContactName(String contactName) {
        for (ContactTableItem item : items) {
            if (item.getContactName().getTitle().contains(contactName)) {
                return item;
            }
        }
        return null;
    }

    @Step("deleting a contact")
    public ContactsPageInAccountPage deleteContact() {
        if (items.size() > 0) {
            items.get(0).getActions().delete();

        }
        return new ContactsPageInAccountPage();
    }
}
