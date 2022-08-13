package tests;

import Ui.pages.LoginPage;
import Ui.pages.accountPage.DetailsFormPage;
import Ui.pages.accountsPage.AccountsPage;
import Ui.pages.accountsPage.elements.tablePage.AccountTableItem;
import Ui.pages.newAccountPage.NewAccount;
import Ui.pages.newAccountPage.NewAccountJsonReader;
import Ui.wrapers.Input;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestVisibleEditingAccountSite extends BaseTest{
    @Test(description = "change and display the changed account field{newSite = 7788.com}", invocationCount = 2)
    public  void editSite() throws FileNotFoundException {
        NewAccountJsonReader reader = new NewAccountJsonReader();
        NewAccount newAccount = reader.read("account2.json");
        String newSite = "7788.com";

        DetailsFormPage detailsFormPage = new LoginPage().login()
                .goToSalesPage()
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create(newAccount)
                .goToAccountPageActions()
                .goToDetailsFormPage();
        Input accountSite = detailsFormPage.getAccountSite();
        accountSite.fill(newSite);
        AccountsPage accountsPage = detailsFormPage.save()
                .goToAccountsPage();
        AccountTableItem byAccountName = accountsPage
                .getTablePage()
                .findByAccountName(newAccount.getAccountName());
        String savedAccountSite = byAccountName.getAccountSite();
        Assert.assertEquals(savedAccountSite,newSite);
        byAccountName.getActions().delete();
    }

}
