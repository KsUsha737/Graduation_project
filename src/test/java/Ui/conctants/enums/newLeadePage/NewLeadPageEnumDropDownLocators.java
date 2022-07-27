package Ui.conctants.enums.newLeadePage;

import org.openqa.selenium.By;

/**
 * enum дропдаунов  NewLeadPage, найденных по локатору
 */
public enum NewLeadPageEnumDropDownLocators {
    SALUTATION("Salutation"),
    LEAD_SOURCE("Lead Source"),
    INDUSTRY("Industry"),
    LEAD_STATUS("Lead Status"),
    RATING("Rating"),
    PRODUCT_INTEREST("Product Interest"),
    PRIMARY("Primary");

    private final By locator;

    NewLeadPageEnumDropDownLocators(String title) {
        this.locator = By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox/div//button", title));

    }

    public By getLocator() {
        return locator;
    }
}



