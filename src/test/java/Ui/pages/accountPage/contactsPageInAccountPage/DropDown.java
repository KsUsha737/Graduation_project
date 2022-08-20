package Ui.pages.accountPage.contactsPageInAccountPage;

import Ui.constants.enums.newContactPageInAccountpage.NewContactPageInAccountPageDropDownLocators;
import Ui.constants.enums.newContactPageInAccountpage.PageDropDownEnumInterface;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * select the value of the DropDown fields from the drop-down list
 * field selection via Enum
 */
public class DropDown {
    private final SelenideElement dropDown;

    public DropDown(NewContactPageInAccountPageDropDownLocators newContactPageInAccountPageDropDownLocators) {
        dropDown = $(newContactPageInAccountPageDropDownLocators.getLocator()).scrollIntoView(true);
    }

    public NewContactPageCreateInAccountPage select(PageDropDownEnumInterface ratingEnum) {
        dropDown.scrollIntoView(true).click();
        ElementsCollection dropDownElements = dropDown.$$(By.xpath("ancestor::div[contains(@class,'slds-combobox slds-dropdown-trigger')]/div[contains(@class,'slds-listbox')]/lightning-base-combobox-item"));
        for (SelenideElement el:dropDownElements){
            String title = el.$(By.xpath("span/span[@class='slds-truncate']")).getText();
            if (title.equals(ratingEnum.toString())) {
                el.click();
                return new NewContactPageCreateInAccountPage();

            }
        }
        return null;
    }
}
