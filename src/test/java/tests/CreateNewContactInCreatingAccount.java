package tests;

import Ui.pages.LoginPage;
import Ui.pages.accountPage.AccountPage;
import Ui.pages.accountPage.contactsPageInAccountPage.NewContact;
import Ui.pages.accountPage.contactsPageInAccountPage.NewContactJsonReader;
import Ui.pages.accountPage.contactsPageInAccountPage.elements.tablePage.ContactTableItem;
import Ui.pages.accountsPage.elements.tablePage.AccountTableItem;
import Ui.pages.newAccountPage.NewAccount;
import Ui.pages.newAccountPage.NewAccountJsonReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class CreateNewContactInCreatingAccount extends BaseTest {

    @Test(description = "creating contact in account",retryAnalyzer = Retry.class)
    public void CreateNewContactInCreatingAccount() throws FileNotFoundException {

        NewAccountJsonReader reader = new NewAccountJsonReader();
        NewAccount newAccount = reader.read("account1.json");
        NewContactJsonReader reader1 = new NewContactJsonReader();
        NewContact newContact = reader1.read("contact.json");

        AccountPage accountPage = new LoginPage().login()
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
                .goToAccountsPage()
                .getTablePage()
                .findByAccountName(newAccount.getAccountName())
                .goToAccountPage();

        ContactTableItem createdContact = accountPage
                .goToAccountPageActions()
                .goRelatedForm()
                .goToContacts()
                .getTablePage()
                .findByContactName(newContact.getLastName());

        accountPage.goToAccountsPage().getTablePage().deleteFirstAccount();

        Assert.assertEquals(createdContact.getContactName().getTitle(),newContact.getFullName());
    }
}