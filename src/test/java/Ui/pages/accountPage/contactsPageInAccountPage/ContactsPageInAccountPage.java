package Ui.pages.accountPage.contactsPageInAccountPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountPage.contactsPageInAccountPage.elements.pageTools.PageTools;
import Ui.pages.accountPage.contactsPageInAccountPage.elements.tablePage.TablePage;
import lombok.Getter;

public class ContactsPageInAccountPage extends AppNavBar {

    @Getter
    private TablePage tablePage;
    @Getter
    private PageTools pageTools;

    public ContactsPageInAccountPage() {
        super();
        pageTools = new PageTools();
        tablePage=new TablePage();
    }
}
