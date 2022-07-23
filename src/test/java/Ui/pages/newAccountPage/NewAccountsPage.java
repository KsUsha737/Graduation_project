package Ui.pages.newAccountPage;

import Ui.conctants.enums.NewAccountsPage.NewAccountPageInputLocators;
import Ui.conctants.enums.NewAccountsPage.NewAccountPageEnumDropDownLocators;
import Ui.wrapers.Button;
import Ui.wrapers.Input;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class NewAccountsPage {

    private Input accountName,phone,fax,website,accountNumber,accountSite,tickerSymbol,employees,annualRevenue,
            SICCode,BillingCity,BillingStateProvince,ShippingCity,ShippingStateProvince,BillingZipPostalCode,
            BillingCountry,ShippingZipPostalCode,ShippingCountry,SLASerialNumber,NumberOfLocations;
    NewAccountPageInputLocators nawAccountPageEnum;
    private Button rating;



    @Step("create a new account")
    public void create() {
        accountName=new Input(NewAccountPageInputLocators.ACCOUNT_NAME.getLocator());
        phone=new Input(NewAccountPageInputLocators.PHONE.getLocator());
        fax=new Input(NewAccountPageInputLocators.FAX.getLocator());
        website=new Input(NewAccountPageInputLocators.WEBSITE.getLocator());
        accountNumber=new Input(NewAccountPageInputLocators.ACCOUNT_NUMBER.getLocator());
        accountSite=new Input(NewAccountPageInputLocators.ACCOUNT_SITE.getLocator());
        tickerSymbol=new Input(NewAccountPageInputLocators.TICKER_SYMBOL.getLocator());
        employees= new Input(NewAccountPageInputLocators.EMPLOYEES.getLocator());
        annualRevenue=new Input(NewAccountPageInputLocators.ANNUAL_REVENUE.getLocator());
        SICCode=new Input(NewAccountPageInputLocators.SIC_CODE.getLocator());
        BillingCity=new Input(NewAccountPageInputLocators.BILLING_CITY.getLocator());
        BillingStateProvince=new Input(NewAccountPageInputLocators.BILLING_STATE_PROVINCE.getLocator());
        ShippingCity=new Input(NewAccountPageInputLocators.SHIPPING_CITY.getLocator());
        ShippingStateProvince=new Input(NewAccountPageInputLocators.SHIPPING_STATE_PROVINCE.getLocator());
        BillingZipPostalCode=new Input(NewAccountPageInputLocators.BILLING_ZIP_POSTAL_CODE.getLocator());
        BillingCountry=new Input(NewAccountPageInputLocators.BILLING_COUNTRY.getLocator());
        ShippingZipPostalCode=new Input(NewAccountPageInputLocators.SHIPPING_ZIP_POSTAL_CODE.getLocator());
        ShippingCountry=new Input(NewAccountPageInputLocators.SHIPPING_COUNTRY.getLocator());
        SLASerialNumber=new Input(NewAccountPageInputLocators.SLA_SERIAL_NUMBER.getLocator());
        NumberOfLocations=new Input(NewAccountPageInputLocators.NUMBER_OF_LOCATION.getLocator());
        rating=new Button(NewAccountPageEnumDropDownLocators.RATING.getLocator());
    }


    public void save() {

        $("//button[@class='slds-button slds-button_brand']").click();

    }



}
