package Ui.pages.accountsPage.elements.pageTools;

import Ui.conctants.enums.accountsPage.PageToolEnum;
import Ui.pages.newAccountPage.NewAccountsPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$$;

public class PageTools{
    private List <PageTool> pageTools;

    public PageTools(){
        ElementsCollection rightMenuButtons= $$("//div[contains(@class,'slds-col')]//li[@class='slds-button slds-button--neutral']");
        for (SelenideElement el:rightMenuButtons){
            if(Objects.isNull(pageTools)){
                pageTools =new ArrayList<>();
            }
            pageTools.add(new PageTool(el));
        }
    }

    public NewAccountsPage goToNewAccountPage(){
        NewAccountsPage newAccountsPage = null;
        for (PageTool el:pageTools){
            if (el.getText().equals(PageToolEnum.NEW.getText())){
                el.click();
                newAccountsPage = new NewAccountsPage();
            }
        }
        return newAccountsPage;
    }

}