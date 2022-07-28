package Ui.conctants.enums.newLeadePage;

/**
 * enum наименований полей дропдауна "LeadSource" на NewAccountPage
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
