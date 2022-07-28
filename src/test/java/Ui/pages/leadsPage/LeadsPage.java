package Ui.pages.leadsPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountsPage.elements.pageTools.PageTools;
import Ui.wrapers.Button;
import lombok.Getter;
import org.openqa.selenium.By;

public class LeadsPage extends AppNavBar {
  @Getter
    private PageTools pageTools;

  public LeadsPage(){
     super();
     pageTools=new PageTools();

    }
}
