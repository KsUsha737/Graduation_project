package Ui.pages.contactsPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountsPage.elements.pageTools.PageTool;
import Ui.pages.accountsPage.elements.pageTools.PageTools;
import Ui.wrapers.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class ContactsPage extends AppNavBar {
    @Getter
    private PageTool pageTool;
    @Getter
    private PageTools pageTools;

    public ContactsPage(){
        super();
        pageTools=new PageTools();
    }

}
