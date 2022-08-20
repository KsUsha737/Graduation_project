package Ui.pages.accountPage.contactsPageInAccountPage;


import Ui.constants.enums.newContactPageInAccountpage.InputEnum;
import Ui.constants.enums.newContactPageInAccountpage.NewContactPageInAccountPageDropDownLocators;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class NewContactPageCreateInAccountPage {

    private final Input phone;
    private final Input homePhone;
    private final Input firstName;
    private final Input lastName;
    private final Input mobile;
    private final Input title;
    private final Input otherPhone;
    private final Input department;
    private final Input fax;
    private final Input email;
    private final Input assistant;
    private final Input asst_Phone;
    private final Input mailing_City;
    private final Input mailing_State_Province;
    private final Input other_City;
    private final Input other_State_Province;
    private final Input mailing_Zip_Postal_Code;
    private final Input mailing_Country;
    private final Input other_Zip_Postal_Code;
    private final Input other_Country;
    private final Input languages;

    private final DropDown salutation;
    private final DropDown lead_Source;
    private final DropDown level;

    private final Button saveButton;

    public NewContactPageCreateInAccountPage() {
        phone = new Input(InputEnum.PHONE.getLocator());
        homePhone=new Input(InputEnum.HOME_PHONE.getLocator());
        firstName= new Input(InputEnum.FIRST_Name.getLocator());
        lastName= new Input(InputEnum.LAST_Name.getLocator());
        mobile= new Input(InputEnum.MOBILE.getLocator());
        title = new Input(InputEnum.TITLE.getLocator());
        otherPhone = new Input(InputEnum.OTHER_PHONE.getLocator());
        department= new Input(InputEnum.DEPARTMENT.getLocator());
        fax= new Input(InputEnum.FAX.getLocator());
        email = new Input(InputEnum.EMAIL.getLocator());
        assistant = new Input(InputEnum.ASSISTANT.getLocator());
        asst_Phone = new Input(InputEnum.ASST_PHONE.getLocator());
        mailing_City = new Input(InputEnum.MAILING_CITY.getLocator());
        mailing_State_Province = new Input(InputEnum.MAILING_STATE_PROVINCE.getLocator());
        other_City = new Input(InputEnum.OTHER_CITY.getLocator());
        other_State_Province = new Input(InputEnum.OTHER_STATE_PROVINCE.getLocator());
        mailing_Zip_Postal_Code = new Input(InputEnum.MAILING_ZIP_POSTAL_CODE.getLocator());
        mailing_Country = new Input(InputEnum.MAILING__COUNTRY.getLocator());
        other_Zip_Postal_Code = new Input(InputEnum.OTHER_ZIP_POSTAL_CODE.getLocator());
        other_Country = new Input(InputEnum.OTHER_COUNTRY.getLocator());
        languages = new Input(InputEnum.LANGUAGES.getLocator());

        salutation= new DropDown(NewContactPageInAccountPageDropDownLocators.SALUTATION);
        lead_Source = new DropDown(NewContactPageInAccountPageDropDownLocators.LEAD_SOURCE);
        level = new DropDown(NewContactPageInAccountPageDropDownLocators.SALUTATION);

        saveButton= new Button(By.xpath("//button[@class='slds-button slds-button_brand']"));
    }

   @Step("creating a new contact in the account using the data from json file")
    public ContactsPageInAccountPage create (String contactJsonFileName) throws FileNotFoundException{
        NewContact newContact= new NewContactJsonReader().read(contactJsonFileName);
        phone.fill(newContact.getPhone());
        homePhone.fill(newContact.getHomePhone());
        firstName.fill(newContact.getFirstName());
        lastName.fill(newContact.getLastName());
        mobile.fill(newContact.getMobile());
        title.fill(newContact.getTitle());
        otherPhone.fill(newContact.getOtherPhone());
        department.fill(newContact.getDepartment());
        fax.fill(newContact.getFax());
        email.fill(newContact.getEmail());
        assistant.fill(newContact.getAssistant());
        asst_Phone.fill(newContact.getAsst_Phone());
        mailing_City.fill(newContact.getMailing_City());
        mailing_State_Province.fill(newContact.getMailing_State_Province());
        other_City.fill(newContact.getOther_City());
        other_State_Province.fill(newContact.getOther_State_Province());
        mailing_Zip_Postal_Code.fill(newContact.getMailing_Zip_Postal_Code());
        mailing_Country.fill(newContact.getMailing_Country());
        other_Zip_Postal_Code.fill(newContact.getOther_Zip_Postal_Code());
        other_Country.fill(newContact.getOther_Country());
        languages.fill(newContact.getLanguages());

        salutation.select(newContact.getSalutation());
        lead_Source.select(newContact.getLeadSource());
        level.select(newContact.getLevel());

        saveButton.click();
        return new ContactsPageInAccountPage();
   }

    @Step("creating a new contact in the account using by setting values")
    public ContactsPageInAccountPage create ( NewContact newContact) throws FileNotFoundException{
        phone.fill(newContact.getPhone());
        homePhone.fill(newContact.getHomePhone());
        firstName.fill(newContact.getFirstName());
        lastName.fill(newContact.getLastName());
        mobile.fill(newContact.getMobile());
        title.fill(newContact.getTitle());
        otherPhone.fill(newContact.getOtherPhone());
        department.fill(newContact.getDepartment());
        fax.fill(newContact.getFax());
        email.fill(newContact.getEmail());
        assistant.fill(newContact.getAssistant());
        asst_Phone.fill(newContact.getAsst_Phone());
        mailing_City.fill(newContact.getMailing_City());
        mailing_State_Province.fill(newContact.getMailing_State_Province());
        other_City.fill(newContact.getOther_City());
        other_State_Province.fill(newContact.getOther_State_Province());
        mailing_Zip_Postal_Code.fill(newContact.getMailing_Zip_Postal_Code());
        mailing_Country.fill(newContact.getMailing_Country());
        other_Zip_Postal_Code.fill(newContact.getOther_Zip_Postal_Code());
        other_Country.fill(newContact.getOther_Country());
        languages.fill(newContact.getLanguages());

        salutation.select(newContact.getSalutation());
        lead_Source.select(newContact.getLeadSource());
        level.select(newContact.getLevel());



        saveButton.click();
        return new ContactsPageInAccountPage();
    }

}
