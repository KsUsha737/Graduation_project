package tests.UI;

import Ui.pages.LoginPage;
import Ui.pages.accountPage.contactsPageInAccountPage.DetailsFormPageInContactPage;
import Ui.pages.accountPage.contactsPageInAccountPage.NewContact;
import Ui.pages.accountPage.contactsPageInAccountPage.NewContactJsonReader;
import Ui.pages.newAccountPage.NewAccount;
import Ui.pages.newAccountPage.NewAccountJsonReader;
import Ui.wrapers.Input;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestVisibleEditingContactMobile extends BaseTest{

    @Test(description = "change and display the changed contact Mobile{newMobile= 8029333333}",retryAnalyzer= Retry.class)
    public void editMobile() throws FileNotFoundException{
        NewAccountJsonReader reader = new NewAccountJsonReader();
        NewAccount newAccount = reader.read("account2.json");
        NewContactJsonReader reader1 = new NewContactJsonReader();
        NewContact newContact = reader1.read("contact.json");
        String newMobile= "8029333333";

        DetailsFormPageInContactPage detailsFormPageInContactPage = new LoginPage()
                .login()
                .goToSalesPage()
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create(newAccount)
                .goToAccountPageActions()
                .goRelatedForm()
                .goToContacts()
                .getPageTools()
                .goToNewContactPageCreateInAccountPage()
                .create(newContact)
                .getTablePage().findByContactName(newContact.getLastName())
                .goToContactPageInAccountPage()
                .goToContactPageInAccountPageActions()
                .goToDetailsFormPage();
        Input mobile = detailsFormPageInContactPage.getMobile();
        mobile.fill(newMobile);
        DetailsFormPageInContactPage detailsFormPageInContactPage1 = detailsFormPageInContactPage
                .save()
                .goToDetailsFormPage();

        Input mobile1 = detailsFormPageInContactPage1.getMobile();
        String newNumberMobile = mobile1.getText();

        detailsFormPageInContactPage1
                .back()
                .goToAccountsPage().getTablePage().deleteFirstAccount();
        Assert.assertEquals(newNumberMobile,newMobile);
    }
}
