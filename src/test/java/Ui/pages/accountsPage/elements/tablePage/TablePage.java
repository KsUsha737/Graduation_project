package Ui.pages.accountsPage.elements.tablePage;

import Ui.pages.accountsPage.AccountsPage;
import Ui.wrapers.Button;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$;

/**
 * table of created accounts
 * contains the name of the columns
 */
public class TablePage {
    private Button accountName;
    private Button accountSite;
    private Button phone;
    private Button accountOwnerAlias;


    private List<AccountTableItem> items;

    public TablePage() {
        this.accountName = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Account Name']/ancestor::a"));
        this.accountSite = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Account Site']/ancestor::a"));
        this.phone = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Phone']/ancestor::a"));
        this.accountOwnerAlias = new Button(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//span[@title='Account Owner Alias']/ancestor::a"));

        ElementsCollection rows = $$(By.xpath("//div[@class='slds-grid listDisplays safari-workaround-anchor']//table[@aria-label='Recently Viewed']/tbody/tr"));
        items = new ArrayList<>();
        for (SelenideElement element:rows){
            items.add(new AccountTableItem(rows.indexOf(element),element));
        }
    }

    public TablePage sortByAccountName() {
        accountName.click();
        return this;
    }

    public TablePage sortByAccountSite(){
        accountSite.click();
        return this;
    }

    public TablePage sortByPhone(){
        phone.click();
        return this;
    }

    public TablePage sortByAccountOwnerAlias(){
        accountOwnerAlias.click();
        return this;
    }

    public AccountTableItem findByAccountName(String accountName){
        for (AccountTableItem item:items){
            if (item.getAccountName().getTitle().contains(accountName)){
                return item;
            }
        }
        return null;
    }
    @Step("account deleting")
    public AccountsPage deleteFirstAccount(){
        if (items.size()>0){
            items.get(0).getActions().delete();
        }
        return new AccountsPage();
    }

}
