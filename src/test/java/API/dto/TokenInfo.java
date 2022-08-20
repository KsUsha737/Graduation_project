package API.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TokenInfo {

    @Expose
    @SerializedName("access_token")
    private String accessToken;
    @Expose
    @SerializedName("instance_url")
    private String instanceUrl;
    @Expose
    @SerializedName("id")
    private String id;
    @Expose
    @SerializedName("token_type")
    private String tokenType;
    @Expose
    @SerializedName("issued_at")
    private String issuedAt;
    @Expose
    @SerializedName("signature")
    private String signature;
}
