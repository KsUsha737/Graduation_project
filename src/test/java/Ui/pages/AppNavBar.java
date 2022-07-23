package Ui.pages;

import Ui.pages.accountsPage.AccountsPage;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AppNavBar {
    private List<NavItem> navItems;

    public AppNavBar() {

        Selenide.sleep(5000);
        $(By.xpath("//span[text()='Home']"))
                .shouldBe(Condition.enabled, Duration.ofSeconds(10L))
                .shouldBe(Condition.exist, Duration.ofSeconds(10L))
                .shouldBe(Condition.visible, Duration.ofSeconds(10L));//не работает
        ElementsCollection elementsCollectionAppNavBar = $$(By.xpath("//one-app-nav-bar[@class='slds-grid slds-has-flexi-truncate']//one-app-nav-bar-item-root"));
           for (SelenideElement ele : elementsCollectionAppNavBar) {
            if (Objects.isNull(navItems)){
                navItems = new ArrayList<>();
            }
            navItems.add(new NavItem(ele));
        }
    }

    public AccountsPage goToAccountsPage() {
        for (NavItem el:navItems){
            if (el.getText().equals("Accounts")){
                el.click();
                break;
            }
        }
        return new AccountsPage();

    }

    public ContactsPage goToContactPage() {
        for (NavItem el:navItems){
            if(el.getText().equals("Contacts")){
                el.click();
                break;
            }
        }
        return new ContactsPage();
    }

    public LeadsPage goToLeadsPage(){
        for (NavItem el:navItems){
            if(el.getText().equals("Leads")){
                el.click();
                break;
            }
        }
        return new LeadsPage();
    }

}
