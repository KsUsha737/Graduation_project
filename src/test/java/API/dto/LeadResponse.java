package API.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LeadResponse {
    @Expose
    @SerializedName("attributes")
    private LeadInfoAttributes attributes;
    @Expose
    @SerializedName("LastName")
    private String lastName;
    @Expose
    @SerializedName("FirstName")
    private String firstName;
    @Expose
    @SerializedName("Salutation")
    private String salutation;
    @Expose
    @SerializedName("Name")
    private String name;
    @Expose
    @SerializedName("Title")
    private String title;
    @Expose
    @SerializedName("Company")
    private String company;
    @Expose
    @SerializedName("Street")
    private String street;
    @Expose
    @SerializedName("City")
    private String city;
    @Expose
    @SerializedName("State")
    private String state;
    @Expose
    @SerializedName("PostalCode")
    private String postalCode;
    @Expose
    @SerializedName("Country")
    private String country;
    @Expose
    @SerializedName("Latitude")
    private String latitude;
    @Expose
    @SerializedName("Longitude")
    private String longitude;
    @Expose
    @SerializedName("GeocodeAccuracy")
    private String geocodeAccuracy;
    @Expose
    @SerializedName("Address")
    private String address;
    @Expose
    @SerializedName("Phone")
    private String phone;
    @Expose
    @SerializedName("MobilePhone")
    private String mobilePhone;
    @Expose
    @SerializedName("Fax")
    private String fax;
    @Expose
    @SerializedName("Email")
    private String email;
    @Expose
    @SerializedName("Website")
    private String website;
}
