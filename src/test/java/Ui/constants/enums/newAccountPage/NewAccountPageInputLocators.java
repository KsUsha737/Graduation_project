package Ui.constants.enums.newAccountPage;

import lombok.Getter;
import org.openqa.selenium.By;

/**
 * enum fields for entering NewAccountPage data found by locator
 */
public enum NewAccountPageInputLocators {
    ACCOUNT_NAME("Account Name"),
    PHONE("Phone"),
    FAX("Fax"),
    WEBSITE("Website"),
    ACCOUNT_NUMBER("Account Number"),
    ACCOUNT_SITE("Account Site"),
    TICKER_SYMBOL("Ticker Symbol"),
    EMPLOYEES("Employees"),
    ANNUAL_REVENUE("Annual Revenue"),
    SIC_CODE("SIC Code"),
    BILLING_CITY("Billing City"),
    BILLING_STATE_PROVINCE("Billing State/Province"),
    SHIPPING_CITY("Shipping City"),
    SHIPPING_STATE_PROVINCE("Shipping State/Province"),
    BILLING_ZIP_POSTAL_CODE("Billing Zip/Postal Code"),
    BILLING_COUNTRY("Billing Country"),
    SHIPPING_ZIP_POSTAL_CODE("Shipping Zip/Postal Code"),
    SHIPPING_COUNTRY("Shipping Country"),
    SLA_SERIAL_NUMBER("SLA Serial Number"),
    NUMBER_OF_LOCATION("Number of Locations");

    private final By locator;
    @Getter
    private final String title;

    NewAccountPageInputLocators(String title){
        this.title=title;
        this.locator=By.xpath(String.format("//label[text()='%s']//ancestor::lightning-input/div/input",title));
    }
    public By getLocator(){
        return this.locator;
    }

}
