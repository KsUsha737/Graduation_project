package tests;

import Ui.pages.LoginPage;
import Ui.pages.newAccountPage.NewAccount;
import Ui.pages.newAccountPage.NewAccountJsonReader;
import Ui.pages.newAccountPage.NewAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestNegativeCreateAccount extends BaseTest{
    @Test(description = "recreating an existing account", retryAnalyzer = Retry.class)
    public void negativeCreateAccount() throws FileNotFoundException{
        NewAccountJsonReader reader = new NewAccountJsonReader();
        NewAccount newAccount = reader.read("account2.json");
        NewAccountPage newAccountPage = new LoginPage().login()
                .goToSalesPage()
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create(newAccount)
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage();
        String message = newAccountPage
                .negativeCreate(newAccount);
        Assert.assertEquals(message,"Similar Records Exist");
        newAccountPage.cancel()
                .getTablePage()
                .findByAccountName(newAccount.getAccountName())
                .getActions()
                .delete();
    }
}
