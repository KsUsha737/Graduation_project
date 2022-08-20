package Ui.pages.accountPage.contactsPageInAccountPage;

import Ui.constants.enums.newContactPageInAccountpage.InputEnum;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import lombok.Getter;
import org.openqa.selenium.By;

/**
 * page with contact details created on Account Page
 */
@Getter
public class DetailsFormPageInContactPage {
    private final Input phone;
    private final Input homePhone;
    private final Input mobile;

    private Button saveButton;

    public DetailsFormPageInContactPage() {
        phone = new Input(InputEnum.PHONE.getLocator());
        homePhone = new Input(InputEnum.HOME_PHONE.getLocator());
        mobile = new Input(InputEnum.MOBILE.getLocator());

        saveButton = new Button(By.xpath("//button[@class='slds-button slds-button_brand']"));
    }

    public ContactPageInAccountPageActions back(){
        return new ContactPageInAccountPageActions();
    }

    public ContactPageInAccountPageActions save(){
        saveButton.click();
        return new ContactPageInAccountPageActions();
    }
}
