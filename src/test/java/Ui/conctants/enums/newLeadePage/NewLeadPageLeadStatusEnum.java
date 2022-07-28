package Ui.conctants.enums.newLeadePage;

/**
 * enum наименований полей дропдауна "LeadStatus" на NewAccountPage
 */
public enum NewLeadPageLeadStatusEnum implements NewLeadPageDropdownEnumInterface{
    NONE("--None--"),
    OPEN_NOT_CONTACTED("Open - Not Contacted"),
    WORKING_CONTACTED("Working - Contacted"),
    CLOSED_CONVERTED("Closed - Converted"),
    CLOSED_NOT_CONVERTED("Closed - Not Converted");

    private String text;

    NewLeadPageLeadStatusEnum(String text){
        this.text=text;

    }
    @Override
    public String toString(){
        return text;
    }
}
