package Ui.pages.newAccountPage;

import Ui.conctants.enums.newAccountPage.*;
import Ui.pages.AccountPage;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class NewAccountPage {

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

    public NewAccountPage() {
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

    @Step("создание нового аккаунта задавая значения")
    public AccountPage create(NewAccount newAccount) {
        accountName.fill(newAccount.getAccountName());
        phone.fill(newAccount.getPhone());
        fax.fill(newAccount.getFax());
        website.fill(newAccount.getWebsite());
        accountNumber.fill(newAccount.getAccountNumber());
        accountSite.fill(newAccount.getAccountSite());
        tickerSymbol.fill(newAccount.getTickerSymbol());
        employees.fill(newAccount.getEmployees());
        annualRevenue.fill(newAccount.getAnnualRevenue());
        sICCode.fill(newAccount.getSICCode());
        billingCity.fill(newAccount.getBillingCity());
        billingStateProvince.fill(newAccount.getBillingStateProvince());
        shippingCity.fill(newAccount.getShippingCity());
        shippingStateProvince.fill(newAccount.getBillingStateProvince());
        billingZipPostalCode.fill(newAccount.getBillingZipPostalCode());
        billingCountry.fill(newAccount.getBillingCountry());
        shippingZipPostalCode.fill(newAccount.getBillingZipPostalCode());
        shippingCountry.fill(newAccount.getShippingCity());
        sLASerialNumber.fill(newAccount.getSLASerialNumber());
        numberOfLocations.fill(newAccount.getNumberOfLocations());

        ratingDropDown.select(newAccount.getRating());
        typeDropDown.select(newAccount.getType());
        ownershipDropDown.select(newAccount.getOwnership());
        industryDropDown.select(newAccount.getIndustry());
        customer_PriorityDropDown.select(newAccount.getCustomerPriority());
        sLADropDown.select(newAccount.getSLA());
        upsell_OpportunityDropDown.select(newAccount.getUpsellOpportunity());
        activeDropDown.select(newAccount.getActive());

        saveButton.click();
        return new AccountPage();
    }

    @Step("создание нового аккаунта используя данные из json file")
    public AccountPage create(String accountJsonFileName) throws FileNotFoundException {
        NewAccount newAccount = new NewAccountJsonReader().read(accountJsonFileName);
        accountName.fill(newAccount.getAccountName());
        phone.fill(newAccount.getPhone());
        fax.fill(newAccount.getFax());
        website.fill(newAccount.getWebsite());
        accountNumber.fill(newAccount.getAccountNumber());
        accountSite.fill(newAccount.getAccountSite());
        tickerSymbol.fill(newAccount.getTickerSymbol());
        employees.fill(newAccount.getEmployees());
        annualRevenue.fill(newAccount.getAnnualRevenue());
        sICCode.fill(newAccount.getSICCode());
        billingCity.fill(newAccount.getBillingCity());
        billingStateProvince.fill(newAccount.getBillingStateProvince());
        shippingCity.fill(newAccount.getShippingCity());
        shippingStateProvince.fill(newAccount.getBillingStateProvince());
        billingZipPostalCode.fill(newAccount.getBillingZipPostalCode());
        billingCountry.fill(newAccount.getBillingCountry());
        shippingZipPostalCode.fill(newAccount.getBillingZipPostalCode());
        shippingCountry.fill(newAccount.getShippingCity());
        sLASerialNumber.fill(newAccount.getSLASerialNumber());
        numberOfLocations.fill(newAccount.getNumberOfLocations());

        ratingDropDown.select(newAccount.getRating());
        typeDropDown.select(newAccount.getType());
        ownershipDropDown.select(newAccount.getOwnership());
        industryDropDown.select(newAccount.getIndustry());
        customer_PriorityDropDown.select(newAccount.getCustomerPriority());
        sLADropDown.select(newAccount.getSLA());
        upsell_OpportunityDropDown.select(newAccount.getUpsellOpportunity());
        activeDropDown.select(newAccount.getActive());

        saveButton.click();
        return new AccountPage();
    }

}
