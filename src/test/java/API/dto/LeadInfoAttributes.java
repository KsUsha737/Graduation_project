package API.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LeadInfoAttributes {
    @Expose
    @SerializedName("type")
    private String type;
    @Expose
    @SerializedName("url")
    private String url;
}
