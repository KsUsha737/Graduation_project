package Ui.pages.accountPage.contactsPageInAccountPage;

import Ui.conctants.enums.newContactPageInAccountpage.LeadSourceEnum;
import Ui.conctants.enums.newContactPageInAccountpage.LevelEnum;
import Ui.conctants.enums.newContactPageInAccountpage.SalutationEnum;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class NewContact {
    @Expose
    @SerializedName("Phone")
    private String phone;
    @Expose
    @SerializedName("Home Phone")
    private String homePhone;
    @Expose
    @SerializedName("First Name")
    private String firstName;
    @Expose
    @SerializedName("Last Name")
    private String lastName;
    @Expose
    @SerializedName("Mobile")
    private String mobile;
    @Expose
    @SerializedName("Title")
    private String title;
    @Expose
    @SerializedName("Other Phone")
    private String otherPhone;
    @Expose
    @SerializedName("Department")
    private String department;
    @Expose
    @SerializedName("Fax")
    private String fax;
    @Expose
    @SerializedName("Email")
    private String email;
    @Expose
    @SerializedName("Assistant")
    private String assistant;
    @Expose
    @SerializedName("Asst. Phone")
    private String asst_Phone;
    @Expose
    @SerializedName("Mailing Cit")
    private String mailing_City;
    @Expose
    @SerializedName("Mailing State/Province")
    private String mailing_State_Province;
    @Expose
    @SerializedName("Other City")
    private String other_City;
    @Expose
    @SerializedName("Other State/Province")
    private String other_State_Province;
    @Expose
    @SerializedName("Mailing Zip/Postal Code")
    private String mailing_Zip_Postal_Code;
    @Expose
    @SerializedName("Mailing Country")
    private String mailing_Country;
    @Expose
    @SerializedName("Other Zip/Postal Code")
    private String other_Zip_Postal_Code;
    @Expose
    @SerializedName("Other Country")
    private String other_Country;
    @Expose
    @SerializedName("Languages")
    private String languages;

    @Expose
    @SerializedName("Salutation")
    private SalutationEnum salutation;
    @Expose
    @SerializedName("Lead Source")
    private LeadSourceEnum leadSource;
    @Expose
    @SerializedName("Level")
    private LevelEnum level;

    private String FullName;


}
