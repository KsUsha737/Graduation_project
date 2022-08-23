package Ui.constants.enums.newContactPageInAccountpage;

import lombok.Getter;
import org.openqa.selenium.By;
/**
 * enum fields for entering data found by locator
 */
public enum InputEnum {

    PHONE("Phone"),
    HOME_PHONE("Home Phone"),
    FIRST_Name("First Name"),
    LAST_Name("Last Name"),
    MOBILE("Mobile"),
    TITLE("Title"),
    OTHER_PHONE("Other Phone"),
    DEPARTMENT("Department"),
    FAX("Fax"),
    EMAIL("Email"),
    ASSISTANT("Assistant"),
    ASST_PHONE("Asst. Phone"),
    MAILING_CITY("Mailing City"),
    MAILING_STATE_PROVINCE("Mailing State/Province"),
    OTHER_CITY("Other City"),
    OTHER_STATE_PROVINCE("Other State/Province"),
    MAILING_ZIP_POSTAL_CODE("Mailing Zip/Postal Code"),
    MAILING__COUNTRY("Mailing Country"),
    OTHER_ZIP_POSTAL_CODE("Other Zip/Postal Code"),
    OTHER_COUNTRY("Other Country"),
    LANGUAGES("Languages");

    private final By locator;
    @Getter
    private final String title;

    InputEnum(String title) {
        this.title = title;
        this.locator = By.xpath(String.format("//label[text()='%s']//ancestor::lightning-input/div/input", title));
    }

    public By getLocator() {
        return this.locator;
    }
}
