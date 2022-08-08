package Ui.pages.accountPage;

import Ui.wrapers.Link;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * in AccountPage right actions
 * contains fields Activity,Chatter
 */
@Log4j2
public class AccountPageInfo {
    private SelenideElement  relatedTab;
    private Link activity;
    private Link chatter;

    public AccountPageInfo() {
        relatedTab=$(By.xpath("//div[contains(@class,'windowViewMode-normal')]//div[contains(@class,'region-sidebar-right')]//div[@class='slds-tabs_card']//div[@class='slds-tabs_default']/lightning-tab-bar/ul/li"));
    }
    @Step("Go to form Activity")
    public ActivityFormPage goToActivityFormPage(){
        log.info("go To Activity Form Page in AccountPageInfo ");
       activity= new Link(By.xpath("a[@data-label='Activity']"));
       activity.click();
        return new  ActivityFormPage();
    }
    @Step("Go to form Activity")
    public ChatterFormPage goToChatterFormPage(){
        log.info("go To ChatterForm Page in AccountPageInfo ");
       chatter= new Link(By.xpath("a[@data-label='Chatter']"));
        chatter.click();
        return new  ChatterFormPage();
    }
}
