package Ui.pages.accountsPage.elements.tablePage;

import Ui.pages.accountPage.AccountPage;
import Ui.wrapers.Button;
import Ui.wrapers.Link;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class AccountTableItem {

    private int index;
    private Link accountName;
    private String accountSite;
    private String phone;
    private String accountOwnerAlias;
    private Button accountActions;

    public AccountTableItem(int index, SelenideElement element) {
        this.index = index + 1;
        accountName = new Link(By.xpath("th/span/a"), element);
        accountSite = element.$(By.xpath("td[3]")).getText();
        phone = element.$(By.xpath("td[4]")).getText();
        accountOwnerAlias = element.$(By.xpath("td[5]")).getText();
        accountActions = new Button(By.xpath("td[6]//a"), element);
    }

    @Step("select the field of the created account for interaction")
    public AccountActions getActions() {
        accountActions.click();
        return new AccountActions();
    }

    @Step("back to account page")
    public AccountPage goToAccountPage() {
        accountName.click();
        return new AccountPage();
    }

}
