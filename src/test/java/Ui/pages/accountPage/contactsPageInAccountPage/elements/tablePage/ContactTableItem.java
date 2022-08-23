package Ui.pages.accountPage.contactsPageInAccountPage.elements.tablePage;

import Ui.pages.accountPage.contactsPageInAccountPage.ContactPageInAccountPage;
import Ui.wrapers.Button;
import Ui.wrapers.Link;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class ContactTableItem {

    private int index;
    private Link contactName;
    private String title;
    private String email;
    private String phone;
    private Button contactActions;

    public ContactTableItem(int index, SelenideElement element) {
        this.index = index + 1;
        contactName = new Link(By.xpath("th/span/a"), element);
        title = element.$(By.xpath("td[3]")).getText();
        email = element.$(By.xpath("td[4]")).getText();
        phone = element.$(By.xpath("td[5]")).getText();
        contactActions = new Button(By.xpath("td[6]"),element);
    }

    @Step("select the contact field for interaction")
    public ContactActions getActions() {
        contactActions.click();
        return new ContactActions();

    }

    @Step("deleting a contact")
    public void deleteContact() {
        Button delete = new Button(By.xpath("//div[contains(@class,'branding-actions actionMenu popupTargetContainer') and contains(@class, 'visible positioned')]//li[@class='uiMenuItem']/a[@title='Delete']"));
        delete.click();
        Button confirmDelete=new Button(By.xpath("//span[text()='Delete']"));
        confirmDelete.click();
    }

    @Step("return to contact page")
    public ContactPageInAccountPage goToContactPageInAccountPage(){
        contactName.click();
        return new ContactPageInAccountPage();
    }
}
