package Ui.pages.newAccountPage;

import Ui.constants.enums.newAccountPage.*;
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
    private String accountName;
    @Expose
    @SerializedName("Phone")
    private String phone;
    @Expose
    @SerializedName("Fax")
    private String fax;
    @Expose
    @SerializedName("Website")
    private String website;
    @Expose
    @SerializedName("Account Number")
    private String accountNumber;
    @Expose
    @SerializedName("Account Site")
    private String accountSite;
    @Expose
    @SerializedName("Ticker Symbol")
    private String tickerSymbol;
    @Expose
    @SerializedName("Employees")
    private String employees;
    @Expose
    @SerializedName("Annual Revenue")
    private String annualRevenue;
    @Expose
    @SerializedName("SIC Code")
    private String sICCode;
    @Expose
    @SerializedName("Billing City")
    private String billingCity;
    @Expose
    @SerializedName("Billing State/Province")
    private String billingStateProvince;
    @Expose
    @SerializedName("Shipping City")
    private String shippingCity;
    @Expose
    @SerializedName("Shipping State/Province")
    private String shippingStateProvince;
    @Expose
    @SerializedName("Billing Zip/Postal Code")
    private String billingZipPostalCode;
    @Expose
    @SerializedName("Billing Country")
    private String billingCountry;
    @Expose
    @SerializedName("Shipping Zip/Postal Code")
    private String shippingZipPostalCode;
    @Expose
    @SerializedName("Shipping Country")
    private String shippingCountry;
    @Expose
    @SerializedName("SLA Serial Number")
    private String sLASerialNumber;
    @Expose
    @SerializedName("Number of Locations")
    private String numberOfLocations;
    @Expose
    @SerializedName("Rating")
    private NewAccountPageRatingEnum rating;
    @Expose
    @SerializedName("Type")
    private NewAccountPageTypeEnum type;
    @Expose
    @SerializedName("Ownership")
    private NewAccountPageOwnershipEnum ownership;
    @Expose
    @SerializedName("Industry")
    private NewAccountPageIndustryEnum industry;
    @Expose
    @SerializedName("Customer Priority")
    private NewAccountPageCustomerPriorityEnum customerPriority;
    @Expose
    @SerializedName("SLA")
    private NewAccountPageSlaEnum sLA;
    @Expose
    @SerializedName("Upsell Opportunity")
    private NewAccountPageUpsellOpportunityEnum upsellOpportunity;
    @Expose
    @SerializedName("Active")
    private NewAccountPageActiveEnum active;
}
