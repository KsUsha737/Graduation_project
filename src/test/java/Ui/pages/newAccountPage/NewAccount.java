package Ui.pages.newAccountPage;

import Ui.conctants.enums.NewAccountsPage.NewAccountPageEnumDropDownLocators;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class NewAccount {
    @Expose
    @SerializedName("Account Name")
    String accountName;
    @Expose
    @SerializedName("Phone")
    String phone;
    @Expose
    @SerializedName("Fax")
    String fax;
    @Expose
    @SerializedName("Website")
    String website;
    @Expose
    @SerializedName("Account Number")
    String accountNumber;
    @Expose
    @SerializedName("Account Site")
    String accountSite;
    @Expose
    @SerializedName("Ticker Symbol")
    String tickerSymbol;
    @Expose
    @SerializedName("Employees")
    String employees;
    @Expose
    @SerializedName("Annual Revenue")
    String annualRevenue;
    @Expose
    @SerializedName("SIC Code")
    String SICCode;
    @Expose
    @SerializedName("Billing City")
    String BillingCity;
    @Expose
    @SerializedName("Billing State/Province")
    String BillingStateProvince;
    @Expose
    @SerializedName("Shipping City")
    String ShippingCity;
    @Expose
    @SerializedName("Shipping State/Province")
    String ShippingStateProvince;
    @Expose
    @SerializedName("Billing Zip/Postal Code")
    String BillingZipPostalCode;
    @Expose
    @SerializedName("Billing Country")
    String BillingCountry;
    @Expose
    @SerializedName("Shipping Zip/Postal Code")
    String ShippingZipPostalCode;
    @Expose
    @SerializedName("Shipping Country")
    String ShippingCountry;
    @Expose
    @SerializedName("SLA Serial Number")
    String SLASerialNumber;
    @Expose
    @SerializedName("Number of Locations")
    String NumberOfLocations;
    @Expose
    NewAccountPageEnumDropDownLocators rating;
    @Expose
    NewAccountPageEnumDropDownLocators type;
    @Expose
    NewAccountPageEnumDropDownLocators ownership;
    @Expose
    NewAccountPageEnumDropDownLocators industry;
    @Expose
    NewAccountPageEnumDropDownLocators customerPriority;
    @Expose
    NewAccountPageEnumDropDownLocators sLA;
    @Expose
    NewAccountPageEnumDropDownLocators upsellOpportunity;
    @Expose
    NewAccountPageEnumDropDownLocators active;
}
