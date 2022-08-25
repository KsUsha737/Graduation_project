package API.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class LeadsList {
    @Expose
    @SerializedName("recentItems")
    private List<LeadInfo> leadInfoList;

    public LeadInfo findByLeadName(String leadName) {
        for (LeadInfo item : leadInfoList) {
            if (item.getName().equals(leadName)) {
                return item;
            }
        }
        return null;
    }
}
