package Ui.constants.enums.newLeadePage;

import org.openqa.selenium.By;

/**
 * enum fields for entering NewLeadPage data found by locator
 */
public enum NewLeadPageInputLocatorsEnum {
    PHONE("Phone"),
    MOBILE("Mobile"),
    FIRST_NAME("First Name"),
    LAST_NAME("Last Name"),
    COMPANY("Company"),
    Fax("Fax"),
    TITLE("Title"),
    EMAIL("Email"),
    WEBSITE("Website"),
    ANNUAL_REVENUE("Annual Revenue"),
    NO_OF("No. of Employees"),
    CITY("City"),
    STATE_PROVINCE("State/Province"),
    ZIP_POSTAL_CODE("Zip/Postal Code"),
    COUNTRY("Country"),
    CURRENT_GENERATOR("Current Generator(s)"),
    SIC_CODE("SIC Code"),
    NUMBER_OF_LOCATION("Number of Locations");

    public final By locator;

    NewLeadPageInputLocatorsEnum(String title){
        this.locator= org.openqa.selenium.By.xpath(String.format("//label[text()='%s']//ancestor::lightning-input/div/input",title));
    }

    public By getLocator(){
        return this.locator;
    }
}
