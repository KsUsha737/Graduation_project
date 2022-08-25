package Ui.pages.newLeadPage;

import Ui.constants.enums.newLeadePage.NewLeadPageDropdownEnumInterface;
import Ui.constants.enums.newLeadePage.NewLeadPageEnumDropDownLocators;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DropDown {

    private final SelenideElement dropDown;

    public DropDown(NewLeadPageEnumDropDownLocators newLeadPageEnumDropDownLocator) {
        dropDown = $(newLeadPageEnumDropDownLocator.getLocator()).scrollIntoView(true);
    }

    public NewLeadPage select(NewLeadPageDropdownEnumInterface ratingEnum) {
        dropDown.scrollIntoView(true).click();
        ElementsCollection dropDownElements = dropDown.$$(By.xpath("ancestor::div[contains(@class,'slds-combobox slds-dropdown-trigger')]/div[contains(@class,'slds-listbox')]/lightning-base-combobox-item"));
        for (SelenideElement el : dropDownElements) {
            String title = el.$(By.xpath("span/span[@class='slds-truncate']")).getText();
            if (title.equals(ratingEnum.toString())) {
                el.click();
                return new NewLeadPage();
            }
        }
        return null;
    }
}
