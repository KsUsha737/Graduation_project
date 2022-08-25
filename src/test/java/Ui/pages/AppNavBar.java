package Ui.pages;

import Ui.pages.accountsPage.AccountsPage;
import Ui.pages.contactsPage.ContactsPage;
import Ui.pages.leadsPage.LeadsPage;
import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
@Log4j2
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

    @Step("Go to accounts page")
    public AccountsPage goToAccountsPage() {
        log.info("Go to accounts page");
        if (navItems==null){
            log.error("navItems is null");
        }else {
            for (NavItem el:navItems){
                if (el.getText().equals("Accounts")){
                    el.click();
                    break;
                }
            }
        }

        return new AccountsPage();
    }

    @Step("Go to contacts page")
    public ContactsPage goToContactsPage() {
        log.info("Go to contacts page");
        for (NavItem el:navItems){
            if(el.getText().equals("Contacts")){
                el.click();
                break;
            }
        }
        return new ContactsPage();
    }

    @Step("Go to leads page")
    public LeadsPage goToLeadsPage(){
        log.info("Go to leads page");
        for (NavItem el:navItems){
            if(el.getText().equals("Leads")){
                el.click();
                break;
            }
        }
        return new LeadsPage();
    }
}
