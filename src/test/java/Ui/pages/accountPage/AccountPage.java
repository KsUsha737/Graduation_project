package Ui.pages.accountPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountsPage.AccountsPage;

public class AccountPage extends AppNavBar {

    private AccountPageActions accountPageActions;
    private AccountPageInfo accountPageInfo;

    public AccountPage() {
        super();
        accountPageActions = new AccountPageActions();
        accountPageInfo=new AccountPageInfo();

    }
    public AccountPageActions goToAccountPageActions(){
        return new AccountPageActions();
    }

}
