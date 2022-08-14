package tests;

import Ui.pages.LoginPage;
import Ui.pages.accountPage.AccountPage;
import Ui.pages.accountPage.contactsPageInAccountPage.ContactsPageInAccountPage;
import Ui.pages.accountPage.contactsPageInAccountPage.NewContact;
import Ui.pages.accountPage.contactsPageInAccountPage.NewContactJsonReader;
import Ui.pages.accountPage.contactsPageInAccountPage.elements.tablePage.ContactTableItem;
import Ui.pages.newAccountPage.NewAccount;
import Ui.pages.newAccountPage.NewAccountJsonReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestDeleteContact extends  BaseTest{

    @Test(description = "delete contact on account")
    public void deleteContact() throws FileNotFoundException {

        NewAccountJsonReader reader = new NewAccountJsonReader();
        NewAccount newAccount = reader.read("account1.json");
        NewContactJsonReader reader1 = new NewContactJsonReader();
        NewContact newContact = reader1.read("contact.json");

        ContactTableItem byContactName = new LoginPage().login()
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
                .getTablePage()
                .findByContactName(newContact.getLastName());
        Assert.assertNotNull(byContactName);
        ContactsPageInAccountPage delete = byContactName.getActions()
                .delete();
        ContactTableItem byContactName1 = delete
                .getTablePage()
                .findByContactName(newContact.getLastName());
        Assert.assertNull(byContactName1);
        delete.goToAccountsPage()
                .getTablePage()
                .deleteFirstAccount();
    }

}
