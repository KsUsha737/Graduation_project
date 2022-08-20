package Ui.constants.enums.newContactPageInAccountpage;

import org.openqa.selenium.By;
/**
 * enum of NewAccountPage dropdowns found by locator
 */
public enum NewContactPageInAccountPageDropDownLocators {

    SALUTATION("Salutation"),
    LEAD_SOURCE("Lead Source"),
    LEVEL("Level");

    private final By locator;

   NewContactPageInAccountPageDropDownLocators (String title) {
        this.locator=By.xpath(String.format("//label[text()='%s']//ancestor::lightning-combobox/div//button",title));
    }

    public By getLocator() {
        return locator;
    }
}
