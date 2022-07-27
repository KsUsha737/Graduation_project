package Ui.pages.newLeadPage;

import Ui.conctants.enums.newLeadePage.NewLeadPageEnumDropDownLocators;
import Ui.conctants.enums.newLeadePage.NewLeadPageInputLocatorsEnum;
import Ui.pages.LeadPage;
import Ui.pages.leadsPage.LeadsPage;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

public class NewLeadPage {

    private final Input phone;
    private final Input mobile;
    private final Input firstName;
    private final Input lastName;
    private final Input company;
    private final Input fax;
    private final Input title;
    private final Input email;
    private final Input website;
    private final Input annualRevenue;
    private final Input no_ofEmployees;
    private final Input city;
    private final Input state_Province;
    private final Input zip_PostalCode;
    private final Input country;
    private final Input currentGenerator_s_;
    private final Input cICCode;
    private final Input numberOfLocation;

    private final DropDown salutation;
    private final DropDown leadSource;
    private final DropDown industry;
    private final DropDown leadStatus;
    private final DropDown rating;
    private final DropDown productInterest;
    private final DropDown primary;

    public final Button saveButton;

    public NewLeadPage(){
        phone=new Input(NewLeadPageInputLocatorsEnum.PHONE.getLocator());
        mobile=new Input(NewLeadPageInputLocatorsEnum.MOBILE.getLocator());
        firstName= new Input(NewLeadPageInputLocatorsEnum.FIRST_NAME.getLocator());
        lastName=new Input(NewLeadPageInputLocatorsEnum.LAST_NAME.getLocator());
        company=new Input(NewLeadPageInputLocatorsEnum.COMPANY.getLocator());
        fax=new Input(NewLeadPageInputLocatorsEnum.Fax.getLocator());
        title=new Input(NewLeadPageInputLocatorsEnum.TITLE.getLocator());
        email=new Input(NewLeadPageInputLocatorsEnum.EMAIL.getLocator());
        website=new Input(NewLeadPageInputLocatorsEnum.WEBSITE.getLocator());
        annualRevenue=new Input(NewLeadPageInputLocatorsEnum.ANNUAL_REVENUE.getLocator());
        no_ofEmployees=new Input(NewLeadPageInputLocatorsEnum.NO_OF.getLocator());
        city=new Input(NewLeadPageInputLocatorsEnum.CITY.getLocator());
        state_Province=new Input(NewLeadPageInputLocatorsEnum.STATE_PROVINCE.getLocator());
        zip_PostalCode=new Input(NewLeadPageInputLocatorsEnum.ZIP_POSTAL_CODE.getLocator());
        country=new Input(NewLeadPageInputLocatorsEnum.COUNTRY.getLocator());
        currentGenerator_s_=new Input(NewLeadPageInputLocatorsEnum.CURRENT_GENERATOR.getLocator());
        cICCode=new Input(NewLeadPageInputLocatorsEnum.SIC_CODE.getLocator());
        numberOfLocation=new Input(NewLeadPageInputLocatorsEnum.NUMBER_OF_LOCATION.getLocator());

        salutation=new DropDown(NewLeadPageEnumDropDownLocators.SALUTATION);
        leadSource=new DropDown(NewLeadPageEnumDropDownLocators.LEAD_SOURCE);
        industry=new DropDown(NewLeadPageEnumDropDownLocators.INDUSTRY);
        leadStatus=new DropDown(NewLeadPageEnumDropDownLocators.LEAD_STATUS);
        rating=new DropDown(NewLeadPageEnumDropDownLocators.RATING);
        productInterest=new DropDown(NewLeadPageEnumDropDownLocators.PRODUCT_INTEREST);
        primary=new DropDown(NewLeadPageEnumDropDownLocators.PRIMARY);

        saveButton=new Button(By.xpath("//button[@class='slds-button slds-button_brand']"));
    }

    @Step("создание нового лида используя данные из json file")
    public LeadPage create(String accountJsonFileName) throws FileNotFoundException{
        NewLead newLead=new NewLeadJsonReader().read(accountJsonFileName);
        phone.fill(newLead.getPhone());
        mobile.fill(newLead.getMobile());
        firstName.fill(newLead.getFirstName());
        lastName.fill(newLead.getLastName());
        company.fill(newLead.getCompany());
        fax.fill(newLead.getFax());
        title.fill(newLead.getTitle());
        email.fill(newLead.getEmail());
        website.fill(newLead.getWebsite());
        annualRevenue.fill(newLead.getAnnualRevenue());
        no_ofEmployees.fill(newLead.getNo_ofEmployees());
        city.fill(newLead.getCity());
        state_Province.fill(newLead.getState_Province());
        zip_PostalCode.fill(newLead.getZip_PostalCode());
        country.fill(newLead.getCountry());
        currentGenerator_s_.fill(newLead.getCurrentGenerator_s_());
        cICCode.fill(newLead.getCICCode());
        numberOfLocation.fill(newLead.getNumberOfLocation());

        salutation.select(newLead.getSalutation());
        leadSource.select(newLead.getLeadSource());
        industry.select(newLead.getIndustry());
        leadStatus.select(newLead.getLeadStatus());
        rating.select(newLead.getRating());
        productInterest.select(newLead.getProductInterest());
        primary.select(newLead.getPrimary());

        saveButton.click();
        return new LeadPage();
    }

}
