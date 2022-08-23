package Ui.constants.enums.newContactPageInAccountpage;

/**
 * enum names of dropdown fields "LeadSource"
 */
public enum LeadSourceEnum implements PageDropDownEnumInterface {

    NONE("--None--"),
    WEB("Web"),
    PHONE_INQUIRY ("Phone Inquiry"),
    PARTNER_REFERRAL ("Partner Referral"),
    PURCHASED_LIST ("Purchased List"),
    OTHER ("Other");

    private String text;

    LeadSourceEnum (String text){
        this.text=text;
    }

    @Override
    public String toString() {
        return text;
    }
}
