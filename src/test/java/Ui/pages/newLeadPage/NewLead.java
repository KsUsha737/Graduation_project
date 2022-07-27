package Ui.pages.newLeadPage;

import Ui.conctants.enums.newLeadePage.*;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class NewLead {
    @Expose
    @SerializedName("Phone")
    private String phone;
    @Expose
    @SerializedName("Mobile")
    private String mobile;
    @Expose
    @SerializedName("First Name")
    private String firstName;
    @Expose
    @SerializedName("Last Name")
    private String lastName;
    @Expose
    @SerializedName("Company")
    private String company;
    @Expose
    @SerializedName("Fax")
    private String fax;
    @Expose
    @SerializedName("Title")
    private String title;
    @Expose
    @SerializedName("Email")
    private String email;
    @Expose
    @SerializedName("Website")
    private String website;
    @Expose
    @SerializedName("Annual Revenue")
    private String annualRevenue;
    @Expose
    @SerializedName("No. of Employees")
    private String no_ofEmployees;
    @Expose
    @SerializedName("City")
    private String city;
    @Expose
    @SerializedName("State/Province")
    private String state_Province;
    @Expose
    @SerializedName("Zip/Postal Code")
    private String zip_PostalCode;
    @Expose
    @SerializedName("Country")
    private String country;
    @Expose
    @SerializedName("Current Generator(s)")
    private String currentGenerator_s_;
    @Expose
    @SerializedName("SIC Code")
    private String cICCode;
    @Expose
    @SerializedName("Number of Location")
    private String numberOfLocation;
    @Expose
    @SerializedName("Salutation")
    private NewLeadPageSalutationEnum salutation;
    @Expose
    @SerializedName("Lead Source")
    private NewLeadPageLeadSourceEnum leadSource;
    @Expose
    @SerializedName("Industry")
    private NewLeadPageIndustryEnum industry;
    @Expose
    @SerializedName("Lead Status")
    private NewLeadPageLeadStatusEnum leadStatus;
    @Expose
    @SerializedName("Rating")
    private NewLeadPageRatingEnum rating;
    @Expose
    @SerializedName("Product Interest")
    private NewLeadPageProductInterestEnum productInterest;
    @Expose
    @SerializedName("Primary")
    private NewLeadPagePrimaryEnum primary;




}
