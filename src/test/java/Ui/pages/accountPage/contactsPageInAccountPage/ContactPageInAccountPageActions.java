package Ui.pages.accountPage.contactsPageInAccountPage;

import Ui.pages.AppNavBar;
import Ui.pages.accountPage.DetailsFormPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
@Log4j2
public class ContactPageInAccountPageActions extends AppNavBar {
    private SelenideElement detailsLink;
    private SelenideElement relatedLink;
    private SelenideElement newsLink;

    public ContactPageInAccountPageActions(){
        detailsLink= $(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-main')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']/lightning-tab-bar/ul/li/a[@data-label='Details']"));
        relatedLink=$(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-main')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']/lightning-tab-bar/ul/li/a[@data-label='Related']"));
        newsLink=$(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-main')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']/lightning-tab-bar/ul/li/a[@data-label='News']"));

    }
    /**
     * Click on the 'Details' tab
     * and make all fields editable
     */
    @Step("Go to form Details")
    public DetailsFormPageInContactPage goToDetailsFormPage() {
        log.info("Go to form Details in ContactPageInAccountPageActions");
        boolean s=Boolean.parseBoolean(detailsLink.getAttribute("aria-selected"));
        if (!s){
            detailsLink.click();
        }
        $(By.xpath("//span[text()='Mobile']//ancestor::div[contains(@class,'slds-form-element slds-hint-parent')]/div[@class='slds-form-element__control']/button"))
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .scrollIntoView(true)
                .click();
        return new DetailsFormPageInContactPage();
    }
}
