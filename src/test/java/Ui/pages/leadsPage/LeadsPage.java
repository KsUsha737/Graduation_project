package Ui.pages.leadsPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountsPage.elements.pageTools.PageTools;
import lombok.Getter;

public class LeadsPage extends AppNavBar {

    @Getter
    private PageTools pageTools;

    public LeadsPage(){
        super();
        pageTools=new PageTools();
    }
}
