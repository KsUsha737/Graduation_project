package tests.UI;

import Ui.pages.LoginPage;
import Ui.pages.accountPage.DetailsFormPage;
import Ui.pages.accountsPage.elements.tablePage.AccountTableItem;
import Ui.pages.newAccountPage.NewAccount;
import Ui.pages.newAccountPage.NewAccountJsonReader;
import Ui.wrapers.Input;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;

public class TestCreateNewAccounts extends BaseTest {

    @Test(description = "create account",invocationCount =2,retryAnalyzer = Retry.class)
    public void createNewAccounts() throws FileNotFoundException {
        NewAccountJsonReader reader = new NewAccountJsonReader();
        NewAccount newAccount = reader.read("account1.json");

        AccountTableItem byAccountName = new LoginPage().login()
                .goToSalesPage()
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create(newAccount)
                .goToAccountsPage()
                .getTablePage()
                .findByAccountName(newAccount.getAccountName());
        byAccountName.getActions().delete();
        Assert.assertEquals(newAccount.getAccountSite(), byAccountName.getAccountSite());
        Assert.assertEquals(byAccountName.getAccountName().getTitle(), newAccount.getAccountName());
        Assert.assertEquals(byAccountName.getPhone(), newAccount.getPhone());
    }

    @Test(description = "changing the phone in the created account",retryAnalyzer = Retry.class)
    public void changingPhoneInAccountDetails() throws FileNotFoundException {
        NewAccountJsonReader reader = new NewAccountJsonReader();
        NewAccount newAccount = reader.read("account2.json");
        String newPhone = "1234";

        DetailsFormPage detailsFormPage = new LoginPage().login()
                .goToSalesPage()
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create(newAccount)
                .goToAccountPageActions()
                .goToDetailsFormPage();
        Input prePhone = detailsFormPage.getPhone();
        prePhone.fill(newPhone);
        DetailsFormPage detailsFormPage1 = detailsFormPage.save()
                .goToDetailsFormPage();

        Input postPhone = detailsFormPage1.getPhone();
        String postPhoneNumber = postPhone.getText();

        detailsFormPage1.back()
                .back()
                .goToAccountsPage()
                .getTablePage()
                .deleteFirstAccount();

        Assert.assertEquals(postPhoneNumber, newPhone);
    }

}
