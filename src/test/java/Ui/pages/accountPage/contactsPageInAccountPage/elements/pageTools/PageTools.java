package Ui.pages.accountPage.contactsPageInAccountPage.elements.pageTools;

import Ui.constants.enums.newContactPageInAccountpage.PageToolEnum;
import Ui.pages.accountPage.contactsPageInAccountPage.NewContactPageCreateInAccountPage;
import Ui.pages.accountsPage.elements.pageTools.PageTool;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$$;

/**
 * page right menu tools
 * created a list of right menu buttons ("New" and "Import")
 * valid for all AppNavBar pages
 */
public class PageTools {

    private List<PageTool> pageTools;

    public PageTools() {
        ElementsCollection rightMenuButtons = $$(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'slds-page-header--object-home')]//div[contains(@class,'slds-col')]//li[@class='slds-button slds-button--neutral']"));
        for (SelenideElement ele : rightMenuButtons) {
            if (Objects.isNull(pageTools)) {
                pageTools = new ArrayList<>();
            }
             pageTools.add(new PageTool(ele));
        }

    }

    public NewContactPageCreateInAccountPage goToNewContactPageCreateInAccountPage(){
       NewContactPageCreateInAccountPage newContactPageCreateInAccountPage=null;
        for (PageTool ele : pageTools) {
            if (ele.getText().equals(PageToolEnum.NEW.getText())) {
                ele.click();
             newContactPageCreateInAccountPage= new NewContactPageCreateInAccountPage();
            }
        }
        return new NewContactPageCreateInAccountPage();
    }
}
