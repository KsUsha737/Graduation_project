package Ui.pages.accountsPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountsPage.elements.pageTools.PageTools;
import Ui.pages.accountsPage.elements.tablePage.TablePage;
import lombok.Getter;

public class AccountsPage extends AppNavBar {

    @Getter
    private PageTools pageTools;
    @Getter
    private TablePage tablePage;

    public AccountsPage() {
        super();
        pageTools =new PageTools();
        tablePage=new TablePage();
    }
}