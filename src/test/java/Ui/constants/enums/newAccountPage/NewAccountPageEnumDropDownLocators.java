package Ui.constants.enums.newAccountPage;

import org.openqa.selenium.By;

/**
 * enum of NewAccountPage dropdowns found by locator
 */
public enum NewAccountPageEnumDropDownLocators {

    RATING("Rating"),
    TYPE("Type"),
    OWNERSHIP("Ownership"),
    INDUSTRY("Industry"),
    CUSTOMER_PRIORITY("Customer Priority"),
    SLA("SLA"),
    UPSELL_OPPORTUNITY("Upsell Opportunity"),
    ACTIVE("Active");

    private final By locator;

    NewAccountPageEnumDropDownLocators(String title) {
        this.locator=By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox/div//button",title));
    }

    public By getLocator() {
        return locator;
    }
}
