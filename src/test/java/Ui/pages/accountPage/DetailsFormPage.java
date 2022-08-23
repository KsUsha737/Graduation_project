package Ui.pages.accountPage;

import Ui.constants.enums.newAccountPage.NewAccountPageEnumDropDownLocators;
import Ui.constants.enums.newAccountPage.NewAccountPageInputLocators;
import Ui.pages.newAccountPage.DropDown;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import lombok.Getter;
import org.openqa.selenium.By;

@Getter
public class DetailsFormPage {

    private final Input accountName;
    private final Input phone;
    private final Input fax;
    private final Input website;
    private final Input accountNumber;
    private final Input accountSite;
    private final Input tickerSymbol;
    private final Input employees;
    private final Input annualRevenue;
    private final Input sICCode;
    private final Input billingCity;
    private final Input billingStateProvince;
    private final Input shippingCity;
    private final Input shippingStateProvince;
    private final Input billingZipPostalCode;
    private final Input billingCountry;
    private final Input shippingZipPostalCode;
    private final Input shippingCountry;
    private final Input sLASerialNumber;
    private final Input numberOfLocations;

    private final DropDown ratingDropDown;
    private final DropDown typeDropDown;
    private final DropDown ownershipDropDown;
    private final DropDown industryDropDown;
    private final DropDown customer_PriorityDropDown;
    private final DropDown sLADropDown;
    private final DropDown upsell_OpportunityDropDown;
    private final DropDown activeDropDown;

    private final Button saveButton;

    public DetailsFormPage() {
        accountName = new Input(NewAccountPageInputLocators.ACCOUNT_NAME.getLocator());
        phone = new Input(NewAccountPageInputLocators.PHONE.getLocator());
        fax = new Input(NewAccountPageInputLocators.FAX.getLocator());
        website = new Input(NewAccountPageInputLocators.WEBSITE.getLocator());
        accountNumber = new Input(NewAccountPageInputLocators.ACCOUNT_NUMBER.getLocator());
        accountSite = new Input(NewAccountPageInputLocators.ACCOUNT_SITE.getLocator());
        tickerSymbol = new Input(NewAccountPageInputLocators.TICKER_SYMBOL.getLocator());
        employees = new Input(NewAccountPageInputLocators.EMPLOYEES.getLocator());
        annualRevenue = new Input(NewAccountPageInputLocators.ANNUAL_REVENUE.getLocator());
        sICCode = new Input(NewAccountPageInputLocators.SIC_CODE.getLocator());
        billingCity = new Input(NewAccountPageInputLocators.BILLING_CITY.getLocator());
        billingStateProvince = new Input(NewAccountPageInputLocators.BILLING_STATE_PROVINCE.getLocator());
        shippingCity = new Input(NewAccountPageInputLocators.SHIPPING_CITY.getLocator());
        shippingStateProvince = new Input(NewAccountPageInputLocators.SHIPPING_STATE_PROVINCE.getLocator());
        billingZipPostalCode = new Input(NewAccountPageInputLocators.BILLING_ZIP_POSTAL_CODE.getLocator());
        billingCountry = new Input(NewAccountPageInputLocators.BILLING_COUNTRY.getLocator());
        shippingZipPostalCode = new Input(NewAccountPageInputLocators.SHIPPING_ZIP_POSTAL_CODE.getLocator());
        shippingCountry = new Input(NewAccountPageInputLocators.SHIPPING_COUNTRY.getLocator());
        sLASerialNumber = new Input(NewAccountPageInputLocators.SLA_SERIAL_NUMBER.getLocator());
        numberOfLocations = new Input(NewAccountPageInputLocators.NUMBER_OF_LOCATION.getLocator());

        ratingDropDown = new DropDown(NewAccountPageEnumDropDownLocators.RATING);
        typeDropDown = new DropDown(NewAccountPageEnumDropDownLocators.TYPE);
        ownershipDropDown= new DropDown(NewAccountPageEnumDropDownLocators.OWNERSHIP);
        industryDropDown= new DropDown(NewAccountPageEnumDropDownLocators.INDUSTRY);
        customer_PriorityDropDown= new DropDown(NewAccountPageEnumDropDownLocators.CUSTOMER_PRIORITY);
        sLADropDown=new DropDown(NewAccountPageEnumDropDownLocators.SLA);
        upsell_OpportunityDropDown= new DropDown(NewAccountPageEnumDropDownLocators.UPSELL_OPPORTUNITY);
        activeDropDown= new DropDown(NewAccountPageEnumDropDownLocators.ACTIVE);

        saveButton = new Button(By.xpath("//button[@class='slds-button slds-button_brand']"));
    }

    public AccountPageActions back(){
        return new AccountPageActions();
    }

    public AccountPageActions save(){
        saveButton.click();
        return new AccountPageActions();
    }
}