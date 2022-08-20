package API.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Lead {
    @SerializedName("Id")
    private String id;
    @SerializedName("LastName")
    private String lastName;
    @SerializedName("FirstName")
    private String firstName;
    @SerializedName("Salutation")
    private String salutation;
    @SerializedName("Name")
    private String name;
    @SerializedName("Title")
    private String title;
    @SerializedName("Company")
    private String company;
    @SerializedName("Email")
    private String email;
}
