package Ui.pages.accountPage;

import Ui.pages.AppNavBar;
import Ui.wrapers.Link;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 *  left actions in AccountPage
 * contains fields Details,Related,News
 */
@Log4j2
public class AccountPageActions extends AppNavBar {
    private SelenideElement detailsLink;
    private SelenideElement relatedLink;
    private SelenideElement newsLink;

    public AccountPageActions() {
        detailsLink = $(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-main')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']/lightning-tab-bar/ul/li/a[@data-label='Details']"));
        relatedLink=$(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-main')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']/lightning-tab-bar/ul/li/a[@data-label='Related']"));
        newsLink=$(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-main')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']/lightning-tab-bar/ul/li/a[@data-label='News']"));
    }

    /**
     * Click on the 'Details' tab
     * and make all fields editable
     */
    @Step("Go to form Details")
    public DetailsFormPage goToDetailsFormPage() {
        log.info("Go to form Details in AccountPageActions");
        boolean b = Boolean.parseBoolean(detailsLink.getAttribute("aria-selected"));
        if (!b){
            detailsLink.click();
        }
        $(By.xpath("//span[text()='SLA']//ancestor::div[contains(@class,'slds-form-element slds-hint-parent')]/div[@class='slds-form-element__control']/button"))
                .shouldBe(Condition.visible)
                .shouldBe(Condition.enabled)
                .scrollIntoView(true)
                .click();
        return new DetailsFormPage();
    }

    @Step("Go to form Related")
    public RelatedFormPage goRelatedForm() {
        log.info("Go to form Related in AccountPageActions");
        boolean b = Boolean.parseBoolean(relatedLink.getAttribute("aria-selected"));
        if (!b){
            relatedLink.click();
        }
        return new RelatedFormPage();
    }

    @Step("Go to form News")
    public NewsFormPage goNewsForm() {
        log.info("Go to form News inAccountPageActions");
        boolean b = Boolean.parseBoolean(newsLink.getAttribute("aria-selected"));
        if (!b){
            newsLink.click();
        }
        return new NewsFormPage();
    }

    public AccountPage back(){
        return new AccountPage();
    }

}

