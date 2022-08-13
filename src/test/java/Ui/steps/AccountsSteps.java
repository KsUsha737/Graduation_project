//package Ui.steps;
//
//import Ui.pages.accountsPage.AccountsPage;
//import Ui.pages.base.BasePage;
//import io.qameta.allure.Step;
//
//import java.io.FileNotFoundException;
//
//public class AccountsSteps {
//
//    private BasePage basePage;
//    private AccountsPage accountsPage;
//
//    @Step
//    private NewAccountsPage(String jsonFileName) {
//        new AccountsPage()= BasePage()
//                .goToSalesPage()
//                .goToAccountsPage()
//                .getPageTools()
//                .goToNewAccountPage()
//                .create(newAccount)
//                .goToAccountsPage();
//        return this;
//    }
//
//       @Step("go ToAccounts Page")
//    public AccountsSteps goToAccountsPage() {
//        accountsPage = basePage.goToSalesPage()
//                .goToAccountsPage();
//        return this;
//    }

//    @Step("createNewUser")
//    public AccountsSteps createNewUser(String jsonFileName) throws FileNotFoundException {
//        accountsPage = accountsPage.getPageTools()
//                .goToNewAccountPage()
//                .create(jsonFileName)
//                .goToAccountsPage();
//        return this;
//    }
//
//   @Step("delete first User")
//    public AccountsSteps deleteFirstUser() {
//        accountsPage = accountsPage.getTablePage()
//                .deleteFirstAccount();
//        return this;
//    }
//


