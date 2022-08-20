package API.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LeadInfo {
    @Expose
    @SerializedName("attributes")
    private LeadInfoAttributes attributes;
    @Expose
    @SerializedName("Id")
    private String id;
    @Expose
    @SerializedName("Name")
    private String name;
}
