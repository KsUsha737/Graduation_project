package tests;

import Ui.steps.AccountsSteps;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TestCreateNewAccounts extends BaseTest {

    @Test
    public void createNewAccounts() throws FileNotFoundException {
        new AccountsSteps().login()
                .goToAccountsPage()
                .createNewUser("account1.json")
                .createNewUser("account2.json")
                .createNewUser("account3.json");

    }

    @Test
    public void deleteFirstAccount()throws FileNotFoundException{
        new AccountsSteps().login()
                .goToAccountsPage()
                .deleteFirstUser();
    }
}

//            new LoginPage().
//
//                login()
//                .goToSalesPage()
//                .goToAccountsPage()
//                .getPageTools()
//                .goToNewAccountPage()
//                .create("account1.json")
//                .goToAccountsPage()
//                .getPageTools()
//                .goToNewAccountPage()
//                .create("account2.json")
//                .goToAccountsPage()
//                .getPageTools()
//                .goToNewAccountPage()
//                .create("account3.json")
//                .goToAccountsPage()
//                .getTablePage()
//                .deleteFirstAccount()
//                .getTablePage()
//                .deleteFirstAccount()
//                .getTablePage()
//                .deleteFirstAccount();
//        System.out.println("");
//    }
//    }
//}