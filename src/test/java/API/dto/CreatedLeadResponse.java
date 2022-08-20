package API.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreatedLeadResponse {
    @Expose
    @SerializedName("id")
    private String id;
    @Expose
    @SerializedName("success")
    private boolean success;
}
