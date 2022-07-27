package tests;

import Ui.pages.LoginPage;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestCreateNewAccounts extends BaseTest {

    @Test
    public void createNewAccounts() throws FileNotFoundException {

            new LoginPage().

                login()
                .goToSalesPage()
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create("account1.json")
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create("account2.json")
                .goToAccountsPage()
                .getPageTools()
                .goToNewAccountPage()
                .create("account3.json")
                .goToAccountsPage()
                .getTablePage()
                .deleteFirstAccount()
                .getTablePage()
                .deleteFirstAccount()
                .getTablePage()
                .deleteFirstAccount();
        System.out.println("");
    }

}