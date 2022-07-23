package Ui.pages.accountsPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountsPage.elements.pageTools.PageTools;
import lombok.Getter;

public class AccountsPage extends AppNavBar {

    @Getter
    private PageTools pageTools;


    public AccountsPage() {
        super();
        pageTools =new PageTools();
    }


}

