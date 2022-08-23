package Ui.constants.enums.newLeadePage;

/**
 *enum names of dropdown fields "LeadSource"
 */
public enum NewLeadPageLeadSourceEnum implements NewLeadPageDropdownEnumInterface {

    NONE("--None--"),
    WEB("Web"),
    PHONE_INDUSTRY("Phone Inquiry"),
    PARTNER_REFERRAL("Partner Referral"),
    PURCHASED_LIST("Purchased List"),
    OTHER("Other");

    private String text;

    NewLeadPageLeadSourceEnum(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
